package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class ViewConocer extends JPanel{
	
	private JLabel bosstinder;
	private JLabel perfil;
	private JLabel lbEstado;
	

	private JLabel lbEdad;
	private JLabel lbAlias;

	private JLabel lbGenero;
	private JLabel lbEstatura;
	private JLabel lbDepende;
	private JLabel lbRespuesta;
	private JLabel lbLResividos;
	private JLabel lbLOtorgados;
	private JButton btnSalir;
	private JButton btnPerfil;
	private JButton btnLike;
	private JButton btnDislike;
	private ArrayList<ImageIcon> hombres;
	private ArrayList<ImageIcon> mujeres;
	public ViewConocer() {
		
		setLayout(null);
		hombres = new ArrayList<ImageIcon>();
		mujeres = new ArrayList<ImageIcon>();
		for(int i=1 ; i<26 ;i++){
		ImageIcon image = new ImageIcon("graphics/hombres/man"+i+".png");
		hombres.add(image);
		}
		for(int j=1 ; j<24 ;j++){
			ImageIcon image2 = new ImageIcon("graphics/Mujeres/women"+j+".png");
			mujeres.add(image2);
			}
		
		ImageIcon titulo = new ImageIcon("graphics/titulo2.png");
		ImageIcon lbperfil = new ImageIcon("graphics/hombres/man2.png");
		ImageIcon lbLikeR = new ImageIcon("graphics/corazonR.png");
		ImageIcon lbLike = new ImageIcon("graphics/like.png");
		ImageIcon lbDislike = new ImageIcon("graphics/dislike.png");
		ImageIcon lbSalir = new ImageIcon("graphics/salir.png");
		ImageIcon lbPerfil = new ImageIcon("graphics/perfil.png");
		
		bosstinder = new JLabel();
		bosstinder.setBounds(175,67,232,44);
		bosstinder.setIcon(new ImageIcon(titulo.getImage().getScaledInstance(bosstinder.getWidth(), bosstinder.getHeight(),Image.SCALE_SMOOTH)));
		add(bosstinder);
		
		
		perfil = new JLabel();
		perfil.setBounds(220,130,148,148);
		perfil.setIcon(new ImageIcon(lbperfil.getImage().getScaledInstance(perfil.getWidth(), perfil.getHeight(),Image.SCALE_SMOOTH)));
		add(perfil);
		
		btnDislike = new JButton();
		btnDislike.setBounds(53,482,40,40);
		btnDislike.setBackground(null);
		btnDislike.setBorder(null);
		btnDislike.setActionCommand("disLike");
		btnDislike.setIcon(new ImageIcon(lbDislike.getImage().getScaledInstance(btnDislike.getWidth(), btnDislike.getHeight(),Image.SCALE_SMOOTH)));
		add(btnDislike);
		
		btnLike = new JButton();
		btnLike.setBounds(489,482,40,40);
		btnLike.setBackground(null);
		btnLike.setBorder(null);
		btnLike.setActionCommand("like");
		btnLike.setIcon(new ImageIcon(lbLike.getImage().getScaledInstance(btnLike.getWidth(), btnLike.getHeight(),Image.SCALE_SMOOTH)));
		add(btnLike);
		
		btnSalir = new JButton();
		btnSalir.setBounds(560,40,24,24);
		btnSalir.setBackground(null);
		btnSalir.setBorder(null);
		btnSalir.setActionCommand("logout");
		btnSalir.setIcon(new ImageIcon(lbSalir.getImage().getScaledInstance(btnSalir.getWidth(), btnSalir.getHeight(),Image.SCALE_SMOOTH)));
		add(btnSalir);
		
		btnPerfil = new JButton();
		btnPerfil.setBounds(530,40,24,24);
		btnPerfil.setBackground(null);
		btnPerfil.setBorder(null);
		btnPerfil.setActionCommand("miPerfil");
		btnPerfil.setIcon(new ImageIcon(lbPerfil.getImage().getScaledInstance(btnPerfil.getWidth(), btnPerfil.getHeight(),Image.SCALE_SMOOTH)));
		add(btnPerfil);
		
		JLabel lbUsuario = new JLabel("alias");
		lbUsuario.setBounds(72,317,105,21);
		lbUsuario.setHorizontalAlignment(JLabel.RIGHT);
		add(lbUsuario);
		lbAlias = new JLabel("--");
		lbAlias.setBounds(184,317,105,21);
		add(lbAlias);
		
		JLabel lbedad = new JLabel("Edad");
		lbedad.setBounds(277,318,116,21);
		lbedad.setHorizontalAlignment(JLabel.RIGHT);
		add(lbedad);
		lbEdad = new JLabel("--");
		lbEdad.setBounds(400,318,105,21);	
		add(lbEdad);
		
		JLabel lbestado = new JLabel("Estado");
		lbestado.setBounds(72,339,105,21);
		lbestado.setHorizontalAlignment(JLabel.RIGHT);
		add(lbestado);
		lbEstado = new JLabel("--");
		lbEstado.setBounds(184,339,105,21);
		add(lbEstado);
		
		JLabel lbgenero = new JLabel("Genero");
		lbgenero.setBounds(277,339,116,21);
		lbgenero.setHorizontalAlignment(JLabel.RIGHT);
		add(lbgenero);
		lbGenero = new JLabel("--");
		lbGenero.setBounds(400,339,105,21);
		add(lbGenero);
		
		JLabel lbestatura = new JLabel("Estatura");
		lbestatura.setBounds(72,362,105,21);
		lbestatura.setHorizontalAlignment(JLabel.RIGHT);
		add(lbestatura);
		lbEstatura = new JLabel("--");
		lbEstatura.setBounds(184,362,105,21);
		add(lbEstatura);
		
		lbDepende = new JLabel("--");
		lbDepende.setBounds(277,361,116,21);
		lbDepende.setHorizontalAlignment(JLabel.RIGHT);
		add(lbDepende);
		lbRespuesta = new JLabel("--");
		lbRespuesta.setBounds(400,361,105,21);
		add(lbRespuesta);
		
		JLabel lblResividos = new JLabel("Like Recibidos");
		lblResividos.setBounds(114,423,105,21);
		add(lblResividos);
		lbLResividos = new JLabel("-");
		lbLResividos.setBounds(83,420,24,24);
		lbLResividos.setHorizontalAlignment(JLabel.CENTER);
		add(lbLResividos);
		JLabel LResividos = new JLabel();
		LResividos.setBounds(83,420,24,24);
		LResividos.setIcon(new ImageIcon(lbLikeR.getImage().getScaledInstance(lbLResividos.getWidth(), lbLResividos.getHeight(),Image.SCALE_SMOOTH)));
		add(LResividos);
		
		JLabel lblOtorgados = new JLabel("Like Otorgados");
		lblOtorgados.setBounds(399,423,105,21);
		add(lblOtorgados);
		lbLOtorgados = new JLabel("-");
		lbLOtorgados.setBounds(368,420,24,24);
		lbLOtorgados.setHorizontalAlignment(JLabel.CENTER);
		add(lbLOtorgados);
		JLabel LOtorgados = new JLabel();
		LOtorgados.setBounds(368,420,24,24);
		LOtorgados.setIcon(new ImageIcon(lbLikeR.getImage().getScaledInstance(LOtorgados.getWidth(), LOtorgados.getHeight(),Image.SCALE_SMOOTH)));
		add(LOtorgados);
				
		JLabel fondo2 = new JLabel();
		fondo2.setOpaque(true);
		fondo2.setBackground(Color.white);
		fondo2.setBorder(new LineBorder(Color.black,5));
		fondo2.setBounds(53,409,482,46);
		add(fondo2);
		
		JLabel fondo1 = new JLabel();
		fondo1.setOpaque(true);
		fondo1.setBackground(Color.white);
		fondo1.setBorder(new LineBorder(Color.black,5));
		fondo1.setBounds(53,294,482,120);
		add(fondo1);
		
		
		
		
		
		
	}
	
	public void fotoPerfil(String g){
		if(g.equals("Masculino")) {
			 int i = (int) Math.floor(Math.random()*hombres.size()-1);
		perfil.setIcon(new ImageIcon(hombres.get(i).getImage().getScaledInstance(perfil.getWidth(), perfil.getHeight(),Image.SCALE_SMOOTH)));
		}else {
		int i = (int) Math.floor(Math.random()*hombres.size()-1);
		perfil.setIcon(new ImageIcon(mujeres.get(i).getImage().getScaledInstance(perfil.getWidth(), perfil.getHeight(),Image.SCALE_SMOOTH)));
		}
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
		return btnPerfil;
	}

	public void setBtnPerfil(JButton btnPerfil) {
		this.btnPerfil = btnPerfil;
	}

	public JButton getBtnLike() {
		return btnLike;
	}

	public void setBtnLike(JButton btnLike) {
		this.btnLike = btnLike;
	}

	public JButton getBtnDislike() {
		return btnDislike;
	}

	public void setBtnDislike(JButton btnDislike) {
		this.btnDislike = btnDislike;
	}

	
	

}
