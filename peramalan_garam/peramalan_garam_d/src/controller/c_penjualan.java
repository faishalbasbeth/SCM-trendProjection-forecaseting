/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.m_penjualan;
import view.v_penjualan;

/**
 *
 * @author admin pc
 */
public class c_penjualan {
    v_penjualan views;
    m_penjualan models;
    
    public c_penjualan() throws SQLException {
        views = new v_penjualan();
        models = new m_penjualan();
        views.setVisible(true);
        views.gettabel_penjualan().setModel(models.getTabel());
        views.getid_penjualan_tf().setEnabled(false);
        views.getpembungkusan_garam_tf().setEditable(false);
        views.getsisa_tf().setEditable(false);
        
        String[] id_hsl_produksi_combo = models.getid_hsl_produksi_combo();
        views.comboid_hsl_produksi(id_hsl_produksi_combo);
        
        views.getback_btn().addActionListener(new klikback());
        views.setOnClikid_hsl_produksi(new klikid_hsl_produksi());
        views.hasil_sisa(new kliktotaljual());
        views.getsimpan_btn().addActionListener(new kliksimpan());

    }

    private class kliksimpan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.gettabel_penjualan().setModel(models.getTabel());
            String id_penjualan_tf = views.getid_penjualan_tf().getText();
            String id_hsl_produksi_combo = (String) views.getid_hsl_produksi_combo().getSelectedItem();
            String pembungkusan_garam_tf = (String) views.getpembungkusan_garam_tf().getText();
            String total_jual_tf = (String) views.gettotal_jual_tf().getText();
            String sisa_tf = (String) views.getsisa_tf().getText();
            if (id_penjualan_tf.equals("")) {
                models.insert(id_hsl_produksi_combo, pembungkusan_garam_tf, total_jual_tf, sisa_tf);
                JOptionPane.showMessageDialog(views, "Data Berhasil Disimpan");
            }

            views.gettabel_penjualan().setModel(models.getTabel());
        }
        }

        
    

    private class klikback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_menu_produksi();
            } catch (SQLException ex) {
                Logger.getLogger(c_penjualan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class kliktotaljual implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            double bungkus,totaljual,total;
            String total1;
            
            totaljual = Double.parseDouble(views.gettotal_jual_tf().getText());
            bungkus = Double.parseDouble(views.getpembungkusan_garam_tf().getText());
            total = bungkus - totaljual;
            total1 = String.valueOf(total);
            
            views.getsisa_tf().setText(total1);
        }

        
    }

    private class klikid_hsl_produksi implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            System.out.println(views.getSelectedid_hsl_produksi());
            if (views.getid_hsl_produksi_combo().getSelectedIndex() == 0) {
                views.setpembungkusan_garam_tf("0");
            }else {
                try {
                    views.setpembungkusan_garam_tf(String.valueOf(models.getpembungkusan_garam_tf(views.getSelectedid_hsl_produksi())));
                } catch (SQLException ex) {
                    Logger.getLogger(c_penjualan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        
    }

}
