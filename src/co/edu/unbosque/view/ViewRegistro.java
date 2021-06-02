package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ViewRegistro extends JPanel{
	
	private JLabel bosstinder;
	private JLabel lbOpcional;
	private JTextField txtAlias;
	private JTextField txtCorreo;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtFNacimiento;
	private JTextField txtContrasenia;
	private JTextField txtEstatura;
	private JTextField txtIngresos;
	private JComboBox<?> cbxEstado;
	private JComboBox<?> cbxGenero;
	private ButtonGroup btnGDivorcios;
	private JRadioButton si;
	private JRadioButton no;
	private JButton btnRegistrar;
	private JButton btnInicio;
	
	
	public ViewRegistro() {
		setLayout(null);
		
		ImageIcon titulo = new ImageIcon("graphics/titulo.png");
		bosstinder = new JLabel();
		bosstinder.setBounds(188,73,232,44);
		bosstinder.setIcon(new ImageIcon(titulo.getImage().getScaledInstance(bosstinder.getWidth(), bosstinder.getHeight(),Image.SCALE_SMOOTH)));
		add(bosstinder);
		
		JLabel lbNombre = new JLabel("Nombre");
		lbNombre.setBounds(102,137,51,21);
		add(lbNombre);
		txtNombre = new JTextField();
		txtNombre.setBounds(102, 162, 177, 27);
		add(txtNombre);
		
		JLabel lbApellido = new JLabel("Apellido");
		lbApellido.setBounds(322,137,47,21);
		add(lbApellido);
		txtApellido = new JTextField();
		txtApellido.setBounds(322, 162, 177, 27);
		add(txtApellido);
		
		JLabel lbAlias = new JLabel("Alias");
		lbAlias.setBounds(102,212,28,21);
		add(lbAlias);
		txtAlias = new JTextField();
		txtAlias.setBounds(102, 237, 177, 27);
		add(txtAlias);
		
		JLabel lbContrasenia = new JLabel("Contraseña");
		lbContrasenia.setBounds(322,212,69,21);
		add(lbContrasenia);
		txtContrasenia = new JTextField();
		txtContrasenia.setBounds(322, 237, 177, 27);
		add(txtContrasenia);

		JLabel lbCorreo = new JLabel("Correo Electronico");
		lbCorreo.setBounds(102,284,111,21);
		add(lbCorreo);
		txtCorreo = new JTextField();
		txtCorreo.setBounds(102, 309, 177, 27);
		add(txtCorreo);
		
		JLabel lbFecha = new JLabel("Fecha De Nacimiento");
		lbFecha.setBounds(322,284,124,21);
		add(lbFecha);
		txtFNacimiento = new JTextField();
		txtFNacimiento.setBounds(322, 309, 177, 27);
		add(txtFNacimiento);
		
		JLabel lbEstatura = new JLabel("Estatura");
		lbEstatura.setBounds(102,421,50, 21);
		add(lbEstatura);
		txtEstatura = new JTextField();
		txtEstatura.setBounds(102,445,177, 27);
		add(txtEstatura);
		
		lbOpcional = new JLabel("");
		lbOpcional.setBounds(322,421,110,21);
		add(lbOpcional);
		txtIngresos = new JTextField();
		txtIngresos.setBounds(322, 455, 177, 27);
		txtIngresos.setVisible(false);
		add(txtIngresos);
		
		no = new JRadioButton("No",true);
		no.setBounds(324,448,40,23);
		no.setBackground(new Color(245,213,215));
		no.setVisible(false);
		add(no);
		si = new JRadioButton("Si",false);
		si.setBounds(411,448,40,23);
		si.setBackground(new Color(245,213,215));
		si.setVisible(false);
		add(si);
		
		btnGDivorcios = new ButtonGroup();
		btnGDivorcios.add(si);
		btnGDivorcios.add(no);
		
		JLabel lbEstado = new JLabel("Estado");
		lbEstado.setBounds(102, 357, 42, 21);
		add(lbEstado);
		cbxEstado = new JComboBox();
		cbxEstado.setModel(new DefaultComboBoxModel(new String[] {"Disponible", "No Disponible"}));
		cbxEstado.setBounds(102,378,177,27);
		add(cbxEstado);
		
		JLabel lbGenero = new JLabel("Genero");
		lbGenero.setBounds(322, 357, 45, 21);
		add(lbGenero);
		cbxGenero = new JComboBox();
		cbxGenero.setModel(new DefaultComboBoxModel(new String[] {"Masculino","Femenino"}));
		cbxGenero.setBounds(322,378,177,27);
		add(cbxGenero);
		
		btnRegistrar = new JButton("Registro");
		btnRegistrar.setBackground(new Color(204,0,0));
		btnRegistrar.setBounds(411,513,87,27);
		btnRegistrar.setForeground(Color.white);
		btnRegistrar.setFont(new Font("arial",0,11));
		add(btnRegistrar);
		
		btnInicio = new JButton("Inicio");
		btnInicio.setBackground(new Color(204,0,0));
		btnInicio.setBounds(101,513,87,27);
		btnInicio.setForeground(Color.white);
		btnInicio.setFont(new Font("arial",0,11));
		add(btnInicio);
		
	}

}
