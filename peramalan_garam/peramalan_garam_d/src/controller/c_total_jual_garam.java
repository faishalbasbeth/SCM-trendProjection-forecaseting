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
import model.m_total_jual_garam;
import view.v_total_jual_garam;

/**
 *
 * @author admin pc
 */
public class c_total_jual_garam {
    v_total_jual_garam views;
    m_total_jual_garam models;
    
    public c_total_jual_garam() throws SQLException {
        views = new v_total_jual_garam();
        models = new m_total_jual_garam();
        views.setVisible(true);
        views.gettabel_t_jual_garam().setModel(models.getTabel());

        views.getback_btn().addActionListener(new klikback());
}

    private class klikback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_jual_garam();
            } catch (SQLException ex) {
                Logger.getLogger(c_total_jual_garam.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
