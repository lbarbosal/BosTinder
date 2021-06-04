package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

public class ViewInicio extends JPanel{
	
	private JLabel bosstinder;
	private JTextField txtAlias;
	private JPasswordField txtContrasenia;
	private JButton btnRegistro;
	private JButton btnIngresar;
	
	public ViewInicio() {
		
		setLayout(null);
		ImageIcon titulo = new ImageIcon("graphics/titulo.png");
		bosstinder = new JLabel();
		bosstinder.setBounds(165,129,232,44);
		bosstinder.setIcon(new ImageIcon(titulo.getImage().getScaledInstance(bosstinder.getWidth(), bosstinder.getHeight(),Image.SCALE_SMOOTH)));
		add(bosstinder);
		
		JLabel lbAlias = new JLabel("Alias");
		lbAlias.setBounds(162,199,28,21);
		add(lbAlias);
		txtAlias = new JTextField();
		txtAlias.setBounds(162,229,239,27);
		add(txtAlias);
		
		JLabel lbContrasenia = new JLabel("Contraseņa");
		lbContrasenia.setBounds(162,266,69,21);
		add(lbContrasenia);
		txtContrasenia = new JPasswordField();
		txtContrasenia.setBounds(162,291,239,27);
		add(txtContrasenia);
		

		btnRegistro = new JButton("Registrar");
		btnRegistro.setBounds(162,348,87,27);
		btnRegistro.setBackground(new Color(204,0,0));
		btnRegistro.setForeground(Color.white);
		btnRegistro.setFont(new Font("arial",0,11));
		btnRegistro.setBorder( new MatteBorder(0,0,3,3,Color.black));
		add(btnRegistro);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(314,348,87,27);
		btnIngresar.setBackground(new Color(204,0,0));
		btnIngresar.setForeground(Color.white);
		btnIngresar.setFont(new Font("arial",0,11));
		btnIngresar.setBorder( new MatteBorder(0,0,3,3,Color.black));
		add(btnIngresar);
	}

	public JLabel getBosstinder() {
		return bosstinder;
	}

	public void setBosstinder(JLabel bosstinder) {
		this.bosstinder = bosstinder;
	}

	public JTextField getTxtAlias() {
		return txtAlias;
	}

	public void setTxtAlias(JTextField txtAlias) {
		this.txtAlias = txtAlias;
	}

	public JPasswordField getTxtContrasenia() {
		return txtContrasenia;
	}

	public void setTxtContrasenia(JPasswordField txtContrasenia) {
		this.txtContrasenia = txtContrasenia;
	}

	public JButton getBtnRegistro() {
		return btnRegistro;
	}

	public void setBtnRegistro(JButton btnRegistro) {
		this.btnRegistro = btnRegistro;
	}

	public JButton getBtnIngresar() {
		return btnIngresar;
	}

	public void setBtnIngresar(JButton btnIngresar) {
		this.btnIngresar = btnIngresar;
	}

}
