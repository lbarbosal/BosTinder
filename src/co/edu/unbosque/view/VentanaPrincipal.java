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
	private ViewAdminEstadisticas pAEstadisticas;
	private ViewAdminRaiting pARaiting;
	
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
		pInicio.setVisible(false);
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
		pABuscar.setVisible(false);
		getContentPane().add(pABuscar);
		
		pAEstadisticas = new ViewAdminEstadisticas();
		pAEstadisticas.setBounds(0,40,600,560);
		pAEstadisticas.setBackground(new Color(245,213,215));
		pAEstadisticas.setVisible(false);
		getContentPane().add(pAEstadisticas);
		
		pARaiting = new ViewAdminRaiting();
		pARaiting.setBounds(0,40,600,560);
		pARaiting.setBackground(new Color(245,213,215));
		pARaiting.setVisible(true);
		getContentPane().add(pARaiting);
		
		
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

	public ViewPerfil getpPerfil() {
		return pPerfil;
	}

	public void setpPerfil(ViewPerfil pPerfil) {
		this.pPerfil = pPerfil;
	}

	public ViewAdminBuscar getpABuscar() {
		return pABuscar;
	}

	public void setpABuscar(ViewAdminBuscar pABuscar) {
		this.pABuscar = pABuscar;
	}

	public ViewAdminMenu getpAMenu() {
		return pAMenu;
	}

	public void setpAMenu(ViewAdminMenu pAMenu) {
		this.pAMenu = pAMenu;
	}

	public ViewAdminEstadisticas getpAEstadisticas() {
		return pAEstadisticas;
	}

	public void setpAEstadisticas(ViewAdminEstadisticas pAEstadisticas) {
		this.pAEstadisticas = pAEstadisticas;
	}

	public ViewAdminRaiting getpARaiting() {
		return pARaiting;
	}

	public void setpARaiting(ViewAdminRaiting pARaiting) {
		this.pARaiting = pARaiting;
	}

	

	
	
}
