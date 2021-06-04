package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{
	private VentanaPrincipal vista;
	final String username = "anatalia1287@gmail.com";
	final String password = "butqjmpsrcvekwms";
	Properties propiedad;
	MimeMessage mensaje;
	
	public Controller() {
		iniciarAplicacion();
	}
	
	public void iniciarAplicacion(){
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
	}

	public void sendEmail(String correo){
	
		Properties propiedad = new Properties();
		propiedad.put("mail.smtp.auth", "true");
		propiedad.put("mail.smtp.starttls.enable", "true");
		propiedad.put("mail.smtp.host", "smtp.gmail.com");
		propiedad.put("mail.smtp.port", "587");
		propiedad.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		Session session = Session.getInstance(propiedad,
		  new javax.mail.Authenticator() {
		      protected PasswordAuthentication getPasswordAuthentication() {
		            return new PasswordAuthentication(username, password);
		      }
		  });
		//session.setDebug(true);
		try {
		      mensaje = new MimeMessage(session);
		      mensaje.setFrom(new InternetAddress(username));
		      mensaje.setSubject("BOSTINDER");
		      mensaje.addRecipient(Message.RecipientType.TO,new InternetAddress(correo));
		      mensaje.setText("El resgitro en BOSTINDER ha sido exitoso");
		      Transport.send(mensaje);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
