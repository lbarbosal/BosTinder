package co.edu.unbosque.test;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import co.edu.unbosque.model.Persona;
import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.PersonaDAO;
import junit.framework.TestCase;

public class PersonaDAOTest extends TestCase{
	
	PersonaDAO persona;
	Archivo archivo;
	File file = new File("dataTest/informacionTest.dat");
	ArrayList<Persona> lista;
	Persona persona_1;
	Persona persona_2;
	Persona persona_3;
	Persona persona_4;
	
	private void setupStage() {
		file.delete();
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		archivo = new Archivo(file);
		lista = archivo.leerArchivo(file);
		System.out.println(lista.size());
		persona = new PersonaDAO(archivo);
		
		persona_1 = new Persona(1, 
								"Nombre de prueba 1", 
								"Apellido prueba 1", 
								"F", 
								"Alias1", 
								"123", 
								"alias1@gmail.com", 
								"25-09-1997",
								23,
								1000000,
								"0", 
								0,
								0,
								0,
								"Soltero",
								"1,73");
		
		persona_2 = new Persona(2, 
								"Nombre de prueba 2", 
								"Apellido prueba 2", 
								"M", 
								"Alias2", 
								"123", 
								"alias2@gmail.com", 
								"19-02-1996",
								25,
								2000000,
								"0", 
								0,
								0,
								0,
								"Soltero",
								"1,60");
		
		persona_3 = new Persona(3, 
								"Nombre de prueba 3", 
								"Apellido prueba 3", 
								"M", 
								"Alias3", 
								"123", 
								"alias3@gmail.com", 
								"04-08-1998",
								23,
								3000000,
								"0", 
								0,
								0,
								0,
								"Soltero",
								"1,70");
		
		persona_4 = new Persona(4, 
								"Nombre de prueba 4", 
								"Apellido prueba 4", 
								"M", 
								"Alias2", 
								"123", 
								"alias4@gmail.com", 
								"09-11-1998",
								23,
								4000000,
								"0", 
								0,
								0,
								0,
								"Soltero",
								"1,55");
		
		lista.add(persona_1);
		lista.add(persona_2);
	}
	
	public void testPersonaDAO() {
		setupStage();
		assertEquals("La cantidad de personas debe ser 2", 2, lista.size());
	}
	
	public void testIniSesion() {
		setupStage();
		assertNotNull("Debió iniciar sesión la persona", persona.iniSesion(persona_1.getAlias(), 
																		   persona_1.getContrasena(), 
																		   lista));
		assertNull("No debió iniciar sesión la persona", persona.iniSesion(persona_2.getAlias(), 
																		   "1111", 
																		   lista));
	}
	
	public void testBuscarPersona() {
		setupStage();
		assertNotNull("Debió encontrar la persona", persona.buscarPersona(persona_1.getAlias(), lista));
		assertNull("No debió encontrar la pesona", persona.buscarPersona(persona_3.getAlias(), lista));
	}
	
	public void testAgregarPersona() {
		setupStage();
		assertTrue("Se debió agregar la persona", persona.agregarPersona(persona_3.getId(),
																		 persona_3.getNombre(), 
																		 persona_3.getApellido(), 
																		 persona_3.getGenero(), 
																		 persona_3.getAlias(), 
																		 persona_3.getContrasena(), 
																		 persona_3.getCorreo(), 
																		 persona_3.getFecha(), 
																		 persona_3.getEdad(), 
																		 persona_3.getIngresos(), 
																		 persona_3.getDivorcios(), 
																		 persona_3.getEstado(), 
																		 persona_3.getEstatura(), 
																		 lista,
																		 file));
		
		assertFalse("No se debió agregar la persona", persona.agregarPersona(persona_4.getId(),
																			 persona_4.getNombre(), 
																			 persona_4.getApellido(), 
																			 persona_4.getGenero(), 
																			 persona_4.getAlias(), 
																			 persona_4.getContrasena(), 
																			 persona_4.getCorreo(), 
																			 persona_4.getFecha(), 
																			 persona_4.getEdad(), 
																			 persona_4.getIngresos(), 
																			 persona_4.getDivorcios(), 
																			 persona_4.getEstado(), 
																			 persona_4.getEstatura(), 
																			 lista,
																			 file));
		
	}
	
	public void testCalcularEdad() {
		setupStage();
		assertEquals("La edad calculada debe ser 24", persona_1.getEdad(), persona.calcularEdad(persona_1.getFecha()));
	}
	
	public void testEliminarPersona() {
		setupStage();
		assertTrue("Se debió eliminar la persona", persona.eliminarPersona(persona_1.getAlias(), lista, file));
		assertFalse("No se debió eliminar la persona", persona.eliminarPersona(persona_3.getAlias(), lista, file));
	}

}
