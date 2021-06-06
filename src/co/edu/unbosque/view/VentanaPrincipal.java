package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.border.MatteBorder;

public class VentanaPrincipal extends JFrame {
	
	private ViewInicio pInicio;
	private ViewRegistro pRegistro;
	private ViewConocer pConocer;
	private ViewPerfil pPerfil;
	private ViewAdminBuscar pABuscar;
	private ViewAdminMenu pAMenu;
	
	public VentanaPrincipal() {
		
		setTitle("Bostinder");
		setSize(616,638);
		setBackground(new Color(245,213,215));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
	    setLocationRelativeTo(null);
		inicializar();
	}
	
	public void inicializar(){
		
		
		pInicio = new ViewInicio();
		pInicio.setBounds(0,0,600,600);
		pInicio.setBackground(new Color(245,213,215));
		pInicio.setVisible(true);
		getContentPane().add(pInicio);
		
		pRegistro= new ViewRegistro();
		pRegistro.setBounds(0,0,600,600);
		pRegistro.setBackground(new Color(245,213,215));
		pRegistro.setVisible(false);
		getContentPane().add(pRegistro);
		
		pConocer= new ViewConocer();
		pConocer.setBounds(0,0,600,600);
		pConocer.setBackground(new Color(204,0,0));
		pConocer.setVisible(false);
		getContentPane().add(pConocer);
		
		pPerfil= new ViewPerfil();
		pPerfil.setBounds(0,0,600,600);
		pPerfil.setBackground(new Color(204,0,0));
		pPerfil.setVisible(false);
		getContentPane().add(pPerfil);
		
		pAMenu= new ViewAdminMenu();
		pAMenu.setBounds(0,0,600,40);
		pAMenu.setBackground(new Color(204,0,0));
		pAMenu.setVisible(true);
		pAMenu.setBorder( new MatteBorder(0,0,3,3,Color.black));
		getContentPane().add(pAMenu);
		
		pABuscar = new ViewAdminBuscar();
		pABuscar.setBounds(0,40,600,560);
		pABuscar.setBackground(new Color(245,213,215));
		pABuscar.setVisible(true);
		getContentPane().add(pABuscar);
		
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
