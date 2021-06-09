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
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import com.toedter.calendar.JDateChooser;

public class ViewModificar extends JPanel{
	
	private JLabel bosstinder;
	private JLabel lbOpcional;
	private JTextField txtAlias;
	private JTextField txtCorreo;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtFNacimiento;
	private JPasswordField txtContrasenia;
	private JTextField txtEstatura;
	private JTextField txtIngresos;
	private JComboBox<?> cbxEstado;
	private JComboBox<?> cbxGenero;
	private ButtonGroup btnGDivorcios;
	private JRadioButton si;
	private JRadioButton no;
	private JButton btnRegistrar;
	private JButton btnInicio;
	
	
	public ViewModificar() {
		setLayout(null);
		
		ImageIcon titulo = new ImageIcon("graphics/titulo2.png");
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
		txtAlias.setEnabled(false);
		add(txtAlias);
		
		JLabel lbContrasenia = new JLabel("Contrase�a");
		lbContrasenia.setBounds(322,212,69,21);
		add(lbContrasenia);
		txtContrasenia = new JPasswordField();
		txtContrasenia.setBounds(322, 237, 177, 27);
		add(txtContrasenia);

		JLabel lbCorreo = new JLabel("Correo Electronico");
		lbCorreo.setBounds(102,284,111,21);
		add(lbCorreo);
		txtCorreo = new JTextField();
		txtCorreo.setBounds(102, 309, 177, 27);
		txtCorreo.setEnabled(false);
		add(txtCorreo);
		
		JLabel lbFecha = new JLabel("Fecha De Nacimiento");
		lbFecha.setBounds(322,284,124,21);
		add(lbFecha);
		txtFNacimiento = new JTextField();
		txtFNacimiento.setBounds(322, 309, 177, 27);
		txtFNacimiento.setEnabled(false);
		add(txtFNacimiento);
		
		JLabel lbEstatura = new JLabel("Estatura");
		lbEstatura.setBounds(102,421,50, 21);
		add(lbEstatura);
		txtEstatura = new JTextField();
		txtEstatura.setBounds(102,445,177, 27);
		add(txtEstatura);
		
		lbOpcional = new JLabel("");
		lbOpcional.setBounds(322,421,200,21);
		add(lbOpcional);
		txtIngresos = new JTextField();
		txtIngresos.setBounds(322, 445, 177, 27);
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
		cbxEstado.setModel(new DefaultComboBoxModel(new String[] {"Seleccione","Disponible", "No Disponible"}));
		cbxEstado.setBounds(102,378,177,27);
		add(cbxEstado);
		
		JLabel lbGenero = new JLabel("Genero");
		lbGenero.setBounds(322, 357, 45, 21);
		add(lbGenero);
		cbxGenero = new JComboBox();
		cbxGenero.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "Masculino","Femenino"}));
		cbxGenero.setBounds(322,378,177,27);
		cbxGenero.setActionCommand("pRegistroGenero");
		cbxGenero.setEnabled(false);
		add(cbxGenero);
		
		btnRegistrar = new JButton("Actualizar Datos");
		btnRegistrar.setBackground(Color.white);
		btnRegistrar.setBounds(411,513,87,27);
		btnRegistrar.setFont(new Font("arial",0,11));
		btnRegistrar.setBorder( new MatteBorder(0,0,3,3,Color.black));
		add(btnRegistrar);
		
		btnInicio = new JButton("Volver");
		btnInicio.setBackground(Color.white);
		btnInicio.setBounds(101,513,87,27);
		btnInicio.setFont(new Font("arial",0,11));
		btnInicio.setBorder( new MatteBorder(0,0,3,3,Color.black));
		add(btnInicio);
		
		
		
	}


	public JLabel getBosstinder() {
		return bosstinder;
	}


	public void setBosstinder(JLabel bosstinder) {
		this.bosstinder = bosstinder;
	}


	public JLabel getLbOpcional() {
		return lbOpcional;
	}


	public void setLbOpcional(JLabel lbOpcional) {
		this.lbOpcional = lbOpcional;
	}


	public JTextField getTxtAlias() {
		return txtAlias;
	}


	public void setTxtAlias(JTextField txtAlias) {
		this.txtAlias = txtAlias;
	}


	public JTextField getTxtCorreo() {
		return txtCorreo;
	}


	public void setTxtCorreo(JTextField txtCorreo) {
		this.txtCorreo = txtCorreo;
	}


	public JTextField getTxtNombre() {
		return txtNombre;
	}


	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}


	public JTextField getTxtApellido() {
		return txtApellido;
	}


	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}


	public JTextField getTxtFNacimiento() {
		return txtFNacimiento;
	}


	public void setTxtFNacimiento(JTextField txtFNacimiento) {
		this.txtFNacimiento = txtFNacimiento;
	}


	public JPasswordField getTxtContrasenia() {
		return txtContrasenia;
	}


	public void setTxtContrasenia(JPasswordField txtContrasenia) {
		this.txtContrasenia = txtContrasenia;
	}


	public JTextField getTxtEstatura() {
		return txtEstatura;
	}


	public void setTxtEstatura(JTextField txtEstatura) {
		this.txtEstatura = txtEstatura;
	}


	public JTextField getTxtIngresos() {
		return txtIngresos;
	}


	public void setTxtIngresos(JTextField txtIngresos) {
		this.txtIngresos = txtIngresos;
	}


	public JComboBox<?> getCbxEstado() {
		return cbxEstado;
	}


	public void setCbxEstado(JComboBox<?> cbxEstado) {
		this.cbxEstado = cbxEstado;
	}


	public JComboBox<?> getCbxGenero() {
		return cbxGenero;
	}


	public void setCbxGenero(JComboBox<?> cbxGenero) {
		this.cbxGenero = cbxGenero;
	}


	public ButtonGroup getBtnGDivorcios() {
		return btnGDivorcios;
	}


	public void setBtnGDivorcios(ButtonGroup btnGDivorcios) {
		this.btnGDivorcios = btnGDivorcios;
	}


	public JRadioButton getSi() {
		return si;
	}


	public void setSi(JRadioButton si) {
		this.si = si;
	}


	public JRadioButton getNo() {
		return no;
	}


	public void setNo(JRadioButton no) {
		this.no = no;
	}


	public JButton getBtnRegistrar() {
		return btnRegistrar;
	}


	public void setBtnRegistrar(JButton btnRegistrar) {
		this.btnRegistrar = btnRegistrar;
	}


	public JButton getBtnInicio() {
		return btnInicio;
	}


	public void setBtnInicio(JButton btnInicio) {
		this.btnInicio = btnInicio;
	}

}