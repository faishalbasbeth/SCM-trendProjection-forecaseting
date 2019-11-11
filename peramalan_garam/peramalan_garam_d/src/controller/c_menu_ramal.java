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
import view.v_menu_ramal;

/**
 *
 * @author admin pc
 */
public class c_menu_ramal {
    v_menu_ramal views;
    
    public c_menu_ramal() throws SQLException {
        views = new v_menu_ramal();
        views.setVisible(true);

        views.getprd_waktu_btn().addActionListener(new klikprd_waktu());
        views.getback_btn().addActionListener(new klikback());
        views.getprd_waktu2_btn().addActionListener(new klikprdwaktu2());
        views.getjual_garam_btn().addActionListener(new klikjual_garam());
        views.getxy_btn().addActionListener(new klikxy());
        views.getramal_garam_btn().addActionListener(new klikramal_garam());


    }

    private class klikramal_garam implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_ramal();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu_ramal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class klikxy implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_xy();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu_ramal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class klikjual_garam implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_jual_garam();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu_ramal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class klikprdwaktu2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_prd_waktu2();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu_ramal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }


    private class klikback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_menu_manajer();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu_ramal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class klikprd_waktu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_prd_waktu();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu_ramal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
