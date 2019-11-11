/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.m_k_produksi;
import view.v_k_produksi_m;

/**
 *
 * @author admin pc
 */
public class c_k_produksi_m {
    v_k_produksi_m views;
    m_k_produksi models;
    
     public c_k_produksi_m() throws SQLException {
        views = new v_k_produksi_m();
        models = new m_k_produksi();
        views.gettabel_k_produksi().setModel(models.getTabel());
        views.getid_k_produksi_tf().setEnabled(false);
        views.setVisible(true);
        
        String[] id_ramal_combo = models.getid_ramal_combo();
        views.comboid_ramal(id_ramal_combo);

        views.getsimpan_btn().addActionListener(new kliksimpan());
        views.getback_btn().addActionListener(new klikback());
    }

    private class kliksimpan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.gettabel_k_produksi().setModel(models.getTabel());
            String id_k_produksi_tf = views.getid_k_produksi_tf().getText();
            String id_ramal_combo = (String) views.getid_ramal_combo().getSelectedItem();
            String k_produksi_tf = views.getk_produksi_tf().getText();
            if (id_k_produksi_tf.equals("")) {
                models.insert(id_ramal_combo, k_produksi_tf);
                JOptionPane.showMessageDialog(views, "Data Berhasil Disimpan");
            }

            views.gettabel_k_produksi().setModel(models.getTabel());
        }

        
    }

    private class klikback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_menu_manajer();
            } catch (SQLException ex) {
                Logger.getLogger(c_k_produksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
