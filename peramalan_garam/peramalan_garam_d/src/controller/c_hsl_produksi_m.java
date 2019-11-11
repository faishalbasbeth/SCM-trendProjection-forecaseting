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
import model.m_hsl_produksi;
import view.v_hsl_produksi_m;

/**
 *
 * @author admin pc
 */
public class c_hsl_produksi_m {
    v_hsl_produksi_m views;
    m_hsl_produksi models;
    
     public c_hsl_produksi_m() throws SQLException {
        views = new v_hsl_produksi_m();
        models = new m_hsl_produksi();
        views.gettabel_hsl_produksi().setModel(models.getTabel());
        views.setVisible(true);
        
        views.getback_btn().addActionListener(new klikback());
    }

    private class klikback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_menu_manajer();
            } catch (SQLException ex) {
                Logger.getLogger(c_hsl_produksi_m.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
