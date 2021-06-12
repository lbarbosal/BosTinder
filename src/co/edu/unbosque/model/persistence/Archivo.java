package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

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
	 * Método de ArrayList el cual lee el archivo 
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
	
	/**
	 * Método que escribe en un PDF las estadísticas
	 * 
	 * @param ruta          				Es la ruta para guardar el pdf. ruta != null, ruta != " "
	 * @param nombre        				Es el nombre de la persona. nombre != null, nombre != " "
	 * @param nombreArch    				Es el nombre con el que se va a guardar el archivo PDF. nombreArch != null, nombreArch != " "
	 * @param media         				Es la media del top 10 de usuarios por like o ingresos. media != null, media != " " 
	 * @param moda          				Es la moda del top de usuarios por like o ingresos. moda != null, moda != " "
	 * @param mediana       				Es la mediana del top de usuarios por like o ingresos. mediana != null, media != " "
	 * @throws IOException  Excepction 		Se genera una excepción por si ya existe el archivo. 
	 */
	public void escribirPDF(String ruta, String nombre, String nombreArch, double media, double moda, double mediana) throws IOException {
		Date fecha = new Date();
		LocalDate ahoraActual = LocalDate.now();
		try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage(PDRectangle.A6);
            document.addPage(page);

            PDPageContentStream contentStream = new PDPageContentStream(document, page);

            // Text
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_BOLD, 32);
            contentStream.newLineAtOffset( 20, page.getMediaBox().getHeight() - 52);
            contentStream.showText("Estadísticas");
            contentStream.endText();
            
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_BOLD, 20);
            contentStream.newLineAtOffset( 20, page.getMediaBox().getHeight() - 90);
            contentStream.showText("Media: " + media);
            contentStream.endText();
            
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_BOLD, 20);
            contentStream.newLineAtOffset( 20, page.getMediaBox().getHeight() - 110);
            contentStream.showText("Moda: " + moda);
            contentStream.endText();
            
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_BOLD, 20);
            contentStream.newLineAtOffset( 20, page.getMediaBox().getHeight() - 130);
            contentStream.showText("Mediana: " + mediana);
            contentStream.endText();
            
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_BOLD, 14);
            contentStream.newLineAtOffset( 140, page.getMediaBox().getHeight() - 150);
            contentStream.showText("Fecha actual: " +  ahoraActual); 
            contentStream.endText();

            // Image
            PDImageXObject image = PDImageXObject.createFromFile(ruta + nombre,document );
            contentStream.drawImage(image, 25,90, image.getWidth() / 2, image.getHeight() / 2); 

            contentStream.close();

            document.save("data/" + nombreArch);
        }
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
