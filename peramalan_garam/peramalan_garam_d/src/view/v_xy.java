/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author admin pc
 */
public class v_xy extends javax.swing.JFrame {

    /**
     * Creates new form v_total_xy
     */
    public v_xy() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public JTextField getid_xy_tf(){
        return id_xy_tf;
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
    public JTextField getjual_garam_tf(){
        return jual_garam_tf;
    }
    public void setjual_garam_tf(String a) {
        jual_garam_tf.setText(a);
    }
    public JTextField getxy_tf(){
        return xy_tf;
    }
    public JComboBox getid_t_xy_combo(){
        return id_t_xy_combo;
    }
    public void comboid_t_xy(String[] data){
        int x = 0;
        while (x < data.length) {
            id_t_xy_combo.addItem(data[x]);
            x++;
        }
    }
    public void setOnClikid_t_xy(ItemListener a) {
        id_t_xy_combo.addItemListener(a);
    }
    public String getSelectedid_t_xy() {
        return id_t_xy_combo.getSelectedItem().toString();
    }
    public JTextField gett_xy_tf(){
        return t_xy_tf;
    }
    public void sett_xy_tf(String a) {
        t_xy_tf.setText(a);
    }
    public JTextField gett_t_xy_tf(){
        return t_t_xy_tf;
    }
    public JTable gettabel_xy(){
        return tabel_xy;
    }
    public JButton getback_btn(){
        return back_btn;
    }
    public JButton getnext_btn(){
        return next_btn;
    }
    public JButton getsimpan_btn(){
        return simpan_btn;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back_btn = new javax.swing.JButton();
        next_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_xy = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        t_t_xy_tf = new javax.swing.JTextField();
        xy_tf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        id_t_xy_combo = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        t_xy_tf = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        prd_waktu_tf = new javax.swing.JTextField();
        id_prd_waktu_combo = new javax.swing.JComboBox<>();
        id_jual_garam_combo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jual_garam_tf = new javax.swing.JTextField();
        simpan_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        id_xy_tf = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/back.png"))); // NOI18N
        getContentPane().add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, -1, -1));

        next_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/next-button.png"))); // NOI18N
        getContentPane().add(next_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 590, 60, 40));

        tabel_xy.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabel_xy);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 1070, 120));

        jLabel13.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel13.setText("T_Total XY                    :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 170, -1));
        getContentPane().add(t_t_xy_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 330, 130, 30));
        getContentPane().add(xy_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 130, 30));

        jLabel16.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel16.setText("XY                                  :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 170, -1));

        jLabel17.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel17.setText("Id Total XY                    :");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 170, -1));

        id_t_xy_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Salah Satu" }));
        getContentPane().add(id_t_xy_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 230, 130, 30));

        jLabel18.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel18.setText("Total XY                        :");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 170, -1));
        getContentPane().add(t_xy_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 280, 130, 30));

        jLabel12.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel12.setText("Id Periode Waktu (x)      :");

        jLabel10.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel10.setText("Periode Waktu (x)          :");

        id_prd_waktu_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Salah Satu" }));

        id_jual_garam_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Salah Satu" }));

        jLabel11.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel11.setText("Id Jual Garam (y)           :");

        jLabel15.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel15.setText("Jual Garam (y)               :");

        simpan_btn.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        simpan_btn.setText("Simpan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(id_prd_waktu_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(prd_waktu_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(id_jual_garam_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jual_garam_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(simpan_btn)
                .addGap(303, 303, 303))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(id_prd_waktu_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(prd_waktu_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(id_jual_garam_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jual_garam_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(simpan_btn)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 700, 270));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/peramalan.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(id_xy_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 90, 10));

        jLabel14.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel14.setText("Id XY                             :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 170, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(v_xy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_xy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_xy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_xy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_xy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JComboBox<String> id_jual_garam_combo;
    private javax.swing.JComboBox<String> id_prd_waktu_combo;
    private javax.swing.JComboBox<String> id_t_xy_combo;
    private javax.swing.JTextField id_xy_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jual_garam_tf;
    private javax.swing.JButton next_btn;
    private javax.swing.JTextField prd_waktu_tf;
    private javax.swing.JButton simpan_btn;
    private javax.swing.JTextField t_t_xy_tf;
    private javax.swing.JTextField t_xy_tf;
    private javax.swing.JTable tabel_xy;
    private javax.swing.JTextField xy_tf;
    // End of variables declaration//GEN-END:variables
}