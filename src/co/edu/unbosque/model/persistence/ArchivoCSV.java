package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.Persona;

public class ArchivoCSV {

	public static final String SEPARADOR = ";";

	public ArrayList cargarArchivo(ArrayList<Persona> personas) {
		BufferedReader bufferLectura = null;
		String genero = "";
		try {
			bufferLectura = new BufferedReader(new FileReader("data/Personas1.csv"));
			String linea = bufferLectura.readLine();
			while (linea != null) {
				String[] campos = linea.split(SEPARADOR);
				if (campos[15].equals("Disponible")) {
					if (campos[4].equals("M")) {
						genero = "Femenino";
					} else {
						genero = "Masculino";
					}
					Persona encontrado = null;
					if (!personas.isEmpty()) {
						for (int i = 0; i < personas.size(); i++) {
							if (personas.get(i).getAlias().equals(campos[5].toString())) {
								encontrado = personas.get(i);
							}
						}
					}
					if(encontrado == null) {
						personas.add(new Persona(Integer.parseInt(campos[0]), campos[1].toString(),
								campos[2].toString() + " " + campos[3].toString(), genero, campos[5].toString(),
								campos[6].toString(), campos[7].toString(), campos[8].toString(),
								Integer.parseInt(campos[9]),
								(!campos[10].isEmpty()) ? Double.parseDouble(campos[10]) : -1, campos[11],
								Integer.parseInt(campos[12]), Integer.parseInt(campos[13]),
								Integer.parseInt(campos[14]), campos[15]));
					}
				}
				linea = bufferLectura.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
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
