package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.Persona;

public class ArchivoCSV {

	public static final String SEPARADOR = ";";

	/**
	 * Metodo para cargar el archivo
	 * <b>pre</b> Se deben tener el archivo plano y demas informacion de las personas<br>
	 * <b>pos</b> Carga al programa el archivo<br>
	 * 
	 * @return personas Muestra las informacion en la consola
	 */
	public ArrayList cargarArchivo() {
		BufferedReader bufferLectura = null;
		ArrayList<Persona> personas = new ArrayList();
		try {
			// Abrir el .csv en buffer de lectura
			bufferLectura = new BufferedReader(new FileReader("data/Personas.csv"));

			// Leer una linea del archivo
			String linea = bufferLectura.readLine();

			while (linea != null) {
				// Sepapar la linea leída con el separador definido previamente
				String[] campos = linea.split(SEPARADOR);
				personas.add(new Persona(Integer.valueOf(campos[0]),
						 				campos[1],
						 				campos[2] + " " + campos[3],
						 				campos[4],
						 				campos[5],
						 				campos[6],
						 				campos[7],
						 				campos[8],
						 				Integer.valueOf(campos[9]),
						 				Double.parseDouble(campos[10]),
						 				campos[11],
						 				Integer.valueOf(campos[12]),
						 				Integer.valueOf(campos[13]),
						 				Integer.valueOf(campos[14]),
						 				campos[15]));

				// Volver a leer otra línea del fichero
				linea = bufferLectura.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// Cierro el buffer de lectura
			if (bufferLectura != null) {
				try {
					bufferLectura.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return personas;
	}
	
}
