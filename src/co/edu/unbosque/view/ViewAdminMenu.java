package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
/**
 * Clase del menú del administrador
 * Depende de un JPanel
 * 
 * @author Grupo 3
 * @version 12/06/2021
 */
public class ViewAdminMenu extends JPanel{
	
	 private JButton btnBuscarU;
	 private JButton btnRaiting;
	 private JButton btnUsuarios;
	 private JButton btnSalir;
	 
	 /**
	  * Método constructor
	  */
	 public ViewAdminMenu() {
		 setLayout(null);
		 ImageIcon lbSalir = new ImageIcon("graphics/salir.png");
		 btnSalir = new JButton();
		 
			btnSalir.setBounds(560,7,24,24);
			btnSalir.setBackground(new Color(204,0,0));
			btnSalir.setBorder(null);
			btnSalir.setIcon(new ImageIcon(lbSalir.getImage().getScaledInstance(btnSalir.getWidth(), btnSalir.getHeight(),Image.SCALE_SMOOTH)));
			btnSalir.setActionCommand("salir2");
			add(btnSalir);
			
			btnBuscarU = new JButton("Buscar Usuario");
			btnBuscarU.setBounds(0,7,100,24);
			btnBuscarU.setBackground(new Color(204,0,0));
			btnBuscarU.setForeground(Color.white);
			btnBuscarU.setFont(new Font("arial",0,12));
			btnBuscarU.setBorder(new MatteBorder(0,0,0,2,Color.black));
			btnBuscarU.setEnabled(false);
			add(btnBuscarU);
		
			
			btnRaiting = new JButton("Raiting");
			btnRaiting.setBounds(100,7,100,24);
			btnRaiting.setBackground(new Color(204,0,0));
			btnRaiting.setForeground(Color.white);
			btnRaiting.setFont(new Font("arial",0,12));
			btnRaiting.setBorder(new MatteBorder(0,0,0,2,Color.black));
			btnRaiting.setActionCommand("pRai");
			add(btnRaiting);
			
			btnUsuarios = new JButton("Usuarios");
			btnUsuarios.setBounds(200,7,100,24);
			btnUsuarios.setBackground(new Color(204,0,0));
			btnUsuarios.setForeground(Color.white);
			btnUsuarios.setFont(new Font("arial",0,12));
			btnUsuarios.setBorder(new MatteBorder(0,0,0,2,Color.black));
			add(btnUsuarios);
	}

	/**
	 * Devuelve el botón de buscar usuarios
	 * @return btnBuscarU
	 */
	public JButton getBtnBuscarU() {
		return btnBuscarU;
	}

	/**
	 * Modifica el botón de buscar usuarios
	 * @param btnBuscarU
	 */
	public void setBtnBuscarU(JButton btnBuscarU) {
		this.btnBuscarU = btnBuscarU;
	}

	/**
	 * Devuelve el botón para ir al panel de estadisticas
	 * @return btnRaiting
	 */
	public JButton getBtnRaiting() {
		return btnRaiting;
	}

	/**
	 * Modifica el botón para ir al panel de estadisticas
	 * @param btnRaiting
	 */
	public void setBtnRaiting(JButton btnRaiting) {
		this.btnRaiting = btnRaiting;
	}

	/**
	 * Devuelve el botón de ver la lista de usuarios
	 * @return btnUsuarios
	 */
	public JButton getBtnUsuarios() {
		return btnUsuarios;
	}

	/**
	 * Modifica el botón de ver la lista de usuarios
	 * @param btnUsuarios
	 */
	public void setBtnUsuarios(JButton btnUsuarios) {
		this.btnUsuarios = btnUsuarios;
	}

	/**
	 * Devuelve el botón de salir 
	 * @return btnSalir
	 */
	public JButton getBtnSalir() {
		return btnSalir;
	}

	/**
	 * Modifica el botón de salir
	 * @param btnSalir
	 */
	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

}
