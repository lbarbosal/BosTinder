package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewAdminRaiting extends JPanel{
	
	private JLabel bosstinder;
	 private JComboBox<?> cbxSentido;
	 private JComboBox<?> cbxDato;
	 private JTable tabla;
	private DefaultTableModel modelo;
		
	 public ViewAdminRaiting() {
		 setLayout(null);
		 ImageIcon titulo = new ImageIcon("graphics/tituloAdmin.png");
		 ImageIcon lbLikeR = new ImageIcon("graphics/corazonR.png");
		 ImageIcon lbBuscar = new ImageIcon("graphics/lupa.png");
		 
		 bosstinder = new JLabel();
		 bosstinder.setBounds(103,85,394,44);
			bosstinder.setIcon(new ImageIcon(titulo.getImage().getScaledInstance(bosstinder.getWidth(), bosstinder.getHeight(),Image.SCALE_SMOOTH)));
			add(bosstinder);
			
			cbxDato = new JComboBox();
			cbxDato.setModel(new DefaultComboBoxModel(new String[] {"Numero De Likes","Edad"}));
			cbxDato.setBounds(322,378,177,27);
			add(cbxDato);
			
			cbxSentido = new JComboBox();
			cbxSentido.setModel(new DefaultComboBoxModel(new String[] {"Ascendente","Descendente"}));
			cbxSentido.setBounds(322,378,177,27);
			add(cbxSentido);
			
			modelo = new DefaultTableModel();
			tabla = new JTable();
			tabla.setBounds(50, 200, 700, 300);
			modelo.addColumn("Nombre");
			modelo.addColumn("Apellido");
			modelo.addColumn("Cédula");
			modelo.addColumn("Fecha de Expedición");
			modelo.addColumn("Lugar de Expedición");
			modelo.addColumn("Edad");
			modelo.addColumn("Género");
			modelo.addColumn("Mesa");
			tabla.setModel(modelo);
			add(tabla);
			
			JScrollPane scrollPane = new JScrollPane(tabla);
			scrollPane.setBounds(50, 200, 700, 300);
			add(scrollPane);
	 }

}
