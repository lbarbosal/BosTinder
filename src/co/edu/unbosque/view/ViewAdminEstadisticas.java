package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import co.edu.unbosque.model.Persona;
/**
 * Clase estadisticas del administrador
 * Depende de un JPanel
 * 
 * @author Grupo 3
 * @version 12/06/2021
 */
public class ViewAdminEstadisticas extends JPanel{
	
	private JButton btnGenePDF;
	private ChartPanel panel;
	private JFreeChart graficoBarra;
	private JComboBox<?> cbxDatos;
	private JComboBox<?> cbxGenero;
	private JLabel bostinder;
	
	/**
	 * Método constructor
	 */
	public ViewAdminEstadisticas() {
		setLayout(null);
		ImageIcon titulo = new ImageIcon("graphics/tituloAdmin.png");
		
		
		btnGenePDF = new JButton("Crear PDF actual");
		btnGenePDF.setBounds(454,500,90,30);
		btnGenePDF.setBackground(new Color(204,0,0));
		btnGenePDF.setForeground(Color.white);
		btnGenePDF.setFont(new Font("arial",0,11));
		btnGenePDF.setBorder( new MatteBorder(0,0,3,3,Color.black));
		add(btnGenePDF);
		
		bostinder = new JLabel();
		bostinder.setBounds(103,50,394,44);
		bostinder.setIcon(new ImageIcon(titulo.getImage().getScaledInstance(bostinder.getWidth(), bostinder.getHeight(),Image.SCALE_SMOOTH)));
		add(bostinder);
		
		cbxDatos = new JComboBox();
		cbxDatos.setModel(new DefaultComboBoxModel(new String[] {"Seleccione","Número de likes", "Ingresos"}));
		cbxDatos.setActionCommand("pLikes");
		cbxDatos.setBounds(114, 130, 175, 27);
		add(cbxDatos);
		
		cbxGenero = new JComboBox();
		cbxGenero.setModel(new DefaultComboBoxModel(new String[] {"Seleccione","Masculino", "Femenino"}));
		cbxGenero.setActionCommand("pGen");
		cbxGenero.setBounds(317, 130, 152, 27);
		add(cbxGenero);
		
		panel = new ChartPanel(graficoBarra);
		panel.setMouseWheelEnabled(true);
		panel.setBounds(50, 180, 500, 300);
		panel.setPreferredSize(new Dimension(100, 200));
		add(panel);	
	}
	
	/**
	 * Método que crea la grafica
	 * @param info ArrayList<Persona> Información de usuario
	 * @param tipoB String Es el tipo de busqueda
	 */
	public void updateGraficaG(ArrayList<Persona> info, String tipoB) {
		DefaultCategoryDataset datosG = new DefaultCategoryDataset();
		if(tipoB.equals("Ingresos")) {
			for (int i = 0; i < info.size(); i++) {
				datosG.setValue(info.get(i).getIngresos(), info.get(i).getAlias() ,"");
			}
		} else {
			for (int i = 0; i < info.size(); i++) {
				datosG.setValue(info.get(i).getNumLR(), info.get(i).getAlias() ,"");
			}
		}

		JFreeChart graficoBarra = ChartFactory.createBarChart3D("TOP 10", "Tabla de convenciones", tipoB , datosG);
		setGraficoBarra(graficoBarra);
		getPanel().setChart(graficoBarra);
		getPanel().repaint();
		updateUI();
		
	}
	
	/**
	 * Método que guarda la estadística como imagen
	 * <b>pre</b> Se requiere tener un gráfico de barras de likes recibidos e ingresos
	 * <b>pos</b> Se guarda la imagen
	 * @param file File Es el archivo que guarda
	 * @param nombre String nombre de la grafica
	 * @param graficoBarra JFreechart Es el grafico de barras
	 * @param width	int Es el ancho de la imagen
	 * @param height int Es el alto de la imagen
	 * @throws IOException Excepciones para el programa
	 */
	public void saveChartAsPNG(File file, String nombre, JFreeChart graficoBarra, int width, int height)
			throws IOException {
		ChartUtilities.saveChartAsJPEG(new File(file + nombre), 1, graficoBarra, 500, 300);
	}
	
	/**
	 * Devuelve el botón del para crear el PDF
	 * @return btnGenePDF
	 */
	public JButton getBtnGenePDF() {
		return btnGenePDF;
	}
	
	/**
	 * Modifica el botón del para crear el PDF
	 * @param btnGenePDF
	 */
	public void setBtnGenePDF(JButton btnGenePDF) {
		this.btnGenePDF = btnGenePDF;
	}
	
	/**
	 * Devuelve el panel de la grafica
	 * @return panel
	 */
	public ChartPanel getPanel() {
		return panel;
	}
	
	/**
	 * Modifica el panel de la grafica
	 * @param panel
	 */
	public void setPanel(ChartPanel panel) {
		this.panel = panel;
	}
	
	/**
	 * Devuelve el grafico de barras
	 * @return graficoBarra
	 */
	public JFreeChart getGraficoBarra() {
		return graficoBarra;
	}
	
	/**
	 * modifica el grafico de barras
	 * @param graficoBarra
	 */
	public void setGraficoBarra(JFreeChart graficoBarra) {
		this.graficoBarra = graficoBarra;
	}
	
	/**
	 * Devuelve el combo box de los datos 
	 * @return cbxDatos
	 */
	public JComboBox<?> getCbxDatos() {
		return cbxDatos;
	}
	
	/**
	 * Modifica el combo box de los datos
	 * @param cbxDatos
	 */
	public void setCbxDatos(JComboBox<?> cbxDatos) {
		this.cbxDatos = cbxDatos;
	}
	
	/**
	 * Devuelve el combo box del genero
	 * @return cbxGenero
	 */
	public JComboBox<?> getCbxGenero() {
		return cbxGenero;
	}
	
	/**
	 * Modifica el combo box del genero
	 * @param cbxGenero
	 */
	public void setCbxGenero(JComboBox<?> cbxGenero) {
		this.cbxGenero = cbxGenero;
	}
	
	/**
	 * Devuelve el título de Bostinder
	 * @return bostinder
	 */
	public JLabel getBostinder() {
		return bostinder;
	}
	
	/**
	 * Modifica el título de Bostinder
	 * @param bostinder
	 */
	public void setBostinder(JLabel bostinder) {
		this.bostinder = bostinder;
	}
}
