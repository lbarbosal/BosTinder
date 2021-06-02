package co.edu.unbosque.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewConocer extends JPanel{
	
	private JLabel bosstinder;
	private JLabel perfil;
	private JLabel lbNombre;
	private JLabel lbApellido;
	private JLabel lbNacimiento;
	private JLabel lbEdad;
	private JLabel lbAlias;
	private JLabel lbCorreo;
	private JLabel lbGenero;
	private JLabel lbEstatura;
	private JLabel lbDepende;
	private JLabel lbRespuesta;
	private JLabel lbLResividos;
	private JLabel lbLOtorgados;
	private JButton btnSalir;
	private JButton btnPerfil;
	private JButton btnlike;
	private JButton btnDislike;
	
	public ViewConocer() {
		setLayout(null);
		ImageIcon titulo = new ImageIcon("graphics/titulo.png");
		bosstinder = new JLabel();
		bosstinder.setBounds(165,129,232,44);
		bosstinder.setIcon(new ImageIcon(titulo.getImage().getScaledInstance(bosstinder.getWidth(), bosstinder.getHeight(),Image.SCALE_SMOOTH)));
		add(bosstinder);
		
		ImageIcon lbperfil = new ImageIcon("graphics/perfil.png");
		perfil = new JLabel();
		perfil.setBounds(220,130,148,148);
		perfil.setIcon(new ImageIcon(titulo.getImage().getScaledInstance(perfil.getWidth(), perfil.getHeight(),Image.SCALE_SMOOTH)));
		add(bosstinder);
		
	}
	

}
