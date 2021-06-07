package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import co.edu.unbosque.model.AgenciaDTO;
import co.edu.unbosque.model.Persona;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {
	private VentanaPrincipal vista;
	final String username = "anatalia1287@gmail.com";
	final String password = "butqjmpsrcvekwms";
	DateFormat dateFormat;
	Properties propiedad;
	MimeMessage mensaje;
	AgenciaDTO agencia;
	Persona logueada;
	Persona aleatoria;
	int edad = 0;
	String salario = "-1.0", divorcios = "", genero = "", nombre = "", apellido = "", alias = "", contrasena = "", correo = "",
			estatura = "", estado = "";
	Date fNaci = null;

	public Controller() {
		iniciarAplicacion();
		//sendEmail("anatalia1287@gmail.com", "anatalia", "1234");
		agencia = new AgenciaDTO();
		try {
			agencia.setPersonas(agencia.getA().cargarArchivo());
			System.out.print("Cantidad " + agencia.getPersonas().size());

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("No se pudo cargar el archivo.");
		}
	}

	public void iniciarAplicacion() {
		vista = new VentanaPrincipal();
		vista.setVisible(true);
		vista.getpInicio().getBtnIngresar().addActionListener(this);
		vista.getpInicio().getBtnRegistro().addActionListener(this);
		vista.getpRegistro().getBtnInicio().addActionListener(this);
		vista.getpRegistro().getBtnRegistrar().addActionListener(this);
		vista.getpConocer().getBtnDislike().addActionListener(this);
		vista.getpConocer().getBtnLike().addActionListener(this);
		vista.getpConocer().getBtnSalir().addActionListener(this);
		vista.getpConocer().getBtnPerfil().addActionListener(this);
		vista.getpRegistro().getCbxGenero().addActionListener(this);
		vista.getpAEstadisticas().getBtnGenePDF().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Registrar")) {
			vista.getpInicio().setVisible(false);
			vista.getpRegistro().setVisible(true);
		}

		if (e.getActionCommand().equals("Ingresar")) {
			alias = vista.getpInicio().getTxtAlias().getText();
			contrasena = vista.getpInicio().getTxtContrasenia().getText();
			if(alias.equals("admin-1234") && contrasena.equals("admin-1234")) {
				// ACA VA LO DEL ADMIN
			} 
			logueada = agencia.getPersonaDAO().iniSesion(alias, contrasena, agencia.getPersonas());
			if(logueada != null) {
				cambioAleatorio();
				vista.getpInicio().setVisible(false);
				vista.getpConocer().setVisible(true); 
			} else {
				JOptionPane.showMessageDialog(null, "ERROR: El alias o la contraseña son incorrectas");
			}
		}

		if (e.getActionCommand().equals("Inicio")) {
			vista.getpInicio().setVisible(true);
			vista.getpRegistro().setVisible(false);
		}

		if (e.getActionCommand().equals("Registro")) {
			genero = vista.getpRegistro().getCbxGenero().getSelectedItem().toString();
			nombre = vista.getpRegistro().getTxtNombre().getText();
			apellido = vista.getpRegistro().getTxtApellido().getText();
			alias = vista.getpRegistro().getTxtAlias().getText();
			contrasena = vista.getpRegistro().getTxtContrasenia().getText();
			correo = vista.getpRegistro().getTxtCorreo().getText();
			fNaci = vista.getpRegistro().getTxtFNacimiento().getDate();
			estatura = vista.getpRegistro().getTxtEstatura().getText();
			estado = vista.getpRegistro().getCbxEstado().getSelectedItem().toString();
			divorcios = vista.getpRegistro().getBtnGDivorcios().getSelection().toString();
			salario = vista.getpRegistro().getTxtIngresos().getText();
			dateFormat = new SimpleDateFormat("dd-MM-yyyy");	
			if(validarDatos()) {
				edad = agencia.getPersonaDAO().calcularEdad(dateFormat.format(fNaci));
				if (genero.equals("Femenino")) {
					salario = "-1.0";
				} else {
					divorcios = "No aplica";
				}
				if(edad < 18) {
					JOptionPane.showMessageDialog(null, "ERROR: Debe ser mayor de edad.");
				} else {
					boolean res = agencia.getPersonaDAO().agregarPersona(agencia.getPersonas().size(), nombre, apellido, genero,
							alias, contrasena, correo, dateFormat.format(fNaci),
							edad, Double.parseDouble(salario), divorcios, estado,
							estatura, agencia.getPersonas(), agencia.getFile());
					if (res) {
						sendEmail(correo, alias, contrasena);
						limpiar();
						vista.getpInicio().setVisible(true);
						vista.getpRegistro().setVisible(false);
						JOptionPane.showMessageDialog(null, "La persona se registro correctamente");
					} else {
						JOptionPane.showMessageDialog(null, "ERROR: La persona ya existe");
					}
				}
			}
		}

		if (e.getActionCommand().equals("pRegistroGenero")) {
			String genero = vista.getpRegistro().getCbxGenero().getSelectedItem().toString();
			if (genero.equals("Femenino")) {
				vista.getpRegistro().getSi().setVisible(true);
				vista.getpRegistro().getNo().setVisible(true);
				vista.getpRegistro().getTxtIngresos().setVisible(false);
				vista.getpRegistro().getLbOpcional().setText("¿Ha tenido divorcios?");
			} else if (genero.equals("Masculino")) {
				vista.getpRegistro().getLbOpcional().setText("¿Cuáles son sus ingresos?");
				vista.getpRegistro().getSi().setVisible(false);
				vista.getpRegistro().getNo().setVisible(false);
				vista.getpRegistro().getTxtIngresos().setVisible(true);
			} else {
				vista.getpRegistro().getLbOpcional().setText("");
				vista.getpRegistro().getSi().setVisible(false);
				vista.getpRegistro().getNo().setVisible(false);
				vista.getpRegistro().getTxtIngresos().setVisible(false);
			}
		}
		if (e.getActionCommand().equals("disLike")) {
			cambioAleatorio();
		}
		if (e.getActionCommand().equals("like")) {
			//agregar métodos de me gusta
			agencia.getPersonaDAO().agregarLO(logueada.getAlias(), agencia.getPersonas(), agencia.getFile()); // info persona logueada
			agencia.getPersonaDAO().agregarLR(aleatoria.getAlias(), agencia.getPersonas(), agencia.getFile()); // info persona a dar like
			cambioAleatorio();
		}
		if (e.getActionCommand().equals("miPerfil")) {
			//agregar perfil
		}
		if (e.getActionCommand().equals("logout")) {
			logueada = null;
			alias = "";
			contrasena = "";
			vista.getpInicio().getTxtAlias().setText("");
			vista.getpInicio().getTxtContrasenia().setText("");
			vista.getpInicio().setVisible(true);
			vista.getpConocer().setVisible(false); 
		}
	}
	
	public void cambioAleatorio() {
		aleatoria = agencia.getPersonaDAO().cambioAleatorio(agencia.getPersonas());
		vista.getpConocer().getLbAlias().setText(aleatoria.getAlias());
		vista.getpConocer().getLbEstado().setText(aleatoria.getEstado());
		vista.getpConocer().getLbEdad().setText(Integer.toString(aleatoria.getEdad()));
		vista.getpConocer().getLbGenero().setText(aleatoria.getGenero());
		vista.getpConocer().getLbEstatura().setText(aleatoria.getEstatura());
		
		vista.getpConocer().getLbLOtorgados().setText(Integer.toString(aleatoria.getNumLO()));
		vista.getpConocer().getLbLResividos().setText(Integer.toString(aleatoria.getNumLR()));
		
		if(aleatoria.getGenero().equals("Femenino")) {
			vista.getpConocer().getLbDepende().setText("Divorcios: ");
			vista.getpConocer().getLbRespuesta().setText(aleatoria.getDivorcios());
		} else {
			vista.getpConocer().getLbDepende().setText("Salario: ");
			if(aleatoria.getIngresos() == -1.0) {
				vista.getpConocer().getLbRespuesta().setText("N/A");
			} else {
				vista.getpConocer().getLbRespuesta().setText(Double.toString(aleatoria.getIngresos()));
			}
		}
	}

	public boolean validarDatos() {
		// validaciones por género
		if (genero.equals("Masculino")) {
			if (estatura == null || salario.equals("-1.0")) {
				JOptionPane.showMessageDialog(null, "ERROR: La estatura o el salario es requerido.");
				return false;
			}
			if(contieneSoloNumeros(salario)) {
				JOptionPane.showMessageDialog(null, "ERROR: El salario debe ser numérico.");
				return false;
			}
		} else {
			if (divorcios == null) {
				JOptionPane.showMessageDialog(null, "ERROR: Debe indicar si tiene divorcios.");
				return false;
			}
			if(estatura == null) {
				estatura = "-1.0";
			}
		}
		// validar campos nulos
		if (nombre == null || apellido == null || alias == null || genero.equals("Seleccione") || contrasena == null || correo == null || estado.equals("Seleccione") ||  fNaci == null) {
			JOptionPane.showMessageDialog(null,
					"ERROR: Todos los campos son obligatorios.");
			return false;
		}
		// validar no disponible
		if(estado.equals("No Disponible")) {
			JOptionPane.showMessageDialog(null, "ERROR: Solo se pueden registrar personas disponibles.");
			return false;
		}
		// validar que la estatura sea double
		if(contieneSoloNumeros(estatura)) {
			JOptionPane.showMessageDialog(null, "ERROR: El salario debe ser numérico.");
			return false;
		}
		// validar correo
		Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher mather = pattern.matcher(correo);
        if (!mather.find()) {
        	JOptionPane.showMessageDialog(null, "ERROR: El correo ingresado es inválido..");
        	return false;
        }
		
		return true;
	}

	private static boolean contieneSoloNumeros(String cadena){
		try {
			Double.parseDouble(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
	
	public void limpiar() {
		vista.getpRegistro().getTxtAlias().setText("");
		vista.getpRegistro().getTxtContrasenia().setText("");
		vista.getpRegistro().getTxtCorreo().setText("");
		vista.getpRegistro().getTxtNombre().setText("");
		vista.getpRegistro().getTxtApellido().setText("");
		vista.getpRegistro().getCbxGenero().setSelectedItem("Seleccione");
		vista.getpRegistro().getCbxEstado().setSelectedItem("Seleccione");
		vista.getpRegistro().getTxtEstatura().setText("");
		vista.getpRegistro().getTxtIngresos().setText("");
		vista.getpRegistro().getTxtFNacimiento().setDate(null);
		vista.getpRegistro().getBtnGDivorcios().clearSelection();
	}

	public void sendEmail(String correo, String alias, String contrasena) {

		Properties propiedad = new Properties();
		propiedad.put("mail.smtp.auth", "true");
		propiedad.put("mail.smtp.starttls.enable", "true");
		propiedad.put("mail.smtp.host", "smtp.gmail.com");
		propiedad.put("mail.smtp.port", "587");
		propiedad.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		Session session = Session.getInstance(propiedad, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		session.setDebug(true);
		try {
			mensaje = new MimeMessage(session);
			mensaje.setFrom(new InternetAddress(username));
			mensaje.setSubject("BOSTINDER");
			mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(correo));
			mensaje.setContent(
		              "<div style='width: 325px; background-color: #F5D5D7; height: 325px; padding: 1px; text-align: center; border-radius: 180px; '><h1 style='color: #CC0000; margin-top: 35px;'>BOSTINDER</h1><p>¡Bienvenido a BosTinder!</p> <p> Su registro fue exitoso </p> <p><b>Alias: </b>"+ alias +" </p> <p><b> Contraseña: </b>" + contrasena + " </p> <img height='90' width='90' src='http://assets.stickpng.com/thumbs/584a78dd7ec3445d9da286aa.png'> </div>",
		             "text/html");
			//mensaje.setText("El resgitro en BOSTINDER ha sido exitoso");
			Transport.send(mensaje);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
