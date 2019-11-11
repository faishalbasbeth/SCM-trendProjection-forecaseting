/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin pc
 */
public class m_penjualan extends m_model{
    String query;
    
    public m_penjualan() throws SQLException{
    super();
}
    public DefaultTableModel getTabel(){
        String[] header = {"Id Penjualan", "Id Hasil Produksi", "Pembungkusan Garam", "Total Jual", "Sisa"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from penjualan";
            ResultSet rs = kon.getResult(query);
            
            while (rs.next()) {
                String[] kolom = new String[5];
                kolom[0] = rs.getString("id_penjualan");
                kolom[1] = rs.getString("id_hsl_produksi");
                kolom[2] = rs.getString("pembungkusan_garam");
                kolom[3] = rs.getString("total_jual");
                kolom[4] = rs.getString("sisa");
                dtm.addRow(kolom);
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;
}

    public String[] getid_hsl_produksi_combo() {
        String[] id_hsl_produksi_combo = null;
            int x=0;
            try{
                Statement stm = kon.koneksi.createStatement();
                ResultSet rs = stm.executeQuery(" select id_hsl_produksi from hsl_produksi order by id_hsl_produksi desc limit 1");
                rs.last();
                int row = rs.getRow();
                rs.beforeFirst();
                id_hsl_produksi_combo = new String [row];
                while(rs.next()){
                    id_hsl_produksi_combo[x] = rs.getString("id_hsl_produksi");
                    x++;
                }
        } catch (SQLException ex) {
            Logger.getLogger(m_penjualan.class.getName()).log(Level.SEVERE, null, ex);
        }
            return id_hsl_produksi_combo;
    }

    public String getpembungkusan_garam_tf(String id) throws SQLException {
        System.out.println(id);
        String bungkus = null;
        try{
            Statement stm = kon.koneksi.createStatement();
            ResultSet rs = stm.executeQuery("select pembungkusan_garam from hsl_produksi where id_hsl_produksi= " + id + " ");
            rs.next();
            bungkus = String.valueOf(rs.getInt("pembungkusan_garam"));
        }catch (SQLException ex) {
            Logger.getLogger(m_penjualan.class.getName()).log(Level.SEVERE, null, ex);
        }
    return bungkus;
    }

    public void insert(String id_hsl_produksi_combo, String pembungkusan_garam_tf, String total_jual_tf, String sisa_tf) {
        try {
            String query="INSERT INTO `peramalan_garam_d`.`penjualan` (`id_penjualan`, `id_hsl_produksi`, `pembungkusan_garam`, `total_jual`, `sisa`) "
                    + "VALUES (NULL, '" + id_hsl_produksi_combo + "', '" + pembungkusan_garam_tf + "', '" + total_jual_tf + "', '" + sisa_tf + "');";
            kon.execute(query);
           
        } catch (SQLException e) {
            System.out.println(e);
            
        }
    }
    
}
