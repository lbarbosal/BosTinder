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
	private JLabel lbLResibidos;
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
		
		btnEliminar = new JButton("Eliminar Cuenta");
		btnEliminar.setBounds(53,482,100,27);
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
		btnSalir.setActionCommand("logout");
		btnSalir.setIcon(new ImageIcon(lbSalir.getImage().getScaledInstance(btnSalir.getWidth(), btnSalir.getHeight(),Image.SCALE_SMOOTH)));
		add(btnSalir);
		
		btnConocer = new JButton();
		btnConocer.setBounds(530,40,24,24);
		btnConocer.setBackground(null);
		btnConocer.setBorder(null);
		btnConocer.setActionCommand("conocer");
		btnConocer.setIcon(new ImageIcon(lbPerfil.getImage().getScaledInstance(btnConocer.getWidth(), btnConocer.getHeight(),Image.SCALE_SMOOTH)));
		add(btnConocer);
		
		JLabel lbnombre = new JLabel("Nombre");
		lbnombre.setBounds(74,289,105,21);
		lbnombre.setHorizontalAlignment(JLabel.RIGHT);
		add(lbnombre);
		lbNombre = new JLabel("--");
		lbNombre.setBounds(186,289,105,21);
		add(lbNombre);
		
		JLabel lbapellido = new JLabel("Apellido");
		lbapellido.setBounds(274,289,116,21);
		lbapellido.setHorizontalAlignment(JLabel.RIGHT);
		add(lbapellido);
		lbApellido = new JLabel("--");
		lbApellido.setBounds(397,289,116,21);
		add(lbApellido);
		
		JLabel lbnacimiento = new JLabel("Fecha De Nacimiento");
		lbnacimiento.setBounds(74,316,105,21);
		lbnacimiento.setHorizontalAlignment(JLabel.RIGHT);
		add(lbnacimiento);
		lbFNacimiento = new JLabel("--");
		lbFNacimiento.setBounds(186,316,67,21);
		add(lbFNacimiento);
		
		JLabel lbUsuario = new JLabel("Alias");
		lbUsuario.setBounds(74,339,105,21);
		lbUsuario.setHorizontalAlignment(JLabel.RIGHT);
		add(lbUsuario);
		lbAlias = new JLabel("--");
		lbAlias.setBounds(186,339,105,21);
		add(lbAlias);
		
		JLabel lbcorreo = new JLabel("E-Mail");
		lbcorreo.setBounds(274,339,116,21);
		lbcorreo.setHorizontalAlignment(JLabel.RIGHT);
		add(lbcorreo);
		lbCorreo = new JLabel("--");
		lbCorreo.setBounds(198,339,116,21);
		add(lbCorreo);
		
		JLabel lbedad = new JLabel("Edad");
		lbedad.setBounds(275,316,116,21);
		lbedad.setHorizontalAlignment(JLabel.RIGHT);
		add(lbedad);
		lbEdad = new JLabel("--");
		lbEdad.setBounds(397,316,105,21);	
		add(lbEdad);
		
		JLabel lbestado = new JLabel("Estado");
		lbestado.setBounds(74 ,361,105,21);
		lbestado.setHorizontalAlignment(JLabel.RIGHT);
		add(lbestado);
		lbEstado = new JLabel("--");
		lbEstado.setBounds(186,361,105,21);
		add(lbEstado);
		
		JLabel lbgenero = new JLabel("Género");
		lbgenero.setBounds(274,362,116,21);
		lbgenero.setHorizontalAlignment(JLabel.RIGHT);
		add(lbgenero);
		lbGenero = new JLabel("--");
		lbGenero.setBounds(397,362,116,21);
		add(lbGenero);
		
		JLabel lbestatura = new JLabel("Estatura");
		lbestatura.setBounds(74,384,105,21);
		lbestatura.setHorizontalAlignment(JLabel.RIGHT);
		add(lbestatura);
		lbEstatura = new JLabel("--");
		lbEstatura.setBounds(168,384,105,21);
		add(lbEstatura);
		
		lbDepende = new JLabel("--");
		lbDepende.setBounds(274,384,116,21);
		lbDepende.setHorizontalAlignment(JLabel.RIGHT);
		add(lbDepende);
		lbRespuesta = new JLabel("--");
		lbRespuesta.setBounds(397,384,116,21);
		add(lbRespuesta);
		
		JLabel lblResibidos = new JLabel("Like Resividos");
		lblResibidos.setBounds(130,430,105,21);
		add(lblResibidos);
		lbLResibidos = new JLabel("-");
		lbLResibidos.setBounds(83,427,24,24);
		lbLResibidos.setHorizontalAlignment(JLabel.CENTER);
		add(lbLResibidos);
		JLabel LResibidos = new JLabel();
		LResibidos.setBounds(83,427,24,24);
		LResibidos.setIcon(new ImageIcon(lbLikeR.getImage().getScaledInstance(lbLResibidos.getWidth(), lbLResibidos.getHeight(),Image.SCALE_SMOOTH)));
		add(LResibidos);
		
		JLabel lblOtorgados = new JLabel("Like Otorgados");
		lblOtorgados.setBounds(399,430,105,21);
		add(lblOtorgados);
		lbLOtorgados = new JLabel("-");
		lbLOtorgados.setBounds(368,427,24,24);
		lbLOtorgados.setHorizontalAlignment(JLabel.CENTER);
		add(lbLOtorgados);
		JLabel LOtorgados = new JLabel();
		LOtorgados.setBounds(368,427,24,24);
		LOtorgados.setIcon(new ImageIcon(lbLikeR.getImage().getScaledInstance(LOtorgados.getWidth(), LOtorgados.getHeight(),Image.SCALE_SMOOTH)));
		add(LOtorgados);
				
		JLabel fondo2 = new JLabel();
		fondo2.setOpaque(true);
		fondo2.setBackground(Color.white);
		fondo2.setBorder(new LineBorder(Color.black,5));
		fondo2.setBounds(53,416,482,46);
		add(fondo2);
		
		JLabel fondo1 = new JLabel();
		fondo1.setOpaque(true);
		fondo1.setBackground(Color.white);
		fondo1.setBorder(new LineBorder(Color.black,5));
		fondo1.setBounds(53,278,482,184);
		add(fondo1);
		
		
	}
	public void fotoPerfil(String g){
		ImageIcon hombre = new ImageIcon("graphics/hombres/man.png");
		ImageIcon mujer = new ImageIcon("graphics/mujeres/woman.png");
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

	public JLabel getLbLResibidos() {
		return lbLResibidos;
	}

	public void setLbLResibidos(JLabel lbLResividos) {
		this.lbLResibidos = lbLResividos;
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
	public JLabel getLbNombre() {
		return lbNombre;
	}
	public void setLbNombre(JLabel lbNombre) {
		this.lbNombre = lbNombre;
	}
	public JLabel getLbApellido() {
		return lbApellido;
	}
	public void setLbApellido(JLabel lbApellido) {
		this.lbApellido = lbApellido;
	}
	public JLabel getLbFNacimiento() {
		return lbFNacimiento;
	}
	public void setLbFNacimiento(JLabel lbFNacimiento) {
		this.lbFNacimiento = lbFNacimiento;
	}
	public JLabel getLbCorreo() {
		return lbCorreo;
	}
	public void setLbCorreo(JLabel lbCorreo) {
		this.lbCorreo = lbCorreo;
	}
	public JButton getBtnConocer() {
		return btnConocer;
	}
	public void setBtnConocer(JButton btnConocer) {
		this.btnConocer = btnConocer;
	}
	public JButton getBtnEditar() {
		return btnEditar;
	}
	public void setBtnEditar(JButton btnEditar) {
		this.btnEditar = btnEditar;
	}
	public JButton getBtnEliminar() {
		return btnEliminar;
	}
	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}
	

}
