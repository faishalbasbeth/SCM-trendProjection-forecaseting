/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author admin pc
 */
public class v_ramal extends javax.swing.JFrame {

    /**
     * Creates new form v_ramal
     */
    public v_ramal() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public JTextField getid_ramal_tf(){
        return id_ramal_tf;
    }
    public JComboBox getbulan_combo(){
        return bulan_combo;
    }
    public JTextField gettahun_tf(){
        return tahun_tf;
    }
    public JComboBox getid_prd_waktu_combo(){
        return id_prd_waktu_combo;
    }
    public void comboid_prd_waktu(String[] data){
        int x = 0;
        while (x < data.length) {
            id_prd_waktu_combo.addItem(data[x]);
            x++;
        }
    }
    public void setOnClikid_prd_waktu(ItemListener a) {
        id_prd_waktu_combo.addItemListener(a);
    }
    public String getSelectedid_prd_waktu() {
        return id_prd_waktu_combo.getSelectedItem().toString();
    }
    public JTextField gett_t_prd_waktu_tf(){
        return t_t_prd_waktu_tf;
    }
    public void sett_t_prd_waktu_tf(String a) {
        t_t_prd_waktu_tf.setText(a);
    }
    public JTextField getprd_waktu_tf(){
        return prd_waktu_tf;
    }
    public void setprd_waktu_tf(String a) {
        prd_waktu_tf.setText(a);
    }
    public JComboBox getid_jual_garam_combo(){
        return id_jual_garam_combo;
    }
    public void comboid_jual_garam(String[] data){
        int x = 0;
        while (x < data.length) {
            id_jual_garam_combo.addItem(data[x]);
            x++;
        }
    }
    public void setOnClikid_jual_garam(ItemListener a) {
        id_jual_garam_combo.addItemListener(a);
    }
    public String getSelectedid_jual_garam() {
        return id_jual_garam_combo.getSelectedItem().toString();
    }
    public JTextField gett_t_jual_garam_tf(){
        return t_t_jual_garam_tf;
    }
    public void sett_t_jual_garam_tf(String a) {
        t_t_jual_garam_tf.setText(a);
    }
    public JTextField getrata_prd_waktu_tf(){
        return rata_prd_waktu_tf;
    }
    public JTextField getrata_jual_garam_tf(){
        return rata_jual_garam_tf;
    }
    public JComboBox getid_xy_combo(){
        return id_xy_combo;
    }
    public void comboid_xy(String[] data){
        int x = 0;
        while (x < data.length) {
            id_xy_combo.addItem(data[x]);
            x++;
        }
    }
    public void setOnClikid_xy(ItemListener a) {
        id_xy_combo.addItemListener(a);
    }
    public String getSelectedid_xy() {
        return id_xy_combo.getSelectedItem().toString();
    }
    public JTextField gett_t_xy_tf(){
        return t_t_xy_tf;
    }
    public void sett_t_xy_tf(String a) {
        t_t_xy_tf.setText(a);
    }
    public JComboBox getid_prd_waktu2_combo(){
        return id_prd_waktu2_combo;
    }
    public void comboid_prd_waktu2(String[] data){
        int x = 0;
        while (x < data.length) {
            id_prd_waktu2_combo.addItem(data[x]);
            x++;
        }
    }
    public void setOnClikid_prd_waktu2(ItemListener a) {
        id_prd_waktu2_combo.addItemListener(a);
    }
    public String getSelectedid_prd_waktu2() {
        return id_prd_waktu2_combo.getSelectedItem().toString();
    }
    public JTextField gett_t_prd_waktu2_tf(){
        return t_t_prd_waktu2_tf;
    }
    public void sett_t_prd_waktu2_tf(String a) {
        t_t_prd_waktu2_tf.setText(a);
    }
    public JTextField getb_tf(){
        return b_tf;
    }
    public JTextField geta_tf(){
        return a_tf;
    }
    public JTextField gethasil_ramalan_tf(){
        return hasil_ramalan_tf;
    }
    public JTable gettabel_ramal(){
        return tabel_ramal;
    }
    public JButton getback_btn(){
        return back_btn;
    }
    public JButton getsimpan_btn(){
        return simpan_btn;
    }
    public JButton getg_peramalan_btn(){
        return g_peramalan_btn;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        t_t_prd_waktu2_tf = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        a_tf = new javax.swing.JTextField();
        hasil_ramalan_tf = new javax.swing.JTextField();
        b_tf = new javax.swing.JTextField();
        id_prd_waktu2_combo = new javax.swing.JComboBox<>();
        back_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_ramal = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        tahun_tf = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        prd_waktu_tf = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        bulan_combo = new javax.swing.JComboBox<>();
        t_t_prd_waktu_tf = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        id_prd_waktu_combo = new javax.swing.JComboBox<>();
        id_jual_garam_combo = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        t_t_jual_garam_tf = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        rata_prd_waktu_tf = new javax.swing.JTextField();
        rata_jual_garam_tf = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        id_xy_combo = new javax.swing.JComboBox<>();
        t_t_xy_tf = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        simpan_btn = new javax.swing.JButton();
        g_peramalan_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        id_ramal_tf = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel14.setText("T_Total Periode Waktu²         :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 200, -1));

        t_t_prd_waktu2_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_t_prd_waktu2_tfActionPerformed(evt);
            }
        });
        getContentPane().add(t_t_prd_waktu2_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 210, 130, 30));

        jLabel27.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel27.setText("Id Periode Waktu²                  :");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 200, -1));

        jLabel28.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel28.setText("Persilangan Sumbu Y / a        :");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 290, 200, -1));

        jLabel29.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel29.setText("Hasil Ramalan                        : ");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 200, -1));

        jLabel30.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel30.setText("Kemiringan Garis Regresi / b :");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 210, -1));

        a_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_tfActionPerformed(evt);
            }
        });
        getContentPane().add(a_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 290, 130, 30));

        hasil_ramalan_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasil_ramalan_tfActionPerformed(evt);
            }
        });
        getContentPane().add(hasil_ramalan_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 330, 130, 30));

        b_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tfActionPerformed(evt);
            }
        });
        getContentPane().add(b_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 250, 130, 30));

        id_prd_waktu2_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Salah Satu" }));
        getContentPane().add(id_prd_waktu2_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 170, 130, 30));

        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/back.png"))); // NOI18N
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        getContentPane().add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, -1, -1));

        tabel_ramal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel_ramal);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 1070, 120));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(tahun_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 130, 30));

        jLabel19.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel19.setText("T_Total Periode Waktu :");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 170, -1));
        jPanel2.add(prd_waktu_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 130, 30));

        jLabel20.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel20.setText("Periode Waktu               :");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 160, -1));

        bulan_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        jPanel2.add(bulan_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 130, 30));
        jPanel2.add(t_t_prd_waktu_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 130, 30));

        jLabel18.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel18.setText("Id Periode Waktu          :");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 160, -1));

        jLabel16.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel16.setText("Bulan                            :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, -1));

        jLabel17.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel17.setText("Tahun                           :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, -1));

        id_prd_waktu_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Salah Satu" }));
        jPanel2.add(id_prd_waktu_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 130, 30));

        id_jual_garam_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Salah Satu" }));
        jPanel2.add(id_jual_garam_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 130, 30));

        jLabel26.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel26.setText("Id Jual Garam                :");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel21.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel21.setText("T_Total Jual Garam   :");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 150, -1));

        t_t_jual_garam_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_t_jual_garam_tfActionPerformed(evt);
            }
        });
        jPanel2.add(t_t_jual_garam_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 130, 30));

        jLabel25.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel25.setText("Rata2 Periode Waktu :");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 160, -1));

        rata_prd_waktu_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rata_prd_waktu_tfActionPerformed(evt);
            }
        });
        jPanel2.add(rata_prd_waktu_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 130, 30));

        rata_jual_garam_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rata_jual_garam_tfActionPerformed(evt);
            }
        });
        jPanel2.add(rata_jual_garam_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 130, 30));

        jLabel22.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel22.setText("Rata2 Jual Garam      :");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 150, -1));

        jLabel23.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel23.setText("Id XY                        :");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 160, -1));

        id_xy_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Salah Satu" }));
        jPanel2.add(id_xy_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 130, 30));

        t_t_xy_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_t_xy_tfActionPerformed(evt);
            }
        });
        jPanel2.add(t_t_xy_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 130, 30));

        jLabel24.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel24.setText("T_Total XY               :");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 160, -1));

        simpan_btn.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        simpan_btn.setText("Simpan");
        jPanel2.add(simpan_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 980, 280));

        g_peramalan_btn.setFont(new java.awt.Font("Microsoft Himalaya", 0, 18)); // NOI18N
        g_peramalan_btn.setText("GRAFIK PERAMALAN");
        g_peramalan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_peramalan_btnActionPerformed(evt);
            }
        });
        getContentPane().add(g_peramalan_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 600, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/peramalan.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, -1));

        jLabel15.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel15.setText("Id Ramal                       :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 160, -1));
        getContentPane().add(id_ramal_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 80, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_t_prd_waktu2_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_t_prd_waktu2_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_t_prd_waktu2_tfActionPerformed

    private void t_t_jual_garam_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_t_jual_garam_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_t_jual_garam_tfActionPerformed

    private void rata_jual_garam_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rata_jual_garam_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rata_jual_garam_tfActionPerformed

    private void t_t_xy_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_t_xy_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_t_xy_tfActionPerformed

    private void rata_prd_waktu_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rata_prd_waktu_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rata_prd_waktu_tfActionPerformed

    private void a_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_tfActionPerformed

    private void hasil_ramalan_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasil_ramalan_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasil_ramalan_tfActionPerformed

    private void b_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_tfActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_back_btnActionPerformed

    private void g_peramalan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_peramalan_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g_peramalan_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(v_ramal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_ramal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_ramal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_ramal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_ramal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a_tf;
    private javax.swing.JTextField b_tf;
    private javax.swing.JButton back_btn;
    private javax.swing.JComboBox<String> bulan_combo;
    private javax.swing.JButton g_peramalan_btn;
    private javax.swing.JTextField hasil_ramalan_tf;
    private javax.swing.JComboBox<String> id_jual_garam_combo;
    private javax.swing.JComboBox<String> id_prd_waktu2_combo;
    private javax.swing.JComboBox<String> id_prd_waktu_combo;
    private javax.swing.JTextField id_ramal_tf;
    private javax.swing.JComboBox<String> id_xy_combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField prd_waktu_tf;
    private javax.swing.JTextField rata_jual_garam_tf;
    private javax.swing.JTextField rata_prd_waktu_tf;
    private javax.swing.JButton simpan_btn;
    private javax.swing.JTextField t_t_jual_garam_tf;
    private javax.swing.JTextField t_t_prd_waktu2_tf;
    private javax.swing.JTextField t_t_prd_waktu_tf;
    private javax.swing.JTextField t_t_xy_tf;
    private javax.swing.JTable tabel_ramal;
    private javax.swing.JTextField tahun_tf;
    // End of variables declaration//GEN-END:variables


}
