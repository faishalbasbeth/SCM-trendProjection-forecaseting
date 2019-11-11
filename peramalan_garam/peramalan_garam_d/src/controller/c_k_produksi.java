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
import model.m_k_produksi;
import view.v_k_produksi;

/**
 *
 * @author admin pc
 */
public class c_k_produksi {
    v_k_produksi views;
    m_k_produksi models;
    
     public c_k_produksi() throws SQLException {
        views = new v_k_produksi();
        models = new m_k_produksi();
        views.gettabel_k_produksi().setModel(models.getTabel_k_produksi());
        views.setVisible(true);
        
        views.getback_btn().addActionListener(new klikback());
    }

    private class klikback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_menu_produksi();
            } catch (SQLException ex) {
                Logger.getLogger(c_k_produksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
