package co.edu.unbosque.controller;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Controller {
	final String username = "anatalia1287@gmail.com";
	final String password = "butqjmpsrcvekwms";
	Properties propiedad;
	MimeMessage mensaje;
	
	public Controller() {
		sendEmail("natalia.rodriguez@tars.dev");
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
}
