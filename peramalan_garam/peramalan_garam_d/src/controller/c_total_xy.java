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
import model.m_total_xy;
import view.v_total_xy;

/**
 *
 * @author admin pc
 */
public class c_total_xy {
    v_total_xy views;
    m_total_xy models;
    
    public c_total_xy() throws SQLException {
        views = new v_total_xy();
        models = new m_total_xy();
        views.setVisible(true);
        views.gettabel_t_xy().setModel(models.getTabel());

        views.getback_btn().addActionListener(new klikback());
}

    private class klikback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_xy();
            } catch (SQLException ex) {
                Logger.getLogger(c_total_xy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
