package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

public class ViewAdminMenu extends JPanel{
	
	 private JButton btnBuscarU;
	 private JButton btnGenerar;
	 private JButton btnRaiting;
	 private JButton btnUsuarios;
	 private JButton btnSalir;
	 
	 public ViewAdminMenu() {
		 setLayout(null);
		 ImageIcon lbSalir = new ImageIcon("graphics/salir.png");
		 btnSalir = new JButton();
		 
			btnSalir.setBounds(560,7,24,24);
			btnSalir.setBackground(new Color(204,0,0));
			btnSalir.setBorder(null);
			btnSalir.setIcon(new ImageIcon(lbSalir.getImage().getScaledInstance(btnSalir.getWidth(), btnSalir.getHeight(),Image.SCALE_SMOOTH)));
			add(btnSalir);
			
			btnBuscarU = new JButton("Buscar Usuario");
			btnBuscarU.setBounds(0,7,100,24);
			btnBuscarU.setBackground(new Color(204,0,0));
			btnBuscarU.setForeground(Color.white);
			btnBuscarU.setFont(new Font("arial",0,12));
			btnBuscarU.setBorder(new MatteBorder(0,0,0,2,Color.black));
			btnBuscarU.setEnabled(false);
			add(btnBuscarU);
			
			btnGenerar = new JButton("Generar");
			btnGenerar.setBounds(100,7,100,24);
			btnGenerar.setBackground(new Color(204,0,0));
			btnGenerar.setForeground(Color.white);
			btnGenerar.setFont(new Font("arial",0,12));
			btnGenerar.setBorder(new MatteBorder(0,0,0,2,Color.black));
			add(btnGenerar);
			
			btnRaiting = new JButton("Raiting");
			btnRaiting.setBounds(200,7,100,24);
			btnRaiting.setBackground(new Color(204,0,0));
			btnRaiting.setForeground(Color.white);
			btnRaiting.setFont(new Font("arial",0,12));
			btnRaiting.setBorder(new MatteBorder(0,0,0,2,Color.black));
			add(btnRaiting);
			
			btnUsuarios = new JButton("Usuarios");
			btnUsuarios.setBounds(300,7,100,24);
			btnUsuarios.setBackground(new Color(204,0,0));
			btnUsuarios.setForeground(Color.white);
			btnUsuarios.setFont(new Font("arial",0,12));
			btnUsuarios.setBorder(new MatteBorder(0,0,0,2,Color.black));
			add(btnUsuarios);
	 }

}
