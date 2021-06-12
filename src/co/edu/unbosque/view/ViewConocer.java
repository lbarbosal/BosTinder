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
/**
 * Clase en la que apareceran otros usuarios
 * Depende de un JPanel
 * 
 * @author Grupo 3
 * @version 12/06/2021
 */
public class ViewConocer extends JPanel {

	private JLabel bosstinder;
	private JLabel perfil;
	private JLabel lbEstado;
	private JLabel lbEdad;
	private JLabel lbAlias;
	private JLabel lbGenero;
	private JLabel lbEstatura;
	private JLabel lbDepende;
	private JLabel lbRespuesta;
	private JLabel lbLRecibidos;
	private JLabel lbLOtorgados;
	private JButton btnSalir;
	private JButton btnPerfil;
	private JButton btnLike;
	private JButton btnDislike;
	private ArrayList<ImageIcon> hombres;
	private ArrayList<ImageIcon> mujeres;
	
	/**
	 * Método constructor
	 */
	public ViewConocer() {

		setLayout(null);
		hombres = new ArrayList<ImageIcon>();
		mujeres = new ArrayList<ImageIcon>();
		for (int i = 1; i < 26; i++) {
			ImageIcon image = new ImageIcon("graphics/hombres/man" + i + ".png");
			hombres.add(image);
		}
		for (int j = 1; j < 24; j++) {
			ImageIcon image2 = new ImageIcon("graphics/mujeres/woman" + j + ".png");
			mujeres.add(image2);
		}

		ImageIcon titulo = new ImageIcon("graphics/titulo2.png");
		ImageIcon lbperfil = new ImageIcon("graphics/mujeres/woman2.png");
		ImageIcon lbLikeR = new ImageIcon("graphics/corazonR.png");
		ImageIcon lbLike = new ImageIcon("graphics/like.png");
		ImageIcon lbDislike = new ImageIcon("graphics/dislike.png");
		ImageIcon lbSalir = new ImageIcon("graphics/salir.png");
		ImageIcon lbPerfil = new ImageIcon("graphics/perfil.png");

		bosstinder = new JLabel();
		bosstinder.setBounds(175, 67, 232, 44);
		bosstinder.setIcon(new ImageIcon(titulo.getImage().getScaledInstance(bosstinder.getWidth(),
				bosstinder.getHeight(), Image.SCALE_SMOOTH)));
		add(bosstinder);

		perfil = new JLabel();
		perfil.setBounds(220, 130, 148, 148);
		perfil.setIcon(new ImageIcon(
				lbperfil.getImage().getScaledInstance(perfil.getWidth(), perfil.getHeight(), Image.SCALE_SMOOTH)));
		add(perfil);

		btnDislike = new JButton();
		btnDislike.setBounds(53, 482, 40, 40);
		btnDislike.setBackground(null);
		btnDislike.setBorder(null);
		btnDislike.setActionCommand("disLike");
		btnDislike.setIcon(new ImageIcon(lbDislike.getImage().getScaledInstance(btnDislike.getWidth(),
				btnDislike.getHeight(), Image.SCALE_SMOOTH)));
		add(btnDislike);

		btnLike = new JButton();
		btnLike.setBounds(489, 482, 40, 40);
		btnLike.setBackground(null);
		btnLike.setBorder(null);
		btnLike.setActionCommand("like");
		btnLike.setIcon(new ImageIcon(
				lbLike.getImage().getScaledInstance(btnLike.getWidth(), btnLike.getHeight(), Image.SCALE_SMOOTH)));
		add(btnLike);

		btnSalir = new JButton();
		btnSalir.setBounds(560, 40, 24, 24);
		btnSalir.setBackground(null);
		btnSalir.setBorder(null);
		btnSalir.setActionCommand("logout");
		btnSalir.setIcon(new ImageIcon(
				lbSalir.getImage().getScaledInstance(btnSalir.getWidth(), btnSalir.getHeight(), Image.SCALE_SMOOTH)));
		add(btnSalir);

		btnPerfil = new JButton();
		btnPerfil.setBounds(530, 40, 24, 24);
		btnPerfil.setBackground(null);
		btnPerfil.setBorder(null);
		btnPerfil.setActionCommand("miPerfil");
		btnPerfil.setIcon(new ImageIcon(lbPerfil.getImage().getScaledInstance(btnPerfil.getWidth(),
				btnPerfil.getHeight(), Image.SCALE_SMOOTH)));
		add(btnPerfil);

		JLabel lbUsuario = new JLabel("alias");
		lbUsuario.setBounds(72, 317, 105, 21);
		lbUsuario.setHorizontalAlignment(JLabel.RIGHT);
		add(lbUsuario);
		lbAlias = new JLabel("--");
		lbAlias.setBounds(184, 317, 105, 21);
		add(lbAlias);

		JLabel lbedad = new JLabel("Edad");
		lbedad.setBounds(277, 318, 116, 21);
		lbedad.setHorizontalAlignment(JLabel.RIGHT);
		add(lbedad);
		lbEdad = new JLabel("--");
		lbEdad.setBounds(400, 318, 105, 21);
		add(lbEdad);

		JLabel lbestado = new JLabel("Estado");
		lbestado.setBounds(72, 339, 105, 21);
		lbestado.setHorizontalAlignment(JLabel.RIGHT);
		add(lbestado);
		lbEstado = new JLabel("--");
		lbEstado.setBounds(184, 339, 105, 21);
		add(lbEstado);

		JLabel lbgenero = new JLabel("Género");
		lbgenero.setBounds(277, 339, 116, 21);
		lbgenero.setHorizontalAlignment(JLabel.RIGHT);
		add(lbgenero);
		lbGenero = new JLabel("--");
		lbGenero.setBounds(400, 339, 105, 21);
		add(lbGenero);

		JLabel lbestatura = new JLabel("Estatura");
		lbestatura.setBounds(72, 362, 105, 21);
		lbestatura.setHorizontalAlignment(JLabel.RIGHT);
		add(lbestatura);
		lbEstatura = new JLabel("--");
		lbEstatura.setBounds(184, 362, 105, 21);
		add(lbEstatura);

		lbDepende = new JLabel("--");
		lbDepende.setBounds(277, 361, 116, 21);
		lbDepende.setHorizontalAlignment(JLabel.RIGHT);
		add(lbDepende);
		lbRespuesta = new JLabel("--");
		lbRespuesta.setBounds(400, 361, 105, 21);
		add(lbRespuesta);

		JLabel lblResibidos = new JLabel("Like Recibidos");
		lblResibidos.setBounds(114, 423, 105, 21);
		add(lblResibidos);
		lbLRecibidos = new JLabel("-");
		lbLRecibidos.setBounds(83, 420, 24, 24);
		lbLRecibidos.setHorizontalAlignment(JLabel.CENTER);
		add(lbLRecibidos);
		JLabel LResibidos = new JLabel();
		LResibidos.setBounds(83, 420, 24, 24);
		LResibidos.setIcon(new ImageIcon(lbLikeR.getImage().getScaledInstance(lbLRecibidos.getWidth(),
				lbLRecibidos.getHeight(), Image.SCALE_SMOOTH)));
		add(LResibidos);

		JLabel lblOtorgados = new JLabel("Like Otorgados");
		lblOtorgados.setBounds(399, 423, 105, 21);
		add(lblOtorgados);
		lbLOtorgados = new JLabel("-");
		lbLOtorgados.setBounds(368, 420, 24, 24);
		lbLOtorgados.setHorizontalAlignment(JLabel.CENTER);
		add(lbLOtorgados);
		JLabel LOtorgados = new JLabel();
		LOtorgados.setBounds(368, 420, 24, 24);
		LOtorgados.setIcon(new ImageIcon(lbLikeR.getImage().getScaledInstance(LOtorgados.getWidth(),
				LOtorgados.getHeight(), Image.SCALE_SMOOTH)));
		add(LOtorgados);

		JLabel fondo2 = new JLabel();
		fondo2.setOpaque(true);
		fondo2.setBackground(Color.white);
		fondo2.setBorder(new LineBorder(Color.black, 5));
		fondo2.setBounds(53, 409, 482, 46);
		add(fondo2);

		JLabel fondo1 = new JLabel();
		fondo1.setOpaque(true);
		fondo1.setBackground(Color.white);
		fondo1.setBorder(new LineBorder(Color.black, 5));
		fondo1.setBounds(53, 294, 482, 120);
		add(fondo1);

	}
	
	/**
	 * Método que agrega unna foto aleatoria a cada perfil
	 * 
	 * @param g
	 */
	public void fotoPerfil(String g) {
		if (g.equals("Masculino")) {
			int i = (int) Math.floor(Math.random() * hombres.size());
			perfil.setIcon(new ImageIcon(hombres.get(i).getImage().getScaledInstance(perfil.getWidth(),
					perfil.getHeight(), Image.SCALE_SMOOTH)));
		} else {
			int i = (int) Math.floor(Math.random() * mujeres.size());
			perfil.setIcon(new ImageIcon(mujeres.get(i).getImage().getScaledInstance(perfil.getWidth(),
					perfil.getHeight(), Image.SCALE_SMOOTH)));
		}
	}

	/**
	 * Devuelve el título de Bosstinder
	 * @return bosstinder
	 */
	public JLabel getBosstinder() {
		return bosstinder;
	}

	/**
	 * Modificar el título de Bosstinder
	 * @param bosstinder
	 */
	public void setBosstinder(JLabel bosstinder) {
		this.bosstinder = bosstinder;
	}

	/**
	 * Devuelve el título de perfil
	 * @return perfil
	 */
	public JLabel getPerfil() {
		return perfil;
	}

	/**
	 * Modifca el título de perfil
	 * @param perfil
	 */
	public void setPerfil(JLabel perfil) {
		this.perfil = perfil;
	}

	/**
	 * Devuelve el título de estado
	 * @return lbEstado
	 */
	public JLabel getLbEstado() {
		return lbEstado;
	}

	/**
	 * Modifica el título de estado
	 * @param lbEstado
	 */
	public void setLbEstado(JLabel lbEstado) {
		this.lbEstado = lbEstado;
	}

	/**
	 * Devuelve el título de edad
	 * @return lbEdad
	 */
	public JLabel getLbEdad() {
		return lbEdad;
	}

	/**
	 * Modificar el título de edad
	 * @param lbEdad
	 */
	public void setLbEdad(JLabel lbEdad) {
		this.lbEdad = lbEdad;
	}

	/**
	 * Devuelve el título de alias
	 * @return lbAlias
	 */
	public JLabel getLbAlias() {
		return lbAlias;
	}

	/**
	 * Modifica el título de alias
	 * @param lbAlias
	 */
	public void setLbAlias(JLabel lbAlias) {
		this.lbAlias = lbAlias;
	}

	/**
	 * Devuelve el título de genero
	 * @return lbGenero
	 */
	public JLabel getLbGenero() {
		return lbGenero;
	}

	/**
	 * Modifica el título de genero
	 * @param lbGenero
	 */
	public void setLbGenero(JLabel lbGenero) {
		this.lbGenero = lbGenero;
	}

	/**
	 * Devuelve el título de estatura
	 * @return lbEstatura
	 */
	public JLabel getLbEstatura() {
		return lbEstatura;
	}

	/**
	 * Modifica el título de estatura
	 * @param lbEstatura
	 */
	public void setLbEstatura(JLabel lbEstatura) {
		this.lbEstatura = lbEstatura;
	}

	/**
	 * Devuelve el título de depende
	 * @return lbDepende
	 */
	public JLabel getLbDepende() {
		return lbDepende;
	}

	/**
	 * Modifica el título de depende
	 * @param lbDepende
	 */
	public void setLbDepende(JLabel lbDepende) {
		this.lbDepende = lbDepende;
	}

	/**
	 * Devuelve el título de respuesta
	 * @return lbRespuesta
	 */
	public JLabel getLbRespuesta() {
		return lbRespuesta;
	}

	/**
	 * Modifica el título de respuesta
	 * @param lbRespuesta
	 */
	public void setLbRespuesta(JLabel lbRespuesta) {
		this.lbRespuesta = lbRespuesta;
	}

	/**
	 * Devuelve el título de recibidos
	 * @return lbLRecibidos
	 */
	public JLabel getLbLRecibidos() {
		return lbLRecibidos;
	}

	/**
	 * Modifica el título de recibidos
	 * @param lbLResividos
	 */
	public void setLbLRecibidos(JLabel lbLResividos) {
		this.lbLRecibidos = lbLResividos;
	}

	/**
	 * Devuelve el título de likes otorgados
	 * @return lbLOtorgados
	 */
	public JLabel getLbLOtorgados() {
		return lbLOtorgados;
	}

	/**
	 * Modifica el título de likes otorgados
	 * @param lbLOtorgados
	 */
	public void setLbLOtorgados(JLabel lbLOtorgados) {
		this.lbLOtorgados = lbLOtorgados;
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

	/**
	 * Devuelve el botón  de perfil
	 * @return btnPerfil
	 */
	public JButton getBtnPerfil() {
		return btnPerfil;
	}

	/**
	 * Modifica el botón  de perfil
	 * @param btnPerfil
	 */
	public void setBtnPerfil(JButton btnPerfil) {
		this.btnPerfil = btnPerfil;
	}

	/**
	 * Devuelve el botón de like
	 * @return btnLike
	 */
	public JButton getBtnLike() {
		return btnLike;
	}

	/**
	 * Modifica el botón de like
	 * @param btnLike
	 */
	public void setBtnLike(JButton btnLike) {
		this.btnLike = btnLike;
	}

	/**
	 * Devuelve el botón de dislike
	 * @return btnDislike
	 */
	public JButton getBtnDislike() {
		return btnDislike;
	}

	/**
	 * Modifica el botón de dislike
	 * @param btnDislike
	 */
	public void setBtnDislike(JButton btnDislike) {
		this.btnDislike = btnDislike;
	}

}
