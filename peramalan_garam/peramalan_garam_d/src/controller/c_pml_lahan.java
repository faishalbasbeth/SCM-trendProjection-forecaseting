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
import model.m_pml_lahan;
import view.v_pml_lahan;

/**
 *
 * @author admin pc
 */
public class c_pml_lahan {
    v_pml_lahan views;
    m_pml_lahan models;
    
     public c_pml_lahan() throws SQLException {
        views = new v_pml_lahan();
        models = new m_pml_lahan();
        views.gettabel_pml_lahan().setModel(models.getTabel());
        views.getid_pml_lahan_tf().setEnabled(false);
        views.setVisible(true);

        views.getsimpan_btn().addActionListener(new kliksimpan());
        views.getback_btn().addActionListener(new klikback());
    }

    private class klikback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_menu_produksi();
            } catch (SQLException ex) {
                Logger.getLogger(c_pml_lahan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class kliksimpan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.gettabel_pml_lahan().setModel(models.getTabel());
            String id_pml_lahan_tf = views.getid_pml_lahan_tf().getText();
            String bulan_pml_lahan_combo = (String) views.getbulan_pml_lahan_combo().getSelectedItem();
            String slr_utama_combo = (String) views.getslr_utama_combo().getSelectedItem();
            String bozem_combo = (String) views.getbozem_combo().getSelectedItem();
            String pintu_air_combo = (String) views.getpintu_air_combo().getSelectedItem();
            String phb_evaporator_combo = (String) views.getphb_evaporator_combo().getSelectedItem();
            String meja_kts_combo = (String) views.getmeja_kts_combo().getSelectedItem();
            String tahun_pml_lahan_tf = views.gettahun_pml_lahan_tf().getText();
            if (id_pml_lahan_tf.equals("")) {
                models.insert(bulan_pml_lahan_combo, slr_utama_combo, bozem_combo, pintu_air_combo, phb_evaporator_combo, meja_kts_combo, tahun_pml_lahan_tf);
                JOptionPane.showMessageDialog(views, "Data Berhasil Disimpan");
            }

            views.gettabel_pml_lahan().setModel(models.getTabel());
        }

        
    }
}
