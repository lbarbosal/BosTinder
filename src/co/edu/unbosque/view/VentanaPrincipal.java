package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.border.MatteBorder;
/**
 * Clase de la Ventana principal
 * Depende de un JFrame
 * 
 * @author Grupo 3
 * @version 12/06/2021
 */
public class VentanaPrincipal extends JFrame {
	
	private ViewInicio pInicio;
	private ViewRegistro pRegistro;
	private ViewConocer pConocer;
	private ViewPerfil pPerfil;
	private ViewAdminBuscar pABuscar;
	private ViewAdminMenu pAMenu;
	private ViewAdminEstadisticas pAEstadisticas;
	private ViewAdminUsuarios pAUsuarios;
	private ViewModificar pModificar;
	
	/**
	 * Método Constructor
	 */	
	public VentanaPrincipal() {
		
		setTitle("Bostinder");
		setSize(616,638);
		setBackground(new Color(245,213,215));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
	    setLocationRelativeTo(null);
	    setResizable(false);
		inicializar();
	}
	
	/**
	 * Método para inicializar los componentes de cada JPanel
	 * <b>pre</b> Tener hecho los JPanel<br>
	 * <b>pos</b> Inicializa la interfaz grafica<br>
	 */
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
		pAMenu.setVisible(false);
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
		
		pAUsuarios = new ViewAdminUsuarios();
		pAUsuarios.setBounds(0,40,600,560);
		pAUsuarios.setBackground(new Color(245,213,215));
		pAUsuarios.setVisible(false);
		getContentPane().add(pAUsuarios);
		
		pModificar = new ViewModificar();
		pModificar.setBounds(0,0,600,600);
		pModificar.setBackground(new Color(204,0,0));
		pModificar.setVisible(false);
		getContentPane().add(pModificar);
	}
	
	/**
	 * Devuelve el panel de la pantalla de inicio inicio
	 * @return pInicio
	 */
	public ViewInicio getpInicio() {
		return pInicio;
	}
	
	/**
	 * Modifica el panel de la pantalla de inicio
	 * @param pInicio
	 */
	public void setpInicio(ViewInicio pInicio) {
		this.pInicio = pInicio;
	}
	
	/**
	 * Devuelve el panel del registro
	 * @return pRegistro
	 */
	public ViewRegistro getpRegistro() {
		return pRegistro;
	}
	
	/**
	 * Modifica el panel del registro
	 * @param pRegistro
	 */
	public void setpRegistro(ViewRegistro pRegistro) {
		this.pRegistro = pRegistro;
	}
	
	/**
	 * Devuelve el panel de conocer otros usuarios
	 * @return pConocer
	 */
	public ViewConocer getpConocer() {
		return pConocer;
	}
	
	/**
	 * Modifica el panel de conocer otros usuarios
	 * @param pConocer
	 */
	public void setpConocer(ViewConocer pConocer) {
		this.pConocer = pConocer;
	}
	
	/**
	 * Devuelve el panel del perfil del usuario
	 * @return pPerfil
	 */
	public ViewPerfil getpPerfil() {
		return pPerfil;
	}
	
	/**
	 * Modifica el panel del perfil de usurario
	 * @param pPerfil
	 */
	public void setpPerfil(ViewPerfil pPerfil) {
		this.pPerfil = pPerfil;
	}
	
	/**
	 * Devuelve el panel de buscar usuarios
	 * @return pABuscar
	 */
	public ViewAdminBuscar getpABuscar() {
		return pABuscar;
	}
	
	/**
	 * Modifica el panel de buscar usuarios
	 * @param pABuscar
	 */
	public void setpABuscar(ViewAdminBuscar pABuscar) {
		this.pABuscar = pABuscar;
	}
	
	/**
	 * Devuelve el panel del menú del administrador
	 * @return pAMenu
	 */
	public ViewAdminMenu getpAMenu() {
		return pAMenu;
	}
		
	/**
	 * Modifica el panel del menú del administrador
	 * @param pAMenu
	 */
	public void setpAMenu(ViewAdminMenu pAMenu) {
		this.pAMenu = pAMenu;
	}
	
	/**
	 * Devuelve el panel de las estadísticas
	 * @return pAEstadisticas
	 */
	public ViewAdminEstadisticas getpAEstadisticas() {
		return pAEstadisticas;
	}
	
	/**
	 * Modifica el panel de las estadísticas
	 * @param pAEstadisticas
	 */
	public void setpAEstadisticas(ViewAdminEstadisticas pAEstadisticas) {
		this.pAEstadisticas = pAEstadisticas;
	}
	
	/**
	 * Devuelve el panel de buscar usuarios para el administrador
	 * @return pAUsuarios
	 */
	public ViewAdminUsuarios getpAUsuarios() {
		return pAUsuarios;
	}
	
	/**
	 * Modifica el panel de buscar usuarios d¿para el administrador
	 * @param pARaiting
	 */
	public void setpAUsuarios(ViewAdminUsuarios pARaiting) {
		this.pAUsuarios = pARaiting;
	}
	
	/**
	 * Devuelve el panel de modificar usuarios
	 * @return pModificar
	 */
	public ViewModificar getpModificar() {
		return pModificar;
	}
	
	/**
	 * Modifica el panel de modificar usuarios
	 * @param pModificar
	 */
	public void setpModificar(ViewModificar pModificar) {
		this.pModificar = pModificar;
	}

}
