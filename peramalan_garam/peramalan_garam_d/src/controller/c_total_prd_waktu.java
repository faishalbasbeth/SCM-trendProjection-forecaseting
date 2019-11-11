/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.m_total_prd_waktu;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import view.v_total_prd_waktu;

/**
 *
 * @author admin pc
 */
public class c_total_prd_waktu {
    v_total_prd_waktu views;
    m_total_prd_waktu models;
    
    public c_total_prd_waktu() throws SQLException {
        views = new v_total_prd_waktu();
        models = new m_total_prd_waktu();
        views.setVisible(true);
        views.gettabel_t_prd_waktu().setModel(models.getTabel());

        views.getback_btn().addActionListener(new klikback());
}

    private class klikback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_prd_waktu();
            } catch (SQLException ex) {
                Logger.getLogger(c_total_prd_waktu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
