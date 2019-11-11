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
import model.m_jual_garam;
import view.v_jual_garam;

/**
 *
 * @author admin pc
 */
public class c_jual_garam {
    v_jual_garam views;
    m_jual_garam models;
    
    public c_jual_garam() throws SQLException {
        views = new v_jual_garam();
        models = new m_jual_garam();

        views.setVisible(true);
        views.gettabel_jual_garam().setModel(models.getTabel());
        views.gettabel_hasil_ramal().setModel(models.getTabel_h_ramal());
        views.getid_jual_garam_tf().setEnabled(false);
        views.gett_jual_garam_tf().setEditable(false);
        views.gett_t_jual_garam_tf().setEditable(false);
        
        String[] id_t_jual_garam_combo = models.getid_t_jual_garam_combo();
        views.comboid_t_jual_garam(id_t_jual_garam_combo);

        views.getback_btn().addActionListener(new klikback());
        views.setOnClikid_t_jual_garam(new klikid_t_jual_garam());
        views.hasilt_t_jual_garam(new klikjualgaram());
        views.getsimpan_btn().addActionListener(new kliksimpan());
        views.getnext_btn().addActionListener(new kliknext());
}

    private class kliksimpan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.gettabel_jual_garam().setModel(models.getTabel());
            String id_jual_garam_tf = views.getid_jual_garam_tf().getText();
            String id_t_jual_garam_combo = (String) views.getid_t_jual_garam_combo().getSelectedItem();
            String t_jual_garam_tf = views.gett_jual_garam_tf().getText();
            String jual_garam_tf = views.getjual_garam_tf().getText();
            String t_t_jual_garam_tf = views.gett_t_jual_garam_tf().getText();
            if (id_jual_garam_tf.equals("")) {
                models.insert(id_t_jual_garam_combo, t_jual_garam_tf, jual_garam_tf, t_t_jual_garam_tf);
                JOptionPane.showMessageDialog(views, "Data Berhasil Disimpan");
            }

            views.gettabel_jual_garam().setModel(models.getTabel());
        }

        
    }

    private class klikjualgaram implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            double tjg,jg,total;
            String total1;
            
            tjg = Double.parseDouble(views.gett_jual_garam_tf().getText());
            jg = Double.parseDouble(views.getjual_garam_tf().getText());
            total = tjg + jg;
            total1 = String.valueOf(total);
            
            views.gett_t_jual_garam_tf().setText(total1);
        }

        
    }

    private class klikid_t_jual_garam implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            System.out.println(views.getSelectedid_t_jual_garam());
            if (views.getid_t_jual_garam_combo().getSelectedIndex() == 0) {
                views.sett_jual_garam_tf("0");
            }else {
                try {
                    views.sett_jual_garam_tf(String.valueOf(models.gett_jual_garam_tf(views.getSelectedid_t_jual_garam())));
                } catch (SQLException ex) {
                    Logger.getLogger(c_jual_garam.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        
    }

    private class kliknext implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_total_jual_garam();
            } catch (SQLException ex) {
                Logger.getLogger(c_jual_garam.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(c_jual_garam.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
