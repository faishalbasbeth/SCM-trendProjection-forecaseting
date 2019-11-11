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
import view.v_menu_produksi;

/**
 *
 * @author admin pc
 */
public class c_menu_produksi {
    v_menu_produksi views;
    
    public c_menu_produksi() throws SQLException {
        views = new v_menu_produksi();
        views.setVisible(true);

        views.getexit_btn().addActionListener(new klikexit());
        views.getpml_lahan_btn().addActionListener(new klikpml_lahan());
        views.gethsl_produksi_btn().addActionListener(new klikhsl_produksi());
        views.getpenjualan_btn().addActionListener(new klikpenjualan());
        views.getk_produksi_btn().addActionListener(new klikk_produksi());

    }

    private class klikk_produksi implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_k_produksi();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu_produksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class klikpenjualan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_penjualan();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu_produksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class klikhsl_produksi implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_hsl_produksi();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu_produksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class klikpml_lahan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           views.dispose();
            try {
                new c_pml_lahan();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu_produksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class klikexit implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedOption = JOptionPane.showConfirmDialog(null,
            "Apakah anda akan menutup aplikasi?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {
               int c_login = 0;
            System.exit(c_login);
 }
        }

        
    }
}
