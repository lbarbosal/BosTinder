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
/**
 * Clase para modificar los usuarios registrados
 * Depende de un JPanel
 * 
 * @author Grupo 3
 * @version 12/06/2021
 */
public class ViewModificar extends JPanel {

	private JLabel bosstinder;
	private JLabel lbOpcional;
	private JTextField txtAlias;
	private JTextField txtCorreo;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtFNacimiento;
	private JTextField txtEstatura;
	private JTextField txtIngresos;
	private JComboBox<?> cbxEstado;
	private JComboBox<?> cbxGenero;
	private ButtonGroup btnGDivorcios;
	private JButton btnModificar;
	private JButton btnInicio;
	
	/**
	 * M�todo constructor
	 */
	public ViewModificar() {
		setLayout(null);

		ImageIcon titulo = new ImageIcon("graphics/titulo2.png");
		bosstinder = new JLabel();
		bosstinder.setBounds(188, 73, 232, 44);
		bosstinder.setIcon(new ImageIcon(titulo.getImage().getScaledInstance(bosstinder.getWidth(),
				bosstinder.getHeight(), Image.SCALE_SMOOTH)));
		add(bosstinder);

		JLabel lbNombre = new JLabel("Nombre");
		lbNombre.setBounds(102, 137, 51, 21);
		add(lbNombre);
		txtNombre = new JTextField();
		txtNombre.setBounds(102, 162, 177, 27);
		add(txtNombre);

		JLabel lbApellido = new JLabel("Apellido");
		lbApellido.setBounds(322, 137, 47, 21);
		add(lbApellido);
		txtApellido = new JTextField();
		txtApellido.setBounds(322, 162, 177, 27);
		add(txtApellido);

		JLabel lbAlias = new JLabel("Alias");
		lbAlias.setBounds(102, 212, 28, 21);
		add(lbAlias);
		txtAlias = new JTextField();
		txtAlias.setBounds(102, 237, 177, 27);
		txtAlias.setEnabled(false);
		add(txtAlias);

		JLabel lbCorreo = new JLabel("Correo Electr�nico");
		lbCorreo.setBounds(102, 284, 111, 21);
		add(lbCorreo);
		txtCorreo = new JTextField();
		txtCorreo.setBounds(102, 309, 177, 27);
		txtCorreo.setEnabled(false);
		add(txtCorreo);

		JLabel lbFecha = new JLabel("Fecha De Nacimiento");
		lbFecha.setBounds(322, 284, 124, 21);
		add(lbFecha);
		txtFNacimiento = new JTextField();
		txtFNacimiento.setBounds(322, 309, 177, 27);
		txtFNacimiento.setEnabled(false);
		add(txtFNacimiento);

		JLabel lbEstatura = new JLabel("Estatura");
		lbEstatura.setBounds(102, 421, 50, 21);
		add(lbEstatura);
		txtEstatura = new JTextField();
		txtEstatura.setBounds(102, 445, 177, 27);
		add(txtEstatura);

		lbOpcional = new JLabel("");
		lbOpcional.setBounds(322, 421, 200, 21);
		add(lbOpcional);
		txtIngresos = new JTextField();
		txtIngresos.setBounds(322, 445, 177, 27);
		add(txtIngresos);

		JLabel lbEstado = new JLabel("Estado");
		lbEstado.setBounds(102, 357, 42, 21);
		add(lbEstado);
		cbxEstado = new JComboBox();

		cbxEstado.setModel(new DefaultComboBoxModel(new String[] {"Disponible", "No Disponible"}));
		cbxEstado.setBounds(102,378,177,27);

		add(cbxEstado);

		JLabel lbGenero = new JLabel("G�nero");
		lbGenero.setBounds(322, 357, 45, 21);
		add(lbGenero);
		cbxGenero = new JComboBox();

		cbxGenero.setModel(new DefaultComboBoxModel(new String[] {"Masculino","Femenino"}));
		cbxGenero.setBounds(322,378,177,27);

		cbxGenero.setActionCommand("pRegistroGenero");
		cbxGenero.setEnabled(false);
		add(cbxGenero);

		btnModificar = new JButton("Actualizar Datos");
		btnModificar.setBackground(Color.white);
		btnModificar.setBounds(411, 513, 87, 27);
		btnModificar.setFont(new Font("arial", 0, 11));
		btnModificar.setBorder(new MatteBorder(0, 0, 3, 3, Color.black));
		add(btnModificar);

		btnInicio = new JButton("Volver");
		btnInicio.setBackground(Color.white);
		btnInicio.setBounds(101, 513, 87, 27);
		btnInicio.setFont(new Font("arial", 0, 11));
		btnInicio.setBorder(new MatteBorder(0, 0, 3, 3, Color.black));
		add(btnInicio);

	}

	/**
	 * Devuelve el t�tulo de Boostinder
	 * @return
	 */
	public JLabel getBosstinder() {
		return bosstinder;
	}

	/**
	 * Modifica el t�tulo de Bosstinder
	 * @param bosstinder
	 */
	public void setBosstinder(JLabel bosstinder) {
		this.bosstinder = bosstinder;
	}

	/**
	 * Devuelve el t�tulo de opcional
	 * @return
	 */
	public JLabel getLbOpcional() {
		return lbOpcional;
	}
	
	/**
	 * Modifica  el t�tulo de opcional
	 * @param lbOpcional
	 */
	public void setLbOpcional(JLabel lbOpcional) {
		this.lbOpcional = lbOpcional;
	}

	/**
	 * Devuelve el texto de alias
	 * @return txtAlias
	 */
	public JTextField getTxtAlias() {
		return txtAlias;
	}

	/**
	 * Modifica el texto de alias
	 * @param txtAlias
	 */
	public void setTxtAlias(JTextField txtAlias) {
		this.txtAlias = txtAlias;
	}

	/**
	 * Devuelve el texto cel correo
	 * @return txtCorreo
	 */
	public JTextField getTxtCorreo() {
		return txtCorreo;
	}

	/**
	 * Modifica el texto cel correo
	 * @param txtCorreo
	 */
	public void setTxtCorreo(JTextField txtCorreo) {
		this.txtCorreo = txtCorreo;
	}

	/**
	 * Devuelve el texto de nombre
	 * @return txtNombre
	 */
	public JTextField getTxtNombre() {
		return txtNombre;
	}

	/**
	 * Modifica el texto de nombre
	 * @param txtNombre
	 */
	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	/**
	 * Devuelve el texto de apellido
	 * @return txtApellido
	 */
	public JTextField getTxtApellido() {
		return txtApellido;
	}

	/**
	 * Modifica el texto de apellido
	 * @param txtApellido
	 */
	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}

	/**
	 * Devuelve el texto de nacimiento
	 * @return txtFNacimiento
	 */
	public JTextField getTxtFNacimiento() {
		return txtFNacimiento;
	}

	/**
	 * Modifica el texto de nacimiento
	 * @param txtFNacimiento
	 */
	public void setTxtFNacimiento(JTextField txtFNacimiento) {
		this.txtFNacimiento = txtFNacimiento;
	}

	/**
	 * Devuelve el texto de estatura
	 * @return txtEstatura
	 */
	public JTextField getTxtEstatura() {
		return txtEstatura;
	}

	/**
	 * Modifica el texto de estatura
	 * @param txtEstatura
	 */
	public void setTxtEstatura(JTextField txtEstatura) {
		this.txtEstatura = txtEstatura;
	}

	/**
	 * Devuelve el texto de Ingresos
	 * @return txtIngresos
	 */
	public JTextField getTxtIngresos() {
		return txtIngresos;
	}

	/**
	 * Modifica el texto de Ingresos
	 * @param txtIngresos
	 */
	public void setTxtIngresos(JTextField txtIngresos) {
		this.txtIngresos = txtIngresos;
	}

	/**
	 * Devuelve el como box de estado
	 * @return cbxEstado
	 */
	public JComboBox<?> getCbxEstado() {
		return cbxEstado;
	}

	/**
	 * Modifica el combo box de estado
	 * @param cbxEstado
	 */
	public void setCbxEstado(JComboBox<?> cbxEstado) {
		this.cbxEstado = cbxEstado;
	}

	/**
	 * Devuelve el combo box de genero
	 * @return cbxGenero
	 */
	public JComboBox<?> getCbxGenero() {
		return cbxGenero;
	}

	/**
	 * Modifica Devuelve el combo box de genero
	 * @param cbxGenero
	 */
	public void setCbxGenero(JComboBox<?> cbxGenero) {
		this.cbxGenero = cbxGenero;
	}

	/**
	 * Devuelve el bot�n de divorcios
	 * @return btnGDivorcios
	 */
	public ButtonGroup getBtnGDivorcios() {
		return btnGDivorcios;
	}

	/**
	 * Modifica el bot�n de divorcios
	 * @param btnGDivorcios
	 */
	public void setBtnGDivorcios(ButtonGroup btnGDivorcios) {
		this.btnGDivorcios = btnGDivorcios;
	}

	/**
	 * Devuelve el bot�n de modificar
	 * @return btnModificar
	 */
	public JButton getBtnModificar() {
		return btnModificar;
	}

	/**
	 * Modifica el bot�n de modificar
	 * @param btnRegistrar
	 */
	public void setBtnModificar(JButton btnRegistrar) {
		this.btnModificar = btnRegistrar;
	}

	/**
	 * Devuelve el bot�n de inicio
	 * @return btnInicio
	 */
	public JButton getBtnInicio() {
		return btnInicio;
	}

	/**
	 * Modifica el bot�n de inicio
	 * @param btnInicio
	 */
	public void setBtnInicio(JButton btnInicio) {
		this.btnInicio = btnInicio;
	}

}
