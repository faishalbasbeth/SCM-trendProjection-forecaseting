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
import model.m_penjualan;
import view.v_penjualan_m;

/**
 *
 * @author admin pc
 */
public class c_penjualan_m {
    v_penjualan_m views;
    m_penjualan models;
    
    public c_penjualan_m() throws SQLException {
        views = new v_penjualan_m();
        models = new m_penjualan();
        views.setVisible(true);
        views.gettabel_penjualan().setModel(models.getTabel());

        views.getback_btn().addActionListener(new klikback());

    }

    private class klikback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_menu_manajer();
            } catch (SQLException ex) {
                Logger.getLogger(c_penjualan_m.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
