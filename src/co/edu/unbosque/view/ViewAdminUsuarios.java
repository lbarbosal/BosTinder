package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewAdminUsuarios extends JPanel{
	
	private JLabel bosstinder;
	private JButton btnBuscar;
	 private JComboBox<?> cbxSentido;
	 private JComboBox<?> cbxDato;
	 private JTable tabla;
	private DefaultTableModel modelo;
		
	 public ViewAdminUsuarios() {
		 setLayout(null);
		 ImageIcon titulo = new ImageIcon("graphics/tituloAdmin.png");
		 ImageIcon lbLikeR = new ImageIcon("graphics/corazonR.png");
		 ImageIcon lbBuscar = new ImageIcon("graphics/lupa.png");
		 
		 bosstinder = new JLabel();
		 bosstinder.setBounds(103,85,394,44);
			bosstinder.setIcon(new ImageIcon(titulo.getImage().getScaledInstance(bosstinder.getWidth(), bosstinder.getHeight(),Image.SCALE_SMOOTH)));
			add(bosstinder);
			
			btnBuscar = new JButton();
			btnBuscar.setBounds(537,170,24,24);
			btnBuscar.setBackground(null);
			btnBuscar.setBorder(null);
			btnBuscar.setActionCommand("btnOrden");
			btnBuscar.setIcon(new ImageIcon(lbBuscar.getImage().getScaledInstance(btnBuscar.getWidth(), btnBuscar.getHeight(),Image.SCALE_SMOOTH)));
			add(btnBuscar);
			
			cbxDato = new JComboBox();
			cbxDato.setModel(new DefaultComboBoxModel(new String[] {"Número De Likes","Apellido","Edad","Alias"}));
			cbxDato.setBounds(35,169,242,27);
			add(cbxDato);
			
			cbxSentido = new JComboBox();
			cbxSentido.setModel(new DefaultComboBoxModel(new String[] {"Ascendente","Descendente"}));
			cbxSentido.setBounds(293,169,220,27);
			add(cbxSentido);
			
			modelo = new DefaultTableModel();
			tabla = new JTable();
			tabla.setBounds(35, 226, 529, 231);
			modelo.addColumn("Nombre");
			modelo.addColumn("Apellido");
			modelo.addColumn("Fecha de nacimiento");
			modelo.addColumn("Edad");
			modelo.addColumn("Alias");
			modelo.addColumn("# likes");
			modelo.addColumn("# otorgados");
			modelo.addColumn("Género");
			tabla.setModel(modelo);
			add(tabla);
			
			JScrollPane scrollPane = new JScrollPane(tabla);
			scrollPane.setBounds(35, 226,529,231);
			add(scrollPane);
	 }

	public JLabel getBosstinder() {
		return bosstinder;
	}

	public void setBosstinder(JLabel bosstinder) {
		this.bosstinder = bosstinder;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public JComboBox<?> getCbxSentido() {
		return cbxSentido;
	}

	public void setCbxSentido(JComboBox<?> cbxSentido) {
		this.cbxSentido = cbxSentido;
	}

	public JComboBox<?> getCbxDato() {
		return cbxDato;
	}

	public void setCbxDato(JComboBox<?> cbxDato) {
		this.cbxDato = cbxDato;
	}

	public JTable getTabla() {
		return tabla;
	}

	public void setTabla(JTable tabla) {
		this.tabla = tabla;
	}

	public DefaultTableModel getModelo() {
		return modelo;
	}

	public void setModelo(DefaultTableModel modelo) {
		this.modelo = modelo;
	}
	
}
