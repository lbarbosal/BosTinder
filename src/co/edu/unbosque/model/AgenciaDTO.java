package co.edu.unbosque.model;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.ArchivoCSV;
import co.edu.unbosque.model.persistence.PersonaDAO;

/**
 * Clase DTO es la encargada de transferir los datos de la clase personaDAO.
 * 
 * @author: Grupo 3
 * @version: 06/06/2021
 * 
 */

public class AgenciaDTO {
	private ArrayList<Persona> personas;
	private PersonaDAO personaDAO;
	private File file = new File("data/informacion.dat");
	private Archivo archivo;
	private ArchivoCSV a;
	
	/**
	 * Constructor de la clase AgenciaDTO, asigna valores a los atributos de la clase.
	 */
	
	public AgenciaDTO() {
		personas = new ArrayList<Persona>();
		archivo = new Archivo(file);
		personaDAO = new PersonaDAO(archivo);
		personas = archivo.leerArchivo(file);
		a = new ArchivoCSV();
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}

	public PersonaDAO getPersonaDAO() {
		return personaDAO;
	}

	public void setPersonaDAO(PersonaDAO personaDAO) {
		this.personaDAO = personaDAO;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public Archivo getArchivo() {
		return archivo;
	}

	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}

	public ArchivoCSV getA() {
		return a;
	}

	public void setA(ArchivoCSV a) {
		this.a = a;
	}
}
