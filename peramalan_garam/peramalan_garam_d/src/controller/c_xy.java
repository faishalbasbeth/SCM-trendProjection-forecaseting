/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.m_xy;
import view.v_xy;

/**
 *
 * @author admin pc
 */
public class c_xy {
    v_xy views;
    m_xy models;
    
    public c_xy() throws SQLException {
        views = new v_xy();
        models = new m_xy();
        views.setVisible(true);
        views.gettabel_xy().setModel(models.getTabel());
        views.getid_xy_tf().setEnabled(false);
        views.getprd_waktu_tf().setEditable(false);
        views.getjual_garam_tf().setEditable(false);
        views.getxy_tf().setEditable(false);
        views.gett_xy_tf().setEditable(false);
        views.gett_t_xy_tf().setEditable(false);
        
        String[] id_prd_waktu_combo = models.getid_prd_waktu_combo();
        views.comboid_prd_waktu(id_prd_waktu_combo);
        
        String[] id_jual_garam_combo = models.getid_jual_garam_combo();
        views.comboid_jual_garam(id_jual_garam_combo);
        
        String[] id_t_xy_combo = models.getid_t_xy_combo();
        views.comboid_t_xy(id_t_xy_combo);

        views.getback_btn().addActionListener(new klikback());
        
        views.setOnClikid_prd_waktu(new klikid_prd_waktu());
        
        views.setOnClikid_jual_garam(new klikid_jual_garam());
        
        views.setOnClikid_t_xy(new klikid_t_xy());
        
        views.getsimpan_btn().addActionListener(new kliksimpan());
        views.getnext_btn().addActionListener(new kliknext());
}

    private class kliksimpan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.gettabel_xy().setModel(models.getTabel());
            String id_xy_tf = views.getid_xy_tf().getText();
            String id_prd_waktu_combo = (String) views.getid_prd_waktu_combo().getSelectedItem();
            String prd_waktu_tf = views.getprd_waktu_tf().getText();
            String id_jual_garam_combo = (String) views.getid_jual_garam_combo().getSelectedItem();
            String jual_garam_tf = views.getjual_garam_tf().getText();
            String xy_tf = views.getxy_tf().getText();
            String id_t_xy_combo = (String) views.getid_t_xy_combo().getSelectedItem();
            String t_xy_tf = views.gett_xy_tf().getText();
            String t_t_xy_tf = views.gett_t_xy_tf().getText();
            if (id_xy_tf.equals("")) {
                models.insert(id_prd_waktu_combo, prd_waktu_tf, id_jual_garam_combo, jual_garam_tf, xy_tf, id_t_xy_combo, t_xy_tf, t_t_xy_tf);
                JOptionPane.showMessageDialog(views, "Data Berhasil Disimpan");
            }

            views.gettabel_xy().setModel(models.getTabel());
        }

        
    }

    private class klikid_t_xy implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            double x,y,txy,ttxy;
            String ttxy2;
            
            System.out.println(views.getSelectedid_t_xy());
            if (views.getid_t_xy_combo().getSelectedIndex() == 0) {
                views.sett_xy_tf("0");
            }else {
                try {
                    views.sett_xy_tf(String.valueOf(models.gett_xy_tf(views.getSelectedid_t_xy())));
                    
                    x = Double.parseDouble(models.getprd_waktu_tf(views.getSelectedid_prd_waktu()));
                    y = Double.parseDouble(models.getjual_garam_tf(views.getSelectedid_jual_garam()));
                    txy = Double.parseDouble(models.gett_xy_tf(views.getSelectedid_t_xy()));
                    ttxy = ((x*y) + txy);
                    ttxy2 = String.valueOf(ttxy);
                    
                    views.gett_t_xy_tf().setText(ttxy2);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(c_xy.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        
    }

    private class klikid_jual_garam implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            double x,y,xy;
            String xy_1;
            
            System.out.println(views.getSelectedid_jual_garam());
            if (views.getid_jual_garam_combo().getSelectedIndex() == 0) {
                views.setjual_garam_tf("0");
            }else {
                try {
                    views.setjual_garam_tf(String.valueOf(models.getjual_garam_tf(views.getSelectedid_jual_garam())));
                    
                    x = Double.parseDouble(models.getprd_waktu_tf(views.getSelectedid_prd_waktu()));
                    y = Double.parseDouble(models.getjual_garam_tf(views.getSelectedid_jual_garam()));
                    xy = x * y;
                    xy_1 = String.valueOf(xy);
                    
                    views.getxy_tf().setText(xy_1);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(c_xy.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        
    }

    private class klikid_prd_waktu implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            System.out.println(views.getSelectedid_prd_waktu());
            if (views.getid_prd_waktu_combo().getSelectedIndex() == 0) {
                views.setprd_waktu_tf("0");
            }else {
                try {
                    views.setprd_waktu_tf(String.valueOf(models.getprd_waktu_tf(views.getSelectedid_prd_waktu())));
                } catch (SQLException ex) {
                    Logger.getLogger(c_xy.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        
    }

    private class kliknext implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_total_xy();
            } catch (SQLException ex) {
                Logger.getLogger(c_xy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class klikback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_menu_ramal();
            } catch (SQLException ex) {
                Logger.getLogger(c_xy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
