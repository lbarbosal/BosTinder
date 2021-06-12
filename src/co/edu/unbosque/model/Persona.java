package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Clase que contiene los atributos de la persona, implementa interfaz de Serializable 
 * para el manejo de archivos binarios
 * 
 * @author: Grupo 3
 * @version: 06/06/2021
 * 
 */

public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	private String apellido;
	private String genero;
	private String alias;
	private String contrasena;
	private String correo;
	private String fecha;
	private int edad;
	private double ingresos;
	private String divorcios;
	private int numLR; // número de like recibidos
	private int numLO; // número de likes ortorgados
	private int numM; // número de matches
	private String estado;
	private String estatura;
	
	/**
	 * Constructor 1 de la clase persona asigna valores a los atributos de la persona a excepción de atributo de estaruta.
	 *
	 * @param id              Es el identificador de registro de la persona.
	 * @param alias           Es el alias de la persona para el inicio de sesión, debe ser único. alias != null, alias != ""
	 * @param contrasena      Es la contraseña de la persona para el inicio de sesión. alias != null, alias != ""                     
	 * @param nombre          Es el nombre de la persona. nombre != null, nombre != " "
	 * @param apellido        Es el apellido de la persona. apellido != null,
	 *                        apellido != " "
	 * @param genero          Es el género de la persona, los posibles valores son: Femenino, maculino. genero != null,
	 *                        genero != " "
	 * @param fecha 		  Es la fecha de nacimiento de la persona, debe tener un formato dd-MM-yyyy.
	 *                        fecha != null, fecha != " "
	 * @param edad        	  Es la edad de la persona, se cálcula a partir de la fecha de nacimiento, debe ser numérico.
	 * @param correo          Es el correo del usuario. correo != null, correo != ""
	 * @param divorcios       Indica si la persona tiene divorcios, es obligatorio cuando el género femenino, los posibles valores son en SI, NO. Para en género masculino el valor por defecto es: No Aplica.
	 * @param ingresos     	  Son los ingresos de la persona, es obligatorio cuando el género es masculino, debe ser en decimales, el valor por defecto es -1.0.
	 * @param numLR     	  Es el número de me gusta recibidos, debe ser un valor numérico.
	 * @param numLO     	  Es el número de me gusta que ha otorgado a otras personas, debe ser un valor numérico.
	 * @param numM     	   	  Es el número de match que ha tenido una persona, debe ser un valor numérico.
	 * @param estado     	  Es el estado de la persona, los posibles valores son: disponibles, no disponibles. Si la persona selecciona no disponible, no se puede registrar en BosTinder.
	 */
	
	// Sin estatura, el archivo no tiene el campo
	public Persona(int id, String nombre, String apellido, String genero, String alias, String contrasena, String correo,
			String fecha, int edad, double ingresos, String divorcios, int numLR, int numLO, int numM, String estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.alias = alias;
		this.contrasena = contrasena;
		this.correo = correo;
		this.fecha = fecha;
		this.edad = edad;
		this.ingresos = ingresos;
		this.divorcios = divorcios;
		this.numLR = numLR;
		this.numLO = numLO;
		this.numM = numM;
		this.estado = estado;
	}
	
	/**
	 * Constructor 2 de la clase persona asigna valores a los atributos de la persona a incluyendo el atributo de estaruta.
	 * 
	 * @param id              Es el identificador de registro de la persona. id != id, alias != ""
	 * @param alias           Es el alias de la persona para el inicio de sesión, debe ser único. alias != null, alias != ""
	 * @param contrasena      Es la contraseña de la persona para el inicio de sesión. contrasena != null, contrasena != ""              
	 * @param nombre          Es el nombre de la persona. nombre != null, nombre != ""
	 * @param apellido        Es el apellido de la persona. apellido != null,
	 *                        apellido != " "
	 * @param genero          Es el género de la persona, los posibles valores son: Femenino, maculino. genero != null,
	 *                        genero != " "
	 * @param fecha 		  Es la fecha de nacimiento de la persona, debe tener un formato dd-MM-yyyy.
	 *                        fecha != null, fecha != " "
	 * @param edad        	  Es la edad de la persona, se cálcula a partir de la fecha de nacimiento. edad != null,
	 *                        edad != " "
	 * @param correo          Es el correo del usuario. correo != null, correo != ""
	 * @param divorcios       Indica si la persona tiene divorcios, es obligatorio cuando el género femenino, los posibles valores son en SI, NO. Para en género masculino el valor por defecto es: No Aplica.
	 * @param ingresos     	  Son los ingresos de la persona, es obligatorio cuando el género es masculino, debe ser en decimales, el valor por defecto es -1.0.
	 * @param numLR     	  Es el número de me gusta recibidos, debe ser un valor numérico.
	 * @param numLO     	  Es el número de me gusta que ha otorgado a otras personas, debe ser un valor numérico.
	 * @param numM     	   	  Es el número de match que ha tenido una persona, debe ser un valor numérico.
	 * @param estado     	  Es el estado de la persona, los posibles valores son: disponibles, no disponibles. Si la persona selecciona no disponible, no se puede registrar en BosTinder.
	 * @param estatura		  La estatura de la persona, es requerida para el género masculino y opcional para el género femenino.
	 */

	public Persona(int id, String nombre, String apellido, String genero, String alias, String contrasena, String correo,
			String fecha, int edad, double ingresos, String divorcios, int numLR, int numLO, int numM, String estado, String estatura) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.alias = alias;
		this.contrasena = contrasena;
		this.correo = correo;
		this.fecha = fecha;
		this.edad = edad;
		this.ingresos = ingresos;
		this.divorcios = divorcios;
		this.numLR = numLR;
		this.numLO = numLO;
		this.numM = numM;
		this.estado = estado;
		this.estatura = estatura;
	}
	
	/**
	 * Devuelve el id la persona.
	 * @return id
	 */
	
	public int getId() {
		return id;
	}
	
	/**
	 * Modifica la id de la persona.
	 * @param id 	Es el identificador de registro de la persona.
	 */
	
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Devuelve el nombre de la persona. 
	 * @return nombre
	 */
	
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Modifica el nombre de una persona.
	 * @param nombre 	Es el nombre de la persona. nombre != null, nombre != ""
	 */
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Devuelve el apellido de la persona.
	 * @return apellido
	 */
	
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * Modifica el apellido de una persona.
	 * @param apellido 	Es el apellido de la persona. nombre != null, nombre != ""
	 */
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 * Devuelve la género de la persona. 
	 * @return genero
	 */
	
	public String getGenero() {
		return genero;
	}
	
	/**
	 * Modifica el género de una persona.
	 * @param genero   Es el género de la persona, los posibles valores son: Femenino, maculino. genero != null,
	 *                 genero != " "
	 */
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	/**
	 * Devuelve el alias de la persona. 
	 * @return alias 
	 */
	
	public String getAlias() {
		return alias;
	}
	
	/**
	 * Modifica el alias de una persona.
	 * @param alias 	Es el alias de la persona para el inicio de sesión, debe ser único. alias != null, alias != ""
	 */
	
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	/**
	 * Devuelve la contraseña de la persona. 
	 * @return contrasena
	 */
	
	public String getContrasena() {
		return contrasena;
	}
	
	/**
	 * Modifica el contraseña de una persona.
	 * @param contrasena 	Es la contraseña de la persona para el inicio de sesión. contrasena != null, contrasena != ""
	 */
	
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	/**
	 * Devuelve el correo electrónico de la persona. 
	 * @return correo
	 */
	
	public String getCorreo() {
		return correo;
	}
	
	/**
	 * Modifica el correo de una persona.
	 * @param correo 	Es el correo del usuario. correo != null, correo != ""
	 */
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	/**
	 * Devuelve la fecha de nacimiento de la persona. 
	 * @return fecha
	 */
	
	public String getFecha() {
		return fecha;
	}
	
	/**
	 * Modifica la fecha de nacimiento de una persona.
	 * @param fecha 	Es la fecha de nacimiento de la persona, debe tener un formato dd-MM-yyyy.
	 *                  fecha != null, fecha != " "
	 */
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	/**
	 * Devuelve los ingresos de la persona.
	 * @return ingresos
	 */
	
	public double getIngresos() {
		return ingresos;
	}
	
	/**
	 * Modifica los ingresos de una persona.
	 * @param ingresos 	Son los ingresos de la persona, es obligatorio cuando el género es masculino, debe ser en decimales, el valor por defecto es -1.0.
	 */
	
	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}
	
	/**
	 * Devuelve si una persona ha tenido divorcios.
	 * @return divorcios
	 */
	
	public String getDivorcios() {
		return divorcios;
	}
	
	/**
	 * Modifica si la persona es divorciada.
	 * @param divorcios 	Indica si la persona tiene divorcios, es obligatorio cuando el género femenino, los posibles valores son en SI, NO. Para en género masculino el valor por defecto es: No Aplica.
	 */
	
	public void setDivorcios(String divorcios) {
		this.divorcios = divorcios;
	}
	
	/**
	 * Devuelve en número de me gustas recibidos de la persona.
	 * @return numLR
	 */
	
	public int getNumLR() {
		return numLR;
	}
	
	/**
	 * Modifica el número de me gustas recibidos de una persona.
	 * @param numLR  Es el número de me gusta recibidos, debe ser un valor numérico.
	 */
	
	public void setNumLR(int numLR) {
		this.numLR = numLR;
	}
	
	/**
	 * Devuelve en número de me gustas otorgados por la persona.
	 * @return numLO
	 */
	
	public int getNumLO() {
		return numLO;
	}
	
	/**
	 * Modifica el número de me gustas otorgados de una persona.
	 * @param numLO  Es el número de me gusta que ha otorgado a otras personas, debe ser un valor numérico.
	 */
	
	public void setNumLO(int numLO) {
		this.numLO = numLO;
	}
	
	/**
	 * Devuelve en número de me match de una persona. 
	 * @return numM
	 */
	
	public int getNumM() {
		return numM;
	}
	
	/**
	 * Modifica el número de match de una persona.
	 * @param numM  Es el número de match que ha tenido una persona, debe ser un valor numérico.
	 */
	
	public void setNumM(int numM) {
		this.numM = numM;
	}
	
	/**
	 * Devuelve el estado de una persona.
	 * @return estado
	 */
	
	public String getEstado() {
		return estado;
	}
	
	/**
	 * Modifica el estado de una persona.
	 * @param estado  Es el estado de la persona, los posibles valores son: disponibles, no disponibles. Si la persona selecciona no disponible, no se puede registrar en BosTinder.
	 */
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	/**
	 * Devuelve la edad de la persona. 
	 * @return edad
	 */
	
	public int getEdad() {
		return edad;
	}
	
	/**
	 * Modifica la edad de una persona.
	 * @param edad  Es la edad de la persona, se cálcula a partir de la fecha de nacimiento, debe ser numérico. 
	 */
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Devuelve la estatura de la persona. 
	 * @return estatura
	 */
	
	public String getEstatura() {
		return estatura;
	}
	
	/**
	 * Modifica la estatura de una persona.
	 * @param estatura  Es el estado de la persona, los posibles valores son: disponibles, no disponibles. Si la persona selecciona no disponible, no se puede registrar en BosTinder.
	 */

	public void setEstatura(String estatura) {
		this.estatura = estatura;
	}
}
