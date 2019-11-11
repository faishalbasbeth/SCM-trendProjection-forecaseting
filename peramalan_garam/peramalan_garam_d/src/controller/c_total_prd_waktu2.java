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
import model.m_total_prd_waktu2;
import view.v_total_prd_waktu2;

/**
 *
 * @author admin pc
 */
public class c_total_prd_waktu2 {
    v_total_prd_waktu2 views;
    m_total_prd_waktu2 models;
    
    public c_total_prd_waktu2() throws SQLException {
        views = new v_total_prd_waktu2();
        models = new m_total_prd_waktu2();
        views.setVisible(true);
        views.gettabel_t_prd_waktu2().setModel(models.getTabel());

        views.getback_btn().addActionListener(new klikback());
}

    private class klikback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_prd_waktu2();
            } catch (SQLException ex) {
                Logger.getLogger(c_total_prd_waktu2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
