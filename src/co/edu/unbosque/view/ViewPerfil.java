package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class ViewPerfil extends JPanel{
	
	private JLabel bosstinder;
	private JLabel perfil;
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
	private JButton btnSalir;
	private JButton btnConocer;
	private JButton btnEditar;
	private JButton btnEliminar;
	
	public ViewPerfil() {
		setLayout(null);
		ImageIcon titulo = new ImageIcon("graphics/titulo2.png");
		ImageIcon lbperfil = new ImageIcon("graphics/perfil.png");
		ImageIcon lbLikeR = new ImageIcon("graphics/corazonR.png");
		ImageIcon lbSalir = new ImageIcon("graphics/salir.png");
		ImageIcon lbPerfil = new ImageIcon("graphics/buscar.png");
		ImageIcon hombre = new ImageIcon("graphics/hombre/man.png");
		ImageIcon mujer = new ImageIcon("graphics/mujeres/women.png");
		
		bosstinder = new JLabel();
		bosstinder.setBounds(192,51,232,44);
		bosstinder.setIcon(new ImageIcon(titulo.getImage().getScaledInstance(bosstinder.getWidth(), bosstinder.getHeight(),Image.SCALE_SMOOTH)));
		add(bosstinder);
		
		
		perfil = new JLabel();
		perfil.setBounds(236,114,148,148);
		perfil.setIcon(new ImageIcon(lbperfil.getImage().getScaledInstance(perfil.getWidth(), perfil.getHeight(),Image.SCALE_SMOOTH)));
		add(perfil);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(53,482,60,27);
		btnEliminar.setBackground(Color.white);
		btnEliminar.setFont(new Font("arial",0,11));
		btnEliminar.setBorder( new MatteBorder(0,0,3,3,Color.black));
		add(btnEliminar);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(489,482,60,27);
		btnEditar.setBackground(Color.white);
		btnEditar.setFont(new Font("arial",0,11));
		btnEditar.setBorder( new MatteBorder(0,0,3,3,Color.black));
		add(btnEditar);
		
		btnSalir = new JButton();
		btnSalir.setBounds(560,40,24,24);
		btnSalir.setBackground(null);
		btnSalir.setBorder(null);
		btnSalir.setIcon(new ImageIcon(lbSalir.getImage().getScaledInstance(btnSalir.getWidth(), btnSalir.getHeight(),Image.SCALE_SMOOTH)));
		add(btnSalir);
		
		btnConocer = new JButton();
		btnConocer.setBounds(530,40,24,24);
		btnConocer.setBackground(null);
		btnConocer.setBorder(null);
		btnConocer.setIcon(new ImageIcon(lbPerfil.getImage().getScaledInstance(btnConocer.getWidth(), btnConocer.getHeight(),Image.SCALE_SMOOTH)));
		add(btnConocer);
		
		JLabel lbnombre = new JLabel("Nombre");
		lbnombre.setBounds(90,289,105,21);
		lbnombre.setHorizontalAlignment(JLabel.RIGHT);
		add(lbnombre);
		lbNombre = new JLabel("--");
		lbNombre.setBounds(202,289,105,21);
		add(lbNombre);
		
		JLabel lbapellido = new JLabel("Apellido");
		lbapellido.setBounds(290,289,116,21);
		lbapellido.setHorizontalAlignment(JLabel.RIGHT);
		add(lbapellido);
		lbApellido = new JLabel("--");
		lbApellido.setBounds(413,289,116,21);
		add(lbApellido);
		
		JLabel lbnacimiento = new JLabel("Fecha De Nacimiento");
		lbnacimiento.setBounds(90,316,105,21);
		lbnacimiento.setHorizontalAlignment(JLabel.RIGHT);
		add(lbnacimiento);
		lbFNacimiento = new JLabel("--");
		lbFNacimiento.setBounds(202,316,67,21);
		add(lbFNacimiento);
		
		JLabel lbUsuario = new JLabel("Alias");
		lbUsuario.setBounds(90,339,105,21);
		lbUsuario.setHorizontalAlignment(JLabel.RIGHT);
		add(lbUsuario);
		lbAlias = new JLabel("--");
		lbAlias.setBounds(202,339,105,21);
		add(lbAlias);
		
		JLabel lbcorreo = new JLabel("E-Mail");
		lbcorreo.setBounds(290,339,116,21);
		lbcorreo.setHorizontalAlignment(JLabel.RIGHT);
		add(lbcorreo);
		lbCorreo = new JLabel("--");
		lbCorreo.setBounds(414,339,116,21);
		add(lbCorreo);
		
		JLabel lbedad = new JLabel("Edad");
		lbedad.setBounds(290,316,116,21);
		lbedad.setHorizontalAlignment(JLabel.RIGHT);
		add(lbedad);
		lbEdad = new JLabel("--");
		lbEdad.setBounds(413,316,105,21);	
		add(lbEdad);
		
		JLabel lbestado = new JLabel("Estado");
		lbestado.setBounds(90 ,361,105,21);
		lbestado.setHorizontalAlignment(JLabel.RIGHT);
		add(lbestado);
		lbEstado = new JLabel("--");
		lbEstado.setBounds(202,361,105,21);
		add(lbEstado);
		
		JLabel lbgenero = new JLabel("Genero");
		lbgenero.setBounds(290,362,116,21);
		lbgenero.setHorizontalAlignment(JLabel.RIGHT);
		add(lbgenero);
		lbGenero = new JLabel("--");
		lbGenero.setBounds(413,362,116,21);
		add(lbGenero);
		
		JLabel lbestatura = new JLabel("Estatura");
		lbestatura.setBounds(90,384,105,21);
		lbestatura.setHorizontalAlignment(JLabel.RIGHT);
		add(lbestatura);
		lbEstatura = new JLabel("--");
		lbEstatura.setBounds(202,384,105,21);
		add(lbEstatura);
		
		lbDepende = new JLabel("--");
		lbDepende.setBounds(290,384,116,21);
		lbDepende.setHorizontalAlignment(JLabel.RIGHT);
		add(lbDepende);
		lbRespuesta = new JLabel("--");
		lbRespuesta.setBounds(413,384,116,21);
		add(lbRespuesta);
		
		JLabel lblResividos = new JLabel("Like Resividos");
		lblResividos.setBounds(130,430,105,21);
		add(lblResividos);
		lbLResividos = new JLabel("-");
		lbLResividos.setBounds(99,427,24,24);
		lbLResividos.setHorizontalAlignment(JLabel.CENTER);
		add(lbLResividos);
		JLabel LResividos = new JLabel();
		LResividos.setBounds(99,427,24,24);
		LResividos.setIcon(new ImageIcon(lbLikeR.getImage().getScaledInstance(lbLResividos.getWidth(), lbLResividos.getHeight(),Image.SCALE_SMOOTH)));
		add(LResividos);
		
		JLabel lblOtorgados = new JLabel("Like Otorgados");
		lblOtorgados.setBounds(415,430,105,21);
		add(lblOtorgados);
		lbLOtorgados = new JLabel("-");
		lbLOtorgados.setBounds(384,427,24,24);
		lbLOtorgados.setHorizontalAlignment(JLabel.CENTER);
		add(lbLOtorgados);
		JLabel LOtorgados = new JLabel();
		LOtorgados.setBounds(384,427,24,24);
		LOtorgados.setIcon(new ImageIcon(lbLikeR.getImage().getScaledInstance(LOtorgados.getWidth(), LOtorgados.getHeight(),Image.SCALE_SMOOTH)));
		add(LOtorgados);
				
		JLabel fondo2 = new JLabel();
		fondo2.setOpaque(true);
		fondo2.setBackground(Color.white);
		fondo2.setBorder(new LineBorder(Color.black,5));
		fondo2.setBounds(69,416,482,46);
		add(fondo2);
		
		JLabel fondo1 = new JLabel();
		fondo1.setOpaque(true);
		fondo1.setBackground(Color.white);
		fondo1.setBorder(new LineBorder(Color.black,5));
		fondo1.setBounds(69,278,482,184);
		add(fondo1);
		
		
	}
	public void fotoPerfil(String g){
		ImageIcon hombre = new ImageIcon("graphics/hombre/man.png");
		ImageIcon mujer = new ImageIcon("graphics/mujeres/women.png");
		if(g.equals("Masculino"))
		perfil.setIcon(new ImageIcon(hombre.getImage().getScaledInstance(perfil.getWidth(), perfil.getHeight(),Image.SCALE_SMOOTH)));
		else
		perfil.setIcon(new ImageIcon(mujer.getImage().getScaledInstance(perfil.getWidth(), perfil.getHeight(),Image.SCALE_SMOOTH)));
	}

	public JLabel getBosstinder() {
		return bosstinder;
	}

	public void setBosstinder(JLabel bosstinder) {
		this.bosstinder = bosstinder;
	}

	public JLabel getPerfil() {
		return perfil;
	}

	public void setPerfil(JLabel perfil) {
		this.perfil = perfil;
	}

	public JLabel getLbEstado() {
		return lbEstado;
	}

	public void setLbEstado(JLabel lbEstado) {
		this.lbEstado = lbEstado;
	}

	public JLabel getLbEdad() {
		return lbEdad;
	}

	public void setLbEdad(JLabel lbEdad) {
		this.lbEdad = lbEdad;
	}

	public JLabel getLbAlias() {
		return lbAlias;
	}

	public void setLbAlias(JLabel lbAlias) {
		this.lbAlias = lbAlias;
	}

	public JLabel getLbGenero() {
		return lbGenero;
	}

	public void setLbGenero(JLabel lbGenero) {
		this.lbGenero = lbGenero;
	}

	public JLabel getLbEstatura() {
		return lbEstatura;
	}

	public void setLbEstatura(JLabel lbEstatura) {
		this.lbEstatura = lbEstatura;
	}

	public JLabel getLbDepende() {
		return lbDepende;
	}

	public void setLbDepende(JLabel lbDepende) {
		this.lbDepende = lbDepende;
	}

	public JLabel getLbRespuesta() {
		return lbRespuesta;
	}

	public void setLbRespuesta(JLabel lbRespuesta) {
		this.lbRespuesta = lbRespuesta;
	}

	public JLabel getLbLResividos() {
		return lbLResividos;
	}

	public void setLbLResividos(JLabel lbLResividos) {
		this.lbLResividos = lbLResividos;
	}

	public JLabel getLbLOtorgados() {
		return lbLOtorgados;
	}

	public void setLbLOtorgados(JLabel lbLOtorgados) {
		this.lbLOtorgados = lbLOtorgados;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JButton getBtnPerfil() {
		return btnConocer;
	}

	public void setBtnPerfil(JButton btnPerfil) {
		this.btnConocer = btnPerfil;
	}

	public JButton getBtnLike() {
		return btnEditar;
	}

	public void setBtnLike(JButton btnLike) {
		this.btnEditar = btnLike;
	}

	public JButton getBtnDislike() {
		return btnEliminar;
	}

	public void setBtnDislike(JButton btnDislike) {
		this.btnEliminar = btnDislike;
	}
	

}
