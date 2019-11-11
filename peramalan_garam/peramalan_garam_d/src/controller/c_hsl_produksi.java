/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.m_hsl_produksi;
import view.v_hsl_produksi;

/**
 *
 * @author admin pc
 */
public class c_hsl_produksi {
    v_hsl_produksi views;
    m_hsl_produksi models;
    
     public c_hsl_produksi() throws SQLException {
        views = new v_hsl_produksi();
        models = new m_hsl_produksi();
        views.gettabel_hsl_produksi().setModel(models.getTabel());
        views.getid_hsl_produksi_tf().setEnabled(false);
        views.getpembungkusan_garam_tf().setEditable(false);
        views.setVisible(true);
        
        String[] id_pml_lahan_combo = models.getid_pml_lahan_combo();
        views.comboid_pml_lahan(id_pml_lahan_combo);
        
        views.total_pembungkusan_garam(new kliktotal());

        views.getsimpan_btn().addActionListener(new kliksimpan());
        views.getback_btn().addActionListener(new klikback());
    }

    private class kliktotal implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            double garam,total;
            String total1;
            
            garam = Double.parseDouble(views.getgaram_tf().getText());
            total = garam / 1;
            total1 = String.valueOf(total);
            
            views.getpembungkusan_garam_tf().setText(total1);
        }

        
    }

    private class klikback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_menu_produksi();
            } catch (SQLException ex) {
                Logger.getLogger(c_hsl_produksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class kliksimpan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.gettabel_hsl_produksi().setModel(models.getTabel());
            String id_hsl_produksi_tf = views.getid_hsl_produksi_tf().getText();
            String id_pml_lahan_combo = (String) views.getid_pml_lahan_combo().getSelectedItem();
            String garam_tf = (String) views.getgaram_tf().getText();
            String pembungkusan_garam_tf = (String) views.getpembungkusan_garam_tf().getText();
            if (id_hsl_produksi_tf.equals("")) {
                models.insert(id_pml_lahan_combo, garam_tf, pembungkusan_garam_tf);
                JOptionPane.showMessageDialog(views, "Data Berhasil Disimpan");
            }

            views.gettabel_hsl_produksi().setModel(models.getTabel());
        }

        
    }
}
