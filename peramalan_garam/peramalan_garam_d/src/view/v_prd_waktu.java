/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ItemListener;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author admin pc
 */
public class v_prd_waktu extends javax.swing.JFrame {

    /**
     * Creates new form v_prd_waktu
     */
    public v_prd_waktu() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public JTextField getid_prd_waktu_tf(){
        return id_prd_waktu_tf;
    }
    public JComboBox getid_t_prd_waktu_combo(){
        return id_t_prd_waktu_combo;
    }
    public void comboid_t_prd_waktu(String[] data){
        int x = 0;
        while (x < data.length) {
            id_t_prd_waktu_combo.addItem(data[x]);
            x++;
        }
    }
    public void setOnClikid_t_prd_waktu(ItemListener a) {
        id_t_prd_waktu_combo.addItemListener(a);
    }
    public String getSelectedid_t_prd_waktu() {
        return id_t_prd_waktu_combo.getSelectedItem().toString();
    }
    public JTextField gett_prd_waktu_tf(){
        return t_prd_waktu_tf;
    }
    public void sett_prd_waktu_tf(String a) {
        t_prd_waktu_tf.setText(a);
    }
    public JTextField getprd_waktu_tf(){
        return prd_waktu_tf;
    }
    public void hasilt_t_prd_waktu(KeyListener a){
        prd_waktu_tf.addKeyListener(a);
    }
    public JTextField gett_t_prd_waktu_tf(){
        return t_t_prd_waktu_tf;
    }
    public JButton getsimpan_btn(){
        return simpan_btn;
    }
    public JTable gettabel_prd_waktu(){
        return tabel_prd_waktu;
    }
    public JButton getback_btn(){
        return back_btn;
    }
    public JButton getnext_btn(){
        return next_btn;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_prd_waktu = new javax.swing.JTable();
        simpan_btn = new javax.swing.JButton();
        next_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        id_t_prd_waktu_combo = new javax.swing.JComboBox<>();
        t_prd_waktu_tf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        prd_waktu_tf = new javax.swing.JTextField();
        t_t_prd_waktu_tf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        id_prd_waktu_tf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/back.png"))); // NOI18N
        getContentPane().add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, -1, -1));

        tabel_prd_waktu.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabel_prd_waktu);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 690, 220));

        simpan_btn.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        simpan_btn.setText("Simpan");
        getContentPane().add(simpan_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, -1, -1));

        next_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/next-button.png"))); // NOI18N
        getContentPane().add(next_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 590, 60, 40));

        jLabel9.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel9.setText("Id Total Periode Waktu   :");

        id_t_prd_waktu_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Salah Satu" }));

        jLabel11.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel11.setText("Total Periode Waktu       :");

        jLabel12.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel12.setText("Periode Waktu                :");

        jLabel8.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel8.setText("T_Total Periode Waktu  :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(id_t_prd_waktu_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(t_prd_waktu_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(prd_waktu_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(t_t_prd_waktu_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(id_t_prd_waktu_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(t_prd_waktu_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(prd_waktu_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(t_t_prd_waktu_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 340, 230));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/peramalan.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel10.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jLabel10.setText("Id Periode Waktu            :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 170, -1));
        getContentPane().add(id_prd_waktu_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 70, 20));

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
            java.util.logging.Logger.getLogger(v_prd_waktu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_prd_waktu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_prd_waktu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_prd_waktu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_prd_waktu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JTextField id_prd_waktu_tf;
    private javax.swing.JComboBox<String> id_t_prd_waktu_combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton next_btn;
    private javax.swing.JTextField prd_waktu_tf;
    private javax.swing.JButton simpan_btn;
    private javax.swing.JTextField t_prd_waktu_tf;
    private javax.swing.JTextField t_t_prd_waktu_tf;
    private javax.swing.JTable tabel_prd_waktu;
    // End of variables declaration//GEN-END:variables
}