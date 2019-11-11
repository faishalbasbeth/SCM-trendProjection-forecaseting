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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.m_prd_waktu;
import view.v_prd_waktu;

/**
 *
 * @author admin pc
 */
public class c_prd_waktu {
    v_prd_waktu views;
    m_prd_waktu models;
    
    public c_prd_waktu() throws SQLException {
        views = new v_prd_waktu();
        models = new m_prd_waktu();
        views.setVisible(true);
        views.gettabel_prd_waktu().setModel(models.getTabel());
        views.getid_prd_waktu_tf().setEnabled(false);
        views.gett_prd_waktu_tf().setEditable(false);
        views.gett_t_prd_waktu_tf().setEditable(false);
        
        String[] id_t_prd_waktu_combo = models.getid_t_prd_waktu_combo();
        views.comboid_t_prd_waktu(id_t_prd_waktu_combo);

        views.getback_btn().addActionListener(new klikback());
        views.setOnClikid_t_prd_waktu(new klikid_t_prd_waktu());
        views.hasilt_t_prd_waktu(new klikprd_waktu());
        views.getsimpan_btn().addActionListener(new kliksimpan());
        views.getnext_btn().addActionListener(new kliknext());
}

    private class kliknext implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_total_prd_waktu();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu_ramal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class kliksimpan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.gettabel_prd_waktu().setModel(models.getTabel());
            String id_prd_waktu_tf = views.getid_prd_waktu_tf().getText();
            String id_t_prd_waktu_combo = (String) views.getid_t_prd_waktu_combo().getSelectedItem();
            String t_prd_waktu_tf = views.gett_prd_waktu_tf().getText();
            String prd_waktu_tf = views.getprd_waktu_tf().getText();
            String t_t_prd_waktu_tf = views.gett_t_prd_waktu_tf().getText();
            if (id_prd_waktu_tf.equals("")) {
                models.insert(id_t_prd_waktu_combo, t_prd_waktu_tf, prd_waktu_tf, t_t_prd_waktu_tf);
                JOptionPane.showMessageDialog(views, "Data Berhasil Disimpan");
            }

            views.gettabel_prd_waktu().setModel(models.getTabel());
        }

        
    }

    private class klikprd_waktu implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            double tpw,pw,total;
            String total1;
            
            tpw = Double.parseDouble(views.gett_prd_waktu_tf().getText());
            pw = Double.parseDouble(views.getprd_waktu_tf().getText());
            total = tpw + pw;
            total1 = String.valueOf(total);
            
            views.gett_t_prd_waktu_tf().setText(total1);
        }

        
    }

    private class klikid_t_prd_waktu implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            System.out.println(views.getSelectedid_t_prd_waktu());
            if (views.getid_t_prd_waktu_combo().getSelectedIndex() == 0) {
                views.sett_prd_waktu_tf("0");
            }else {
                try {
                    views.sett_prd_waktu_tf(String.valueOf(models.gett_prd_waktu_tf(views.getSelectedid_t_prd_waktu())));
                } catch (SQLException ex) {
                    Logger.getLogger(c_prd_waktu.class.getName()).log(Level.SEVERE, null, ex);
                }
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
                Logger.getLogger(c_prd_waktu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
