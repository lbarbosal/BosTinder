package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	
	private ViewInicio pInicio;
	private ViewRegistro pRegistro;
	
	
	public VentanaPrincipal() {
		
		setTitle("Bostinder");
		setSize(600,600);
		setBackground(new Color(245,213,215));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		inicializar();
	}
	
	public void inicializar(){
		
		
		pInicio = new ViewInicio();
		pInicio.setBounds(0,0,600,600);
		pInicio.setBackground(new Color(245,213,215));
		pInicio.setVisible(false);
		getContentPane().add(pInicio);
		System.out.println("inicio");
		pRegistro= new ViewRegistro();
		pRegistro.setBounds(0,0,600,600);
		pRegistro.setBackground(new Color(245,213,215));
		pRegistro.setVisible(true);
		getContentPane().add(pRegistro);
		
	}

	

	
	
}
