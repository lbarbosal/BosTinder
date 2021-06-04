package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	
	private ViewInicio pInicio;
	private ViewRegistro pRegistro;
	private ViewConocer pConocer;
	
	public VentanaPrincipal() {
		
		setTitle("Bostinder");
		setSize(616,638);
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
		
		pRegistro= new ViewRegistro();
		pRegistro.setBounds(0,0,600,600);
		pRegistro.setBackground(new Color(245,213,215));
		pRegistro.setVisible(true);
		getContentPane().add(pRegistro);
		
		pConocer= new ViewConocer();
		pConocer.setBounds(0,0,600,600);
		pConocer.setBackground(new Color(204,0,0));
		pConocer.setVisible(false);
		getContentPane().add(pConocer);
		
	}

	public ViewInicio getpInicio() {
		return pInicio;
	}

	public void setpInicio(ViewInicio pInicio) {
		this.pInicio = pInicio;
	}

	public ViewRegistro getpRegistro() {
		return pRegistro;
	}

	public void setpRegistro(ViewRegistro pRegistro) {
		this.pRegistro = pRegistro;
	}

	public ViewConocer getpConocer() {
		return pConocer;
	}

	public void setpConocer(ViewConocer pConocer) {
		this.pConocer = pConocer;
	}

	

	
	
}
