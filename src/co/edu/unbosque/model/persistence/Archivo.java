package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.Persona;

public class Archivo {
	
	public ObjectInputStream entrada;
	public ObjectOutputStream salida;

	/**
	 * Metodo Constructor
	 * @param archivo Archivo plano
	 */
	public Archivo(File archivo) {
		if (archivo.exists()) {
			System.out.println("El archivo ya existe");
		} else {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Método el cual escribe en el archivo
	 * <b>pre</b> Se necesita un archivo txt y la lista de personas<br>
	 * <b>pos</b> Escribe dentro del archivo<br>
	 * 
	 * @param personas Lista de personas
	 * @param archivo Archivo plano
	 */
	public void escribirEnArchivo(ArrayList<Persona> personas, File archivo) {
		try {
			System.out.println(archivo);
			salida = new ObjectOutputStream(new FileOutputStream(archivo));
			salida.writeObject(personas);
			salida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Metodo de ArrayList el cual lee el archivo 
	 * <b>pre</b> Se necesita un archivo txt y la lista de personas<br>
	 * <b>pos</b> Lee directamente el archivo<br>
	 * 
	 * @param archivo Archivo plano
	 * @return personas la nueva lista de personas
	 */
	public ArrayList<Persona> leerArchivo(File archivo) {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		if (archivo.length() != 0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(archivo));
				personas = (ArrayList<Persona>) entrada.readObject();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return personas;
	}
	
	public ObjectInputStream getEntrada() {
		return entrada;
	}

	public void setEntrada(ObjectInputStream entrada) {
		this.entrada = entrada;
	}

	public ObjectOutputStream getSalida() {
		return salida;
	}

	public void setSalida(ObjectOutputStream salida) {
		this.salida = salida;
	}

}
