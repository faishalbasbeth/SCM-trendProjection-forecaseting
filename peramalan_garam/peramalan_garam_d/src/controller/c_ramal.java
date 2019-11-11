/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.m_ramal;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import view.v_ramal;

/**
 *
 * @author admin pc
 */
public class c_ramal {
    v_ramal views;
    m_ramal models;
    
    public c_ramal() throws SQLException {
        views = new v_ramal();
        models = new m_ramal();
        views.setVisible(true);
        views.gettabel_ramal().setModel(models.getTabel());
        views.getid_ramal_tf().setEnabled(false);
        views.gett_t_prd_waktu_tf().setEditable(false);
        views.getprd_waktu_tf().setEditable(false);
        views.gett_t_jual_garam_tf().setEditable(false);
        views.getrata_prd_waktu_tf().setEditable(false);
        views.getrata_jual_garam_tf().setEditable(false);
        views.gett_t_xy_tf().setEditable(false);
        views.gett_t_prd_waktu2_tf().setEditable(false);
        views.getb_tf().setEditable(false);
        views.geta_tf().setEditable(false);
        views.gethasil_ramalan_tf().setEditable(false);
        
        String[] id_prd_waktu_combo = models.getid_prd_waktu_combo();
        views.comboid_prd_waktu(id_prd_waktu_combo);
        
        String[] id_jual_garam_combo = models.getid_jual_garam_combo();
        views.comboid_jual_garam(id_jual_garam_combo);
        
        String[] id_xy_combo = models.getid_xy_combo();
        views.comboid_xy(id_xy_combo);
        
        String[] id_prd_waktu2_combo = models.getid_prd_waktu2_combo();
        views.comboid_prd_waktu2(id_prd_waktu2_combo);
        
        views.getback_btn().addActionListener(new klikback());
        
        views.setOnClikid_prd_waktu(new klikid_prd_waktu());
        
        views.setOnClikid_jual_garam(new klikid_jual_garam());
        
        views.setOnClikid_xy(new klikid_xy());
        
        views.setOnClikid_prd_waktu2(new klikid_prd_waktu2());
        
        views.getsimpan_btn().addActionListener(new kliksimpan());
        
        views.getg_peramalan_btn().addActionListener(new klikg_peramalan());
        
}

    private class klikg_peramalan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {            
            DefaultCategoryDataset piedata = new DefaultCategoryDataset();
            

              int[]a;
              String bulan[];
              int[]b;
              
              a = models.getPie();
              bulan = models.getBulan();
              b = models.getPie_real();
              
              for (int i = 0; i <a.length; i++) {
                
              piedata.setValue(a[i], "ramal", bulan[i]);
              piedata.setValue(a[i], "real", bulan[i]);
              }

            

            JFreeChart chart = ChartFactory.createBarChart3D("Nilai Ramal", "x", "y", piedata);
            ChartFrame frame = new ChartFrame("framechart", chart);
            frame.setSize(800,600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            
            
        
        }

        
    }

    private class kliksimpan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.gettabel_ramal().setModel(models.getTabel());
            String id_ramal_tf = views.getid_ramal_tf().getText();
            String bulan_combo = (String) views.getbulan_combo().getSelectedItem();
            String tahun_tf = views.gettahun_tf().getText();
            String id_prd_waktu_combo = (String) views.getid_prd_waktu_combo().getSelectedItem();
            String t_t_prd_waktu_tf = views.gett_t_prd_waktu_tf().getText();
            String prd_waktu_tf = views.getprd_waktu_tf().getText();
            String id_jual_garam_combo = (String) views.getid_jual_garam_combo().getSelectedItem();
            String t_t_jual_garam_tf = views.gett_t_jual_garam_tf().getText();
            String rata_prd_waktu_tf = views.getrata_prd_waktu_tf().getText();
            String rata_jual_garam_tf = views.getrata_jual_garam_tf().getText();
            String id_xy_combo = (String) views.getid_xy_combo().getSelectedItem();
            String t_t_xy_tf = views.gett_t_xy_tf().getText();
            String id_prd_waktu2_combo = (String) views.getid_prd_waktu2_combo().getSelectedItem();
            String t_t_prd_waktu2_tf = views.gett_t_prd_waktu2_tf().getText();
            String b_tf = views.getb_tf().getText();
            String a_tf = views.geta_tf().getText();
            String hasil_ramalan_tf = views.gethasil_ramalan_tf().getText();
            if (id_ramal_tf.equals("")) {
                models.insert(id_ramal_tf, bulan_combo, tahun_tf, id_prd_waktu_combo, t_t_prd_waktu_tf, prd_waktu_tf, id_jual_garam_combo, t_t_jual_garam_tf, rata_prd_waktu_tf, rata_jual_garam_tf, id_xy_combo, t_t_xy_tf, id_prd_waktu2_combo, t_t_prd_waktu2_tf, b_tf, a_tf, hasil_ramalan_tf);
                JOptionPane.showMessageDialog(views, "Data Berhasil Disimpan");
            }

            views.gettabel_ramal().setModel(models.getTabel());
        }

        
    }

    private class klikid_prd_waktu2 implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            double ttpw, pw, rpw,
                    ttjg,rjg,
                    ttxy,
                    ttx2,
                    b,
                    a,
                    hr;
            
            String b2,a2, hr2;
            
            System.out.println(views.getSelectedid_prd_waktu2());
            if (views.getid_prd_waktu2_combo().getSelectedIndex() == 0) {
                views.sett_t_prd_waktu2_tf("0");
            }else {
                try {
                    views.sett_t_prd_waktu2_tf(String.valueOf(models.gett_t_prd_waktu2_tf(views.getSelectedid_prd_waktu2())));
                    
                    ttpw = Double.parseDouble(models.gett_t_prd_waktu_tf(views.getSelectedid_prd_waktu()));
                    pw = Double.parseDouble(models.getprd_waktu_tf(views.getSelectedid_prd_waktu()));
                    rpw = ttpw / pw;
                    
                    ttjg = Double.parseDouble(models.gett_t_jual_garam_tf(views.getSelectedid_jual_garam()));
                    pw = Double.parseDouble(models.getprd_waktu_tf(views.getSelectedid_prd_waktu()));
                    rjg = ttjg / pw;
                    
                    ttxy = Double.parseDouble(models.gett_t_xy_tf(views.getSelectedid_xy()));
                    ttx2 = Double.parseDouble(models.gett_t_prd_waktu2_tf(views.getSelectedid_prd_waktu2()));
                    b = ((ttxy - (pw * rpw * rjg)) / (ttx2 - (pw * (rpw * rpw))));
                    b2 = String.valueOf(b);
                    
                    views.getb_tf().setText(b2);
                    
                    a = rjg - (b * rpw);
                    a2 = String.valueOf(a);
                    
                    views.geta_tf().setText(a2);
                    
                    hr = a + (b * (pw+1));
                    hr2 = String.valueOf(hr);
                    
                    views.gethasil_ramalan_tf().setText(hr2);
                     
                } catch (SQLException ex) {
                    Logger.getLogger(c_ramal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        
    }

    private class klikid_xy implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            System.out.println(views.getSelectedid_xy());
            if (views.getid_xy_combo().getSelectedIndex() == 0) {
                views.sett_t_xy_tf("0");
            }else {
                try {
                    views.sett_t_xy_tf(String.valueOf(models.gett_t_xy_tf(views.getSelectedid_xy())));
                } catch (SQLException ex) {
                    Logger.getLogger(c_ramal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        
    }

    private class klikid_jual_garam implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            double ttpw, pw, rpw,
                    ttjg,rjg;
            String rpw2,rjg2;
            
            System.out.println(views.getSelectedid_jual_garam());
            if (views.getid_jual_garam_combo().getSelectedIndex() == 0) {
                views.sett_t_jual_garam_tf("0");
            }else {
                try {
                    views.sett_t_jual_garam_tf(String.valueOf(models.gett_t_jual_garam_tf(views.getSelectedid_jual_garam())));
                    
                    ttpw = Double.parseDouble(models.gett_t_prd_waktu_tf(views.getSelectedid_prd_waktu()));
                    pw = Double.parseDouble(models.getprd_waktu_tf(views.getSelectedid_prd_waktu()));
                    rpw = ttpw / pw;
                    rpw2 = String.valueOf(rpw);
                    
                    views.getrata_prd_waktu_tf().setText(rpw2);
                    
                    ttjg = Double.parseDouble(models.gett_t_jual_garam_tf(views.getSelectedid_jual_garam()));
                    pw = Double.parseDouble(models.getprd_waktu_tf(views.getSelectedid_prd_waktu()));
                    rjg = ttjg / pw;
                    rjg2 = String.valueOf(rjg);
                    
                    views.getrata_jual_garam_tf().setText(rjg2);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(c_ramal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        
    }

    private class klikid_prd_waktu implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            System.out.println(views.getSelectedid_prd_waktu());
            if (views.getid_prd_waktu_combo().getSelectedIndex() == 0) {
                views.sett_t_prd_waktu_tf("0");
                views.setprd_waktu_tf("0");
            }else {
                try {
                    views.sett_t_prd_waktu_tf(String.valueOf(models.gett_t_prd_waktu_tf(views.getSelectedid_prd_waktu())));
                    views.setprd_waktu_tf(String.valueOf(models.getprd_waktu_tf(views.getSelectedid_prd_waktu())));
                } catch (SQLException ex) {
                    Logger.getLogger(c_ramal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        
    }

    private class klikback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_menu_ramal();
            } catch (SQLException ex) {
                Logger.getLogger(c_ramal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
