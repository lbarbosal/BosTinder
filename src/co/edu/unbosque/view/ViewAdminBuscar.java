package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class ViewAdminBuscar extends JPanel{
	
	
	 
	 private JTextField txtBuscador;
	 private JButton btnBuscar;
	 
	 private JLabel bosstinder;
	 private JLabel lbEstado;
	 private JLabel lbNombre;
	 private JLabel lbApellido;
	 private JLabel lbFNacimiento;
	 private JLabel lbEdad;
	 private JLabel lbAlias;
	 private JLabel lbCorreo;
	 private JLabel lbGenero;
	 private JLabel lbEstatura;
	 private JLabel lbDepende;
	 private JLabel lbRespuesta;
	 private JLabel lbLResividos;
	 private JLabel lbLOtorgados;
	 private JButton btnEliminar;
	 
	 public ViewAdminBuscar() {
	 ImageIcon titulo = new ImageIcon("graphics/tituloAdmin.png");
	 ImageIcon lbLikeR = new ImageIcon("graphics/corazonR.png");
	 ImageIcon lbBuscar = new ImageIcon("graphics/lupa.png");
	 
	 setLayout(null);
	 	bosstinder = new JLabel();
		bosstinder.setBounds(103,85,394,44);
		bosstinder.setIcon(new ImageIcon(titulo.getImage().getScaledInstance(bosstinder.getWidth(), bosstinder.getHeight(),Image.SCALE_SMOOTH)));
		add(bosstinder);
		
		
		txtBuscador = new JTextField();
		txtBuscador.setBounds(59,174,428,27);
		add(txtBuscador);
		
		btnBuscar = new JButton();
		btnBuscar.setBounds(503,176,24,24);
		btnBuscar.setBackground(null);
		btnBuscar.setBorder(null);
		btnBuscar.setIcon(new ImageIcon(lbBuscar.getImage().getScaledInstance(btnBuscar.getWidth(), btnBuscar.getHeight(),Image.SCALE_SMOOTH)));
		add(btnBuscar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(454,456,87,30);
		btnEliminar.setBackground(Color.white);
		btnEliminar.setFont(new Font("arial",0,11));
		btnEliminar.setBorder( new MatteBorder(0,0,3,3,Color.black));
		add(btnEliminar);
		
		JLabel lbnombre = new JLabel("Nombre");
		lbnombre.setBounds(80,246,105,21);
		lbnombre.setHorizontalAlignment(JLabel.RIGHT);
		add(lbnombre);
		lbNombre = new JLabel("--");
		lbNombre.setBounds(192,246,105,21);
		add(lbNombre);
		
		JLabel lbapellido = new JLabel("Apellido");
		lbapellido.setBounds(280,246,116,21);
		lbapellido.setHorizontalAlignment(JLabel.RIGHT);
		add(lbapellido);
		lbApellido = new JLabel("--");
		lbApellido.setBounds(403,246,116,21);
		add(lbApellido);
		
		JLabel lbnacimiento = new JLabel("Fecha De Nacimiento");
		lbnacimiento.setBounds(80,273,105,21);
		lbnacimiento.setHorizontalAlignment(JLabel.RIGHT);
		add(lbnacimiento);
		lbFNacimiento = new JLabel("--");
		lbFNacimiento.setBounds(192,273,67,21);
		add(lbFNacimiento);
		
		JLabel lbUsuario = new JLabel("Alias");
		lbUsuario.setBounds(80,296,105,21);
		lbUsuario.setHorizontalAlignment(JLabel.RIGHT);
		add(lbUsuario);
		lbAlias = new JLabel("--");
		lbAlias.setBounds(192,296,105,21);
		add(lbAlias);
		
		JLabel lbcorreo = new JLabel("E-Mail");
		lbcorreo.setBounds(281,296,116,21);
		lbcorreo.setHorizontalAlignment(JLabel.RIGHT);
		add(lbcorreo);
		lbCorreo = new JLabel("--");
		lbCorreo.setBounds(404,296,116,21);
		add(lbCorreo);
		
		JLabel lbedad = new JLabel("Edad");
		lbedad.setBounds(280,273,116,21);
		lbedad.setHorizontalAlignment(JLabel.RIGHT);
		add(lbedad);
		lbEdad = new JLabel("--");
		lbEdad.setBounds(403,273,105,21);	
		add(lbEdad);
		
		JLabel lbestado = new JLabel("Estado");
		lbestado.setBounds(80 ,318,105,21);
		lbestado.setHorizontalAlignment(JLabel.RIGHT);
		add(lbestado);
		lbEstado = new JLabel("--");
		lbEstado.setBounds(192,318,105,21);
		add(lbEstado);
		
		JLabel lbgenero = new JLabel("Genero");
		lbgenero.setBounds(280,319,116,21);
		lbgenero.setHorizontalAlignment(JLabel.RIGHT);
		add(lbgenero);
		lbGenero = new JLabel("--");
		lbGenero.setBounds(403,319,116,21);
		add(lbGenero);
		
		JLabel lbestatura = new JLabel("Estatura");
		lbestatura.setBounds(80,341,105,21);
		lbestatura.setHorizontalAlignment(JLabel.RIGHT);
		add(lbestatura);
		lbEstatura = new JLabel("--");
		lbEstatura.setBounds(192,341,105,21);
		add(lbEstatura);
		
		lbDepende = new JLabel("--");
		lbDepende.setBounds(280,341,116,21);
		lbDepende.setHorizontalAlignment(JLabel.RIGHT);
		add(lbDepende);
		lbRespuesta = new JLabel("--");
		lbRespuesta.setBounds(403,341,116,21);
		add(lbRespuesta);
		
		JLabel lblResividos = new JLabel("Like Resividos");
		lblResividos.setBounds(120,387,105,21);
		add(lblResividos);
		lbLResividos = new JLabel("-");
		lbLResividos.setBounds(89,384,24,24);
		lbLResividos.setHorizontalAlignment(JLabel.CENTER);
		add(lbLResividos);
		JLabel LResividos = new JLabel();
		LResividos.setBounds(89,384,24,24);
		LResividos.setIcon(new ImageIcon(lbLikeR.getImage().getScaledInstance(lbLResividos.getWidth(), lbLResividos.getHeight(),Image.SCALE_SMOOTH)));
		add(LResividos);
		
		JLabel lblOtorgados = new JLabel("Like Otorgados");
		lblOtorgados.setBounds(405,387,105,21);
		add(lblOtorgados);
		lbLOtorgados = new JLabel("-");
		lbLOtorgados.setBounds(374,384,24,24);
		lbLOtorgados.setHorizontalAlignment(JLabel.CENTER);
		add(lbLOtorgados);
		JLabel LOtorgados = new JLabel();
		LOtorgados.setBounds(374,384,24,24);
		LOtorgados.setIcon(new ImageIcon(lbLikeR.getImage().getScaledInstance(LOtorgados.getWidth(), LOtorgados.getHeight(),Image.SCALE_SMOOTH)));
		add(LOtorgados);
		
		JLabel fondo2 = new JLabel();
		fondo2.setOpaque(true);
		fondo2.setBackground(Color.white);
		fondo2.setBorder(new LineBorder(Color.black,5));
		fondo2.setBounds(59,373,482,46);
		add(fondo2);
		
		JLabel fondo1 = new JLabel();
		fondo1.setOpaque(true);
		fondo1.setBackground(Color.white);
		fondo1.setBorder(new LineBorder(Color.black,5));
		fondo1.setBounds(59,235,482,184);
		add(fondo1);
		

	 }

}
