package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import co.edu.unbosque.model.Persona;



public class PersonaDAO {
	
	public Archivo archivo;
	
	public PersonaDAO() {
	
	}
	
	public PersonaDAO(Archivo archivo) {
		super();
		this.archivo = archivo;
	}
	
	public Persona iniSesion(String alias, String contrasena,  ArrayList<Persona> personas) {
		Persona p = buscarPersona(alias, personas);
		if(p != null) {
			if(p.getContrasena().equals(contrasena) && p.getAlias().equals(alias)) {  // la verificación del alias creo que sobra
				return p;
			}
		}
		 return null;
	}
	
	public Persona buscarPersona(String alias, ArrayList<Persona> personas) {
		Persona encontrado = null;

		if (!personas.isEmpty()) {
			for (int i = 0; i < personas.size(); i++) {
				if (personas.get(i).getAlias().equals(alias)) {
					encontrado = personas.get(i);
				}
			}
		}
		return encontrado;
	}
	
	public boolean agregarPersona(int id, String nombre, String apellido, String genero, String alias, String contrasena, String correo, String fecha, int edad, double ingresos, String divorcios, String estado, String estatura ,ArrayList<Persona> personas, File file) {
		Persona p = new Persona(id, nombre, apellido, genero, alias, contrasena, correo, fecha, edad ,ingresos, divorcios, 0, 0, 0, estado);		
		if (buscarPersona(alias, personas) == null) {
			personas.add(p);
			archivo.escribirEnArchivo(personas, file);
			return true;
		} 
		return false;
	}
	
	public int calcularEdad(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fechaNacimiento = LocalDate.parse(date, formatter);
		LocalDate ahoraActual = LocalDate.now();
		Period edad = Period.between(fechaNacimiento, ahoraActual);
		return edad.getYears();
	}
	
	public boolean eliminarPersona(String alias, ArrayList<Persona> personas, File file) {
		boolean resp = false;
		try {
			Persona e = buscarPersona(alias, personas);
			if (e != null) {
				personas.remove(e);
				file.delete();
				file.createNewFile();
				archivo.escribirEnArchivo(personas, file);
				resp = true;
			}
			return resp;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return resp;
	}
	
	public boolean modificarPersona( String genero, String nombre, String apellido,String estatura, String alias,String opcional, String estado, ArrayList<Persona> personas, File file) {

		Persona p = buscarPersona(alias, personas);
		Persona p2 = p;
		if (p2 == null && p2.getEdad() < 18) {
			return false;
		}
		p2.setNombre(nombre);
		p2.setApellido(apellido);
		p2.setEstatura(estatura);
		if(genero.equals("Masculino"))
			p2.setIngresos(Double.parseDouble(opcional));
		else
			p2.setDivorcios(opcional);
		personas.remove(p);
		personas.add(p2);
		archivo.escribirEnArchivo(personas, file);
		return true;
	}

	public boolean agregarLR(String alias, ArrayList<Persona> personas, File file){ // Dar like a una persona x
		Persona p = buscarPersona(alias, personas);
		if(p != null) {
			p.setNumLR(p.getNumLR()+1);
			return true;
		}
		return false;
	}
	
	public boolean agregarLO(String alias, ArrayList<Persona> personas, File file) {  // información de persona logueada, hace referencia a los like que da la persona logueada
		Persona p = buscarPersona(alias, personas);
		Persona p2 = p;
		if(p != null) {
			p.setNumLR(p.getNumLR()+1);
			personas.remove(p2);
			personas.add(p);
		}
		
		return false;
	}
	
	public Persona cambioAleatorio(ArrayList<Persona> personas) {
		int indexAle = (int) Math.floor(Math.random()*personas.size()-1);
		return personas.get(indexAle);	
	}
	
	public ArrayList<Persona> topUsuarios(ArrayList<Persona> personas, String tipoBus, String genero) {
		ArrayList<Persona> listaTop = new ArrayList<Persona>();
		personas = ordenamientoIns(personas, tipoBus);
		for (int i = 0; i < personas.size(); i++) {
			if(listaTop.size() < 10) {
				switch (genero) {
				case "Masculino":
					if (personas.get(i).getGenero().equals("Masculino")) {
						listaTop.add(personas.get(i));
					}
					break;
				case "Femenino":
					if (personas.get(i).getGenero().equals("Femenino")) {
						listaTop.add(personas.get(i));
					}
					break;
				default:
					listaTop.add(personas.get(i));
					break;
				}
			} else {
				break;
			}
		}
		return listaTop;
	}
	
	public ArrayList<Persona> ordenamientoIns(ArrayList<Persona> personas, String tipoBus){ // agargar tipo de busqueda
		int i,j;
		Persona actual;
		for(i=1; i<personas.size();i++) {
			actual = personas.get(i);
			for(j =i; j>0;j--) {
				boolean f = false;
				
				if(tipoBus.equals("Número de likes")) {
					f = personas.get(j-1).getNumLR() < actual.getNumLR();
				} else if(tipoBus.equals("Ingresos")) {
					f = personas.get(j-1).getIngresos() < actual.getIngresos();
				} else {
					f = false;
				}
				
				if(f)
				personas.set(j, personas.get(j-1));
				else
					break;
			}
			personas.set(j, actual);
		}
		return personas;
	}
	public ArrayList<Persona> ordenamientoSel(ArrayList<Persona> personas, String tipoBus,String sentido){ // agargar tipo de busqueda
		int iteracion = 0;
		boolean permutacion = true;
		int actual;
		
		while (permutacion){
			permutacion=false;
			iteracion++;
			boolean f=false;
			for(actual=0; actual <personas.size()-iteracion; actual++) {
				if(sentido.equals("Ascendente"))
					switch (tipoBus) {
					  case "Numero De Likes":
						  f = personas.get(actual).getNumLR()>personas.get(actual+1).getNumLR();
					    break;
					  case "Apellido":
						  int n= personas.get(actual).getApellido().compareTo(personas.get(actual+1).getApellido());
						  f = n>0;
						    break;
					  case "Edad":
						  f = personas.get(actual).getEdad()>personas.get(actual+1).getEdad();
					    break;
					  case "Alias":
						  int h= personas.get(actual).getAlias().compareTo(personas.get(actual+1).getAlias());
						  f = h>0;
						    break;
					  default:
					    break;
					}
					
					else	
						switch (tipoBus) {
						case "Numero De Likes":
							  f = personas.get(actual).getNumLR()<personas.get(actual+1).getNumLR();
						    break;
						  case "Apellido":
							  int n= personas.get(actual).getApellido().compareTo(personas.get(actual+1).getApellido());
							  f = n<0;
							    break;
						  case "Edad":
							  f = personas.get(actual).getEdad()<personas.get(actual+1).getEdad();
						    break;
						  case "Alias":
							  int h= personas.get(actual).getAlias().compareTo(personas.get(actual+1).getAlias());
							  f = h<0;
							    break;
						  default:
						    break;
						}
				if(f) {
					permutacion= true;
					Persona temp = personas.get(actual);
					personas.set(actual, personas.get(actual+1));
					personas.set(actual+1, temp);
				}
			}
		}
		return personas;
	}
	
	
	
	public double calcMEdia(ArrayList<Persona> personas, String tipoBus, String genero) {
		double media = 0;
		int suma = 0;
		ArrayList<Persona> listaT = new ArrayList<Persona>();
		listaT = topUsuarios(personas, tipoBus, genero);
		for (int i = 0; i < listaT.size(); i++) {
			if (tipoBus.equals("Número de likes")) {
				suma += listaT.get(i).getNumLR();
			}else {
				suma += listaT.get(i).getIngresos();
			}
		}
		media = (double) suma / listaT.size();
		return media;
	}

	public double calcMediana(ArrayList<Persona> personas, String tipoBus, String genero) {
		double mediana = 0;
		ArrayList<Persona> listaT = new ArrayList<Persona>();
		listaT = topUsuarios(personas, tipoBus, genero);
		int numPersonas = listaT.size();

		if (tipoBus.equals("Número de likes")) {
			mediana = (listaT.get(4).getNumLR() + listaT.get(5).getNumLR()) / 2;
		} else {
			mediana = (listaT.get(4).getIngresos() + listaT.get(5).getIngresos()) / 2;
		}
		return mediana;
	}
	
	public double calcModa(ArrayList<Persona> personas, String tipoBus, String genero) {
		int maxNumRepeticiones = 0;
		double moda = 0;
		ArrayList<Persona> listaT = new ArrayList<Persona>();
		listaT = topUsuarios(personas, tipoBus, genero);
		for(int i=0; i<listaT.size(); i++)
	    {
	        int numRepeticiones= 0;
	        for(int j=0; j<listaT.size(); j++)
	        {
	        	if (tipoBus.equals("Número de likes")) {
		            if(listaT.get(i).getNumLR()==listaT.get(i).getNumLR())
		            {
		                numRepeticiones++;
		            }   
		            if(numRepeticiones>maxNumRepeticiones)
		            {
		                moda= listaT.get(i).getNumLR();
		                maxNumRepeticiones= numRepeticiones;
		            } 
	        	}else {
	        		if(listaT.get(i).getIngresos()==listaT.get(i).getIngresos())
		            {
		                numRepeticiones++;
		            }   
		            if(numRepeticiones>maxNumRepeticiones)
		            {
		                moda= listaT.get(i).getIngresos();
		                maxNumRepeticiones= numRepeticiones;
		            } 
	        	}
	        }
	    }
		return moda;
	}
	
	public Archivo getArchivo() {
		return archivo;
	}

	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}
}