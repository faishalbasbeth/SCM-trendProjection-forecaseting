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
import model.m_prd_waktu2;
import view.v_prd_waktu2;

/**
 *
 * @author admin pc
 */
public class c_prd_waktu2 {
    v_prd_waktu2 views;
    m_prd_waktu2 models;
    
    public c_prd_waktu2() throws SQLException {
        views = new v_prd_waktu2();
        models = new m_prd_waktu2();
        views.setVisible(true);
        views.gettabel_prd_waktu2().setModel(models.getTabel());
        views.getid_prd_waktu2_tf().setEnabled(false);
        views.getprd_waktu_tf().setEditable(false);
        views.getprd_waktu2_tf().setEditable(false);
        views.gett_prd_waktu2_tf().setEditable(false);
        views.gett_t_prd_waktu2_tf().setEditable(false);
        
        String[] id_prd_waktu_combo = models.getid_prd_waktu_combo();
        views.comboid_prd_waktu(id_prd_waktu_combo);
        
        String[] id_t_prd_waktu2_combo = models.getid_t_prd_waktu2_combo();
        views.comboid_t_prd_waktu2(id_t_prd_waktu2_combo);

        views.getback_btn().addActionListener(new klikback());
        views.setOnClikid_prd_waktu(new klikid_prd_waktu());
        
        views.setOnClikid_t_prd_waktu2(new klikid_t_prd_waktu2());
        views.getsimpan_btn().addActionListener(new kliksimpan());
        views.getnext_btn().addActionListener(new kliknext());
}

    private class kliksimpan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.gettabel_prd_waktu2().setModel(models.getTabel());
            String id_prd_waktu2_tf = views.getid_prd_waktu2_tf().getText();
            String id_prd_waktu_combo = (String) views.getid_prd_waktu_combo().getSelectedItem();
            String prd_waktu_tf = views.getprd_waktu_tf().getText();
            String prd_waktu2_tf = views.getprd_waktu2_tf().getText();
            String id_t_prd_waktu2_combo = (String) views.getid_t_prd_waktu2_combo().getSelectedItem();
            String t_prd_waktu2_tf = views.gett_prd_waktu2_tf().getText();
            String t_t_prd_waktu2_tf = views.gett_t_prd_waktu2_tf().getText();
            if (id_prd_waktu2_tf.equals("")) {
                models.insert(id_prd_waktu_combo, prd_waktu_tf, prd_waktu2_tf, id_t_prd_waktu2_combo, t_prd_waktu2_tf, t_t_prd_waktu2_tf);
                JOptionPane.showMessageDialog(views, "Data Berhasil Disimpan");
            }

            views.gettabel_prd_waktu2().setModel(models.getTabel());
        }

        
    }

    private class klikid_t_prd_waktu2 implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            double pw2, tpw2, ttpw;
            String ttpw2;
            
            System.out.println(views.getSelectedid_t_prd_waktu2());
            if (views.getid_t_prd_waktu2_combo().getSelectedIndex() == 0) {
                views.sett_prd_waktu2_tf("0");
            }else {
                try {
                    views.sett_prd_waktu2_tf(String.valueOf(models.gett_prd_waktu2_tf(views.getSelectedid_t_prd_waktu2())));
                    
                    pw2 = Double.parseDouble(models.getprd_waktu_tf(views.getSelectedid_prd_waktu()));
                    tpw2 = Double.parseDouble(models.gett_prd_waktu2_tf(views.getSelectedid_t_prd_waktu2()));
                    ttpw = ((pw2*pw2) + tpw2);
                    ttpw2 = String.valueOf(ttpw);
                    
                    views.gett_t_prd_waktu2_tf().setText(ttpw2);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(c_prd_waktu2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        
    }

    private class klikid_prd_waktu implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            double pw, pw2;
            String pw2_1;
            
            System.out.println(views.getSelectedid_prd_waktu());
            if (views.getid_prd_waktu_combo().getSelectedIndex() == 0) {
                views.setprd_waktu_tf("0");
            }else {
                try {
                    views.setprd_waktu_tf(String.valueOf(models.getprd_waktu_tf(views.getSelectedid_prd_waktu())));
                    
                    pw = Double.parseDouble(models.getprd_waktu_tf(views.getSelectedid_prd_waktu()));
                    pw2 = pw * pw;
                    pw2_1 = String.valueOf(pw2);
                    
                    views.getprd_waktu2_tf().setText(pw2_1);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(c_prd_waktu2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        
    }

    private class kliknext implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_total_prd_waktu2();
            } catch (SQLException ex) {
                Logger.getLogger(c_prd_waktu2.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(c_prd_waktu2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
