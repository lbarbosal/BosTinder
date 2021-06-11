package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Hashtable;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import co.edu.unbosque.model.Persona;

public class ViewAdminEstadisticas extends JPanel{
	
	private JButton btnGenePDF;
	private ChartPanel panel;
	private JFreeChart graficoBarra;
	private JComboBox<?> cbxDatos;
	private JComboBox<?> cbxGenero;
	private JLabel bostinder;
	
	
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
	public JButton getBtnGenePDF() {
		return btnGenePDF;
	}
	public void setBtnGenePDF(JButton btnGenePDF) {
		this.btnGenePDF = btnGenePDF;
	}
	public ChartPanel getPanel() {
		return panel;
	}
	public void setPanel(ChartPanel panel) {
		this.panel = panel;
	}
	public JFreeChart getGraficoBarra() {
		return graficoBarra;
	}
	public void setGraficoBarra(JFreeChart graficoBarra) {
		this.graficoBarra = graficoBarra;
	}
	public JComboBox<?> getCbxDatos() {
		return cbxDatos;
	}
	public void setCbxDatos(JComboBox<?> cbxDatos) {
		this.cbxDatos = cbxDatos;
	}
	public JComboBox<?> getCbxGenero() {
		return cbxGenero;
	}
	public void setCbxGenero(JComboBox<?> cbxGenero) {
		this.cbxGenero = cbxGenero;
	}
	public JLabel getBostinder() {
		return bostinder;
	}
	public void setBostinder(JLabel bostinder) {
		this.bostinder = bostinder;
	}

}
