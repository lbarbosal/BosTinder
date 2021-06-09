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
				//archivo.escribirEnArchivo(personas, file);
				resp = true;
			}
			return resp;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return resp;
	}
	
	public boolean modificarPersona(int id, String nombre, String apellido, String genero, String alias, String contrasena, String correo, String fecha, int edad, double ingresos, String divorcios, String estado, ArrayList<Persona> personas, File file) {

		Persona p = buscarPersona(alias, personas);
		Persona p2 = p;
		if (p2 == null && p2.getEdad() < 18) {
			return false;
		}
		p2.setNombre(nombre);
		p2.setApellido(apellido);
		p2.setGenero(genero);
		personas.remove(p);
		personas.add(p2);
		archivo.escribirEnArchivo(personas, file);
		return true;
	}

	public boolean agregarLR(String alias, ArrayList<Persona> personas, File file){ // Dar like a una persona x
		Persona p = buscarPersona(alias, personas);
		if(p != null) {
			p.setNumLR(p.getNumLR()+1);
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
		int indexAle = (int) Math.floor(Math.random()*personas.size());
		return personas.get(indexAle);	
	}
	
	public ArrayList<Persona> topUsuarios(ArrayList<Persona> personas, String tipoBus, String genero) {
		ArrayList<Persona> listaTop = new ArrayList<Persona>();
		personas = ordenamientoIns(personas, tipoBus);
		Persona p = null;
		for (int i = 0; i < personas.size(); i++) {
			if(listaTop.size() <= 10) {
				switch (genero) {
				case "M":
					if (personas.get(i).getGenero().equals("M")) {
						listaTop.add(personas.get(i));
					}
					break;
				case "F":
					if (personas.get(i).getGenero().equals("F")) {
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
				
				if(tipoBus.equals("numLR")) {
					f = personas.get(j-1).getNumLR() < actual.getNumLR();
				} else if(tipoBus.equals("ingresos")) {
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