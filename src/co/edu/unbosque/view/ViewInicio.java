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
/**
 * Clase en la que se someten el alias y la contraseña para ingresar a la aplicación
 * Depende de un JPanel
 * 
 * @author Grupo 3
 * @version 12/06/2021
 */
public class ViewInicio extends JPanel {

	private JLabel bosstinder;
	private JTextField txtAlias;
	private JPasswordField txtContrasenia;
	private JButton btnRegistro;
	private JButton btnIngresar;
	
	/**
	 * Método constructor
	 */
	public ViewInicio() {

		setLayout(null);
		ImageIcon titulo = new ImageIcon("graphics/titulo.png");
		bosstinder = new JLabel();
		bosstinder.setBounds(165, 129, 232, 44);
		bosstinder.setIcon(new ImageIcon(titulo.getImage().getScaledInstance(bosstinder.getWidth(),
		bosstinder.getHeight(), Image.SCALE_SMOOTH)));
		add(bosstinder);

		JLabel lbAlias = new JLabel("Alias");
		lbAlias.setBounds(162, 199, 28, 21);
		add(lbAlias);
		txtAlias = new JTextField();
		txtAlias.setBounds(162, 229, 239, 27);
		add(txtAlias);

		JLabel lbContrasenia = new JLabel("Contraseña");
		lbContrasenia.setBounds(162, 266, 69, 21);
		add(lbContrasenia);
		txtContrasenia = new JPasswordField();
		txtContrasenia.setBounds(162, 291, 239, 27);
		add(txtContrasenia);

		btnRegistro = new JButton("Registrar");
		btnRegistro.setBounds(162, 348, 87, 27);
		btnRegistro.setBackground(new Color(204, 0, 0));
		btnRegistro.setForeground(Color.white);
		btnRegistro.setFont(new Font("arial", 0, 11));
		btnRegistro.setBorder(new MatteBorder(0, 0, 3, 3, Color.black));
		add(btnRegistro);

		btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(314, 348, 87, 27);
		btnIngresar.setBackground(new Color(204, 0, 0));
		btnIngresar.setForeground(Color.white);
		btnIngresar.setFont(new Font("arial", 0, 11));
		btnIngresar.setBorder(new MatteBorder(0, 0, 3, 3, Color.black));
		add(btnIngresar);
	}

	/**
	 * Devuelve el título de Bosstinder
	 * @return bosstinder
	 */	
	public JLabel getBosstinder() {
		return bosstinder;
	}
	
	/**
	 * Modifica el título de Bosstinder
	 * @return perfil
	 */
	public void setBosstinder(JLabel bosstinder) {
		this.bosstinder = bosstinder;
	}

	/**
	 * Devuelve el texto  en el alias
	 * @return txtAlias
	 */
	public JTextField getTxtAlias() {
		return txtAlias;
	}

	/**
	 * Modifica el texto  en el alias
	 * @param txtAlias
	 */
	public void setTxtAlias(JTextField txtAlias) {
		this.txtAlias = txtAlias;
	}

	/**
	 * Devuelve el texto de la contraseña
	 * @return txtContrasenia
	 */
	public JPasswordField getTxtContrasenia() {
		return txtContrasenia;
	}

	/**
	 * Modificar el texto de la contraseña
	 * @param txtContrasenia
	 */
	public void setTxtContrasenia(JPasswordField txtContrasenia) {
		this.txtContrasenia = txtContrasenia;
	}

	/**
	 * Devuelve el botón de registro
	 * @return btnRegistro
	 */
	public JButton getBtnRegistro() {
		return btnRegistro;
	}

	/**
	 * Modificar el botón de registro
	 * @param btnRegistro
	 */
	public void setBtnRegistro(JButton btnRegistro) {
		this.btnRegistro = btnRegistro;
	}

	/**
	 * Devuelve el botón de ingresar
	 * @return btnIngresar
	 */
	public JButton getBtnIngresar() {
		return btnIngresar;
	}

	/**
	 * Modifica el botón de ingresar
	 * @param btnIngresar
	 */
	public void setBtnIngresar(JButton btnIngresar) {
		this.btnIngresar = btnIngresar;
	}

}
