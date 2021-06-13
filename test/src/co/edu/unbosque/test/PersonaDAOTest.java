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
	Persona persona_5;
	Persona persona_6;
	Persona persona_7;
	Persona persona_8;
	Persona persona_9;
	Persona persona_10;
	Persona persona_11;
	
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
								"Masculino", 
								"Alias1", 
								"123", 
								"alias1@gmail.com", 
								"25-09-1997",
								23,
								1000000,
								"0", 
								5,
								5,
								0,
								"Soltero",
								"1,73");
		
		persona_2 = new Persona(2, 
								"Nombre de prueba 2", 
								"Apellido prueba 2", 
								"Femenino", 
								"Alias2", 
								"123", 
								"alias2@gmail.com", 
								"19-02-1996",
								25,
								2000000,
								"0", 
								9,
								9,
								0,
								"Soltero",
								"1,60");
		
		persona_3 = new Persona(3, 
								"Nombre de prueba 3", 
								"Apellido prueba 3", 
								"Masculino", 
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
								"Femenino", 
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
	
	private void setupStageToSearch() {
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
								"Masculino", 
								"Alias1", 
								"123", 
								"alias1@gmail.com", 
								"25-09-1997",
								23,
								1000000,
								"0", 
								22,
								32,
								0,
								"Soltero",
								"1,73");
		
		persona_2 = new Persona(2, 
								"Nombre de prueba 2", 
								"Apellido prueba 2", 
								"Femenino", 
								"Alias2", 
								"123", 
								"alias2@gmail.com", 
								"19-02-1996",
								25,
								2000000,
								"0", 
								9,
								9,
								0,
								"Soltero",
								"1,60");
		
		persona_3 = new Persona(3, 
								"Nombre de prueba 3", 
								"Apellido prueba 3", 
								"Masculino", 
								"Alias3", 
								"123", 
								"alias3@gmail.com", 
								"04-08-1998",
								23,
								3000000,
								"0", 
								22,
								45,
								0,
								"Soltero",
								"1,70");
		
		persona_4 = new Persona(4, 
								"Nombre de prueba 4", 
								"Apellido prueba 4", 
								"Femenino", 
								"Alias4", 
								"123", 
								"alias4@gmail.com", 
								"09-11-1998",
								23,
								4000000,
								"0", 
								88,
								12,
								0,
								"Soltero",
								"1,55");
		persona_5 = new Persona(5, 
								"Nombre de prueba 5", 
								"Apellido prueba 5", 
								"Femenino", 
								"Alias5", 
								"123", 
								"alias5@gmail.com", 
								"09-11-1998",
								23,
								4000000,
								"0", 
								33,
								54,
								0,
								"Soltero",
								"1,55");
		persona_6 = new Persona(6, 
								"Nombre de prueba 6", 
								"Apellido prueba 6", 
								"Masculino", 
								"Alias6", 
								"123", 
								"alias6@gmail.com", 
								"09-11-1998",
								23,
								4000000,
								"0", 
								143,
								12,
								0,
								"Soltero",
								"1,55");
		persona_7 = new Persona(7, 
								"Nombre de prueba 7", 
								"Apellido prueba 7", 
								"Masculino", 
								"Alias7", 
								"123", 
								"alias7@gmail.com", 
								"09-11-1998",
								23,
								4000000,
								"0", 
								28,
								60,
								0,
								"Soltero",
								"1,55");
		persona_8 = new Persona(8, 
								"Nombre de prueba 8", 
								"Apellido prueba 8", 
								"Masculino", 
								"Alias8", 
								"123", 
								"alias8@gmail.com", 
								"09-11-1998",
								23,
								4000000,
								"0", 
								199,
								122,
								0,
								"Soltero",
								"1,55");
		persona_9 = new Persona(9, 
								"Nombre de prueba 9", 
								"Apellido prueba 9", 
								"Femenino", 
								"Alias9", 
								"123", 
								"alias9@gmail.com", 
								"09-11-1998",
								23,
								4000000,
								"0", 
								92,
								53,
								0,
								"Soltero",
								"1,55");
		persona_10 = new Persona(10, 
								"Nombre de prueba 10", 
								"Apellido prueba 10", 
								"Femenino", 
								"Alias10", 
								"123", 
								"alias10@gmail.com", 
								"09-11-1998",
								23,
								4000000,
								"0", 
								60,
								78,
								0,
								"Soltero",
								"1,55");
		persona_11 = new Persona(11, 
								"Nombre de prueba 11", 
								"Apellido prueba 11", 
								"Femenino", 
								"Alias11", 
								"123", 
								"alias11@gmail.com", 
								"09-11-1998",
								23,
								4000000,
								"0", 
								72,
								77,
								0,
								"Soltero",
								"1,55");
		
		lista.add(persona_1);
		lista.add(persona_2);
		lista.add(persona_3);
		lista.add(persona_4);
		lista.add(persona_5);
		lista.add(persona_6);
		lista.add(persona_7);
		lista.add(persona_8);
		lista.add(persona_9);
		lista.add(persona_10);
		lista.add(persona_11);
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
	
	public void testModificarPersona() {
		setupStage();
		assertTrue("Se debió modificar la persona", persona.modificarPersona("Masculino", "Nombre prueba 1!", "Apellido prueba 1!", "1,77", persona_1.getAlias(), "3400000", "Soltero", lista, file));
		assertFalse("No se debió modificar la persona", persona.modificarPersona("Masculino", "Nombre prueba 3!", "Apellido prueba 3!", "1,60", persona_3.getAlias(), "2600000", "Soltero", lista, file));
	}
	
	public void testAgregarLR() {
		setupStage();
		assertTrue("Se debió dar like", persona.agregarLR(persona_1.getAlias(), lista, file));
		assertFalse("No se debió dar like", persona.agregarLR(persona_3.getAlias(), lista, file));
	}
	
	public void testAgregarLO() {
		setupStage();
		assertTrue("Se debió dar like", persona.agregarLO(persona_1.getAlias(), lista, file));
		assertFalse("No se debió dar like", persona.agregarLO(persona_3.getAlias(), lista, file));
	}

	public void testCambioAleatorio() {
		setupStageToSearch();
		assertNotNull("Se debió obtener una persona", persona.cambioAleatorio(lista));
	}
	
	public void testOrdenamientoIns() {
		setupStageToSearch();
		assertEquals("El total de likes de la primera persona de la lista debe ser 199", 199, persona.ordenamientoIns(lista, "Número de likes").get(0));
	}
	
	public void testOrdenamientoBur() {
		setupStageToSearch();
		assertEquals("El total de likes de la primera persona de la lista deber ser 9", 9, persona.ordenamientoBur(lista, "Número de likes", "Ascendente").get(0));
	}	
	
	public void testTopUsuarios() {
		setupStageToSearch();
		assertEquals("El total de likes de la primera persona de la lista debe ser 199", 199, persona.topUsuarios(lista, "Número de likes", "Masculino").get(0));
	}
	
	public void testCalcMedia() {
		setupStageToSearch();
		assertEquals("La media debe ser 75,9", 75.9,persona.calcMedia(lista, "Número de likes", "Femenino"));
	}
	
	public void testCalcMediana() {
		setupStageToSearch();
		assertEquals("La mediana debe ser 66", 66, persona.calcMediana(lista, "Número de likes", "Femenino"));
	}
	
	public void testCalcModa() {
		setupStageToSearch();
		assertEquals("La moda debe ser 22", 22, persona.calcModa(lista, "Número de likes", "Femenino"));
	}
	
}
