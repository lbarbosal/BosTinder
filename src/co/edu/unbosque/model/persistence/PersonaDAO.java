package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import co.edu.unbosque.model.Persona;

/**
 * Clase PersonaDAO Se implementa el serializable
 * 
 * @author Grupo 3
 * @version 12/06/2021
 */
public class PersonaDAO {
	
	public Archivo archivo;
	
	/**
	 * Método constructor
	 */
	public PersonaDAO() {
	
	}
	
	/**
	 * Método para el archivo
	 * 
	 * @param archivo Archivo Archivo plano
	 */
	public PersonaDAO(Archivo archivo) {
		super();
		this.archivo = archivo;
	}
	
	/**
	 * Método para validar el usuario y la contraseña de usuarios
	 * 
	 * @param alias			Es el alias de la persona para el inicio de sesión, debe ser único. alias != null, alias != ""
	 * @param contrasena    Es la contraseña de la persona para el inicio de sesión. alias != null, alias != "" 
	 * @param personas		Son los usuarios. personas != null, personas != " "
	 * @return null
	 */
	public Persona iniSesion(String alias, String contrasena,  ArrayList<Persona> personas) {
		Persona p = buscarPersona(alias, personas);
		if(p != null) {
			if(p.getContrasena().equals(contrasena) && p.getAlias().equals(alias)) {  // la verificación del alias creo que sobra
				return p;
			}
		}
		 return null;
	}
	
	/**
	 * Método para buscar personas
	 * 
	 * @param alias			Es el alias de la persona para el inicio de sesión, debe ser único. alias != null, alias != ""
	 * @param personas  	Son los usuarios. personas != null, personas != " "
	 * @return encontrado
	 */
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
	
	/**
	 * 
	 * @param id			Es el identificador de registro de la persona.
	 * @param nombre        Es el nombre de la persona. nombre != null, nombre != " "
	 * @param apellido      Es el apellido de la persona. apellido != null, apellido != " "
	 * @param genero		Es el género de la persona, los posibles valores son: Femenino, masculino. genero != null, genero != " "
	 * @param alias			Es el alias de la persona para el inicio de sesión, debe ser único. alias != null, alias != ""
	 * @param contrasena	Es la contraseña de la persona para el inicio de sesión. alias != null, alias != ""
	 * @param correo		Es el correo del usuario. correo != null, correo != ""
	 * @param fecha			Es la fecha de nacimiento de la persona, debe tener un formato dd-MM-yyyy. fecha != null, fecha != " "
	 * @param edad			Es la edad de la persona, se calcula a partir de la fecha de nacimiento, debe ser numérico.
	 * @param ingresos		Son los ingresos de la persona, es obligatorio cuando el género es masculino, debe ser en decimales, el valor por defecto es -1.0.
	 * @param divorcios		Indica si la persona tiene divorcios, es obligatorio cuando el género femenino, los posibles valores son en SI, NO. Para en género masculino el valor por defecto es: No Aplica.
	 * @param estado		Es el estado de la persona, los posibles valores son: disponibles, no disponibles. Si la persona selecciona no disponible, no se puede registrar en BosTinder.
	 * @param estatura		Es la estatura de cada persona . estatura != null, estatura != " "
	 * @param personas		Son los usuarios. personas != null, personas != " "
	 * @param file			Es donde se van a agregar las personas
	 * @return
	 */
	public boolean agregarPersona(int id, String nombre, String apellido, String genero, String alias, String contrasena, String correo, String fecha, int edad, double ingresos, String divorcios, String estado, String estatura ,ArrayList<Persona> personas, File file) {
		Persona p = new Persona(id, nombre, apellido, genero, alias, contrasena, correo, fecha, edad ,ingresos, divorcios, 0, 0, 0, estado);		
		if (buscarPersona(alias, personas) == null) {
			personas.add(p);
			archivo.escribirEnArchivo(personas, file);
			return true;
		} 
		return false;
	}
	
	/**
	 * 
	 * Método para calcular la edad desde la fecha de nacimiento
	 * 
	 * @param date String Es la fecha de nacimiento del ususario. date != null, date != " "
	 * @return edad.getYears()
	 */
	public int calcularEdad(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fechaNacimiento = LocalDate.parse(date, formatter);
		LocalDate ahoraActual = LocalDate.now();
		Period edad = Period.between(fechaNacimiento, ahoraActual);
		return edad.getYears();
	}
	
	/**
	 * Método para eliminar personas
	 * 
	 * @param alias     Es el alias de la persona para el inicio de sesión, debe ser único. alias != null, alias != ""
	 * @param personas  Son los usuarios. personas != null, personas != " "
	 * @param file		Es donde se van a eliminar las personas
	 * @return
	 */
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
	
	/**
	 * Método que modifica los usuarios
	 * 
	 * @param genero    Es el género de la persona, los posibles valores son: Femenino, maculino. genero != null, genero != " "
	 * @param nombre	Es el nombre de la persona. nombre != null, nombre != " "
	 * @param apellido	Es el apellido de la persona. apellido != null, apellido != " "
	 * @param estatura  Es la estatura de cada persona . estatura != null, estatura != " "
	 * @param alias		Es el alias de la persona para el inicio de sesión, debe ser único. alias != null, alias != ""
	 * @param opcional  Es una variable que 
	 * @param estado	Es el estado de la persona, los posibles valores son: disponibles, no disponibles. Si la persona selecciona no disponible, no se puede registrar en BosTinder.
	 * @param personas	Son los usuarios. personas != null, personas != " "
	 * @param file		Es donde se van a eliminar las personas
	 * @return true
	 */
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
	
	/**
	 * Método que agrega los likes recibidos por otros usuarios
	 * 
	 * @param alias     Es el alias de la persona para el inicio de sesión, debe ser único. alias != null, alias != ""
	 * @param personas  Son los usuarios. personas != null, personas != " "
	 * @param file		Es donde se van a eliminar las personas
	 * @return false
	 */
	public boolean agregarLR(String alias, ArrayList<Persona> personas, File file){ // Dar like a una persona x
		Persona p = buscarPersona(alias, personas);
		if(p != null) {
			p.setNumLR(p.getNumLR()+1);
			Persona p2 = p;
			personas.remove(p);
			personas.add(p2);
			archivo.escribirEnArchivo(personas, file);
			return true;
		}
		return false;
	}
	
	/**
	 * Método que agrega los likes que se dan a otros usuarios por otros usuarios
	 * 
	 * @param alias     Es el alias de la persona para el inicio de sesión, debe ser único. alias != null, alias != ""
	 * @param personas  Son los usuarios. personas != null, personas != " "
	 * @param file		Es donde se van a eliminar las personas
	 * @return false
	 */
	public boolean agregarLO(String alias, ArrayList<Persona> personas, File file) {  // información de persona logueada, hace referencia a los like que da la persona logueada
		Persona p = buscarPersona(alias, personas);
		Persona p2 = p;
		if(p != null) {
			p2.setNumLR(p.getNumLR()+1);
			personas.remove(p);
			personas.add(p2);
			archivo.escribirEnArchivo(personas, file);
			return true;
		}
		
		return false;
	}
	
	/**
	 * Método que cambia las personas a la en la vista
	 * 
	 * @param personas Son los usuarios. personas != null, personas != " "
	 * @return personas.get(indexAle)
	 */
	public Persona cambioAleatorio(ArrayList<Persona> personas) {
		System.out.print(personas.size());
		int indexAle = (int) Math.floor(Math.random()*personas.size());
		return personas.get(indexAle);	
	}
	
	/**
	 * Método para obtener el top de usuarios
	 * 
	 * @param personas	Personas Son los usuarios. personas != null, personas != " "
	 * @param tipoBus	Es el tipo de busqueda para las estadisticas. tipobus != null , tipoBus != " "
	 * @param genero	Es el género de la persona, los posibles valores son: Femenino, maculino. genero != null, genero != " "
	 * @return listaTop
	 */
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
	
	/**
	 * Método para ordenar el top
	 * 
	 * @param personas  Personas Son los usuarios. personas != null, personas != " "
	 * @param tipoBus	Es el tipo de busqueda para las estadisticas. tipobus != null , tipoBus != " "
	 * @return personas
	 */
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
	
	/**
	 * Método para ordenar el top 
	 * 
	 * @param personas  Personas Son los usuarios. personas != null, personas != " "
	 * @param tipoBus	Es el tipo de busqueda para las estadisticas. tipobus != null , tipoBus != " "
	 * @param sentido	Es el sentido en el que se debe ordenar el top.
	 * @return personas
	 */
	public ArrayList<Persona> ordenamientoBur(ArrayList<Persona> personas, String tipoBus,String sentido){ // agargar tipo de busqueda
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
					  case "Número De Likes":
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
	
	/**
	 * Método para calcular la media
	 * 
	 * @param personas  Personas Son los usuarios. personas != null, personas != " "
	 * @param tipoBus	Es el tipo de busqueda para las estadisticas. tipobus != null , tipoBus != " "
	 * @param genero    Es el género de la persona, los posibles valores son: Femenino, maculino. genero != null, genero != " "
	 * @return media
	 */
	public double calcMedia(ArrayList<Persona> personas, String tipoBus, String genero) {
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
	
	/**
	 * Método para calcular la mediana
	 * 
	 * @param personas  Personas Son los usuarios. personas != null, personas != " "
	 * @param tipoBus	Es el tipo de busqueda para las estadisticas. tipobus != null , tipoBus != " "
	 * @param genero    Es el género de la persona, los posibles valores son: Femenino, maculino. genero != null, genero != " "
	 * @return mediana
	 */
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
	
	/**
	 * Método para calcular la moda
	 * 
	 * @param personas  Personas Son los usuarios. personas != null, personas != " "
	 * @param tipoBus	Es el tipo de busqueda para las estadisticas. tipobus != null , tipoBus != " "
	 * @param genero    Es el género de la persona, los posibles valores son: Femenino, maculino. genero != null, genero != " "
	 * @return moda
	 */
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
		            if(listaT.get(i).getNumLR()==listaT.get(j).getNumLR())
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