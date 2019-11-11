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
import model.m_pml_lahan;
import view.v_pml_lahan_m;

/**
 *
 * @author admin pc
 */
public class c_pml_lahan_m {
    v_pml_lahan_m views;
    m_pml_lahan models;
    
     public c_pml_lahan_m() throws SQLException {
        views = new v_pml_lahan_m();
        models = new m_pml_lahan();
        views.gettabel_pml_lahan().setModel(models.getTabel());
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
                Logger.getLogger(c_pml_lahan_m.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
