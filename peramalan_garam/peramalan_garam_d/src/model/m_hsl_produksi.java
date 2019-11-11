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
public class m_hsl_produksi extends m_model{
    String query;
    
    public m_hsl_produksi() throws SQLException{
        super();
    }
    
    public DefaultTableModel getTabel(){
        String[] header = {"Id Hasil Produksi", "Id Pemeliharaan Lahan", "Garam", "Pembungkusan Garam"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from hsl_produksi";
            ResultSet rs = kon.getResult(query);
            
            while (rs.next()) {
                String[] kolom = new String[4];
                kolom[0] = rs.getString("id_hsl_produksi");
                kolom[1] = rs.getString("id_pml_lahan");
                kolom[2] = rs.getString("garam");
                kolom[3] = rs.getString("pembungkusan_garam");
                dtm.addRow(kolom);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;
}

    public String[] getid_pml_lahan_combo() {
        String[] id_pml_lahan_combo = null;
            int x=0;
            try {
                Statement stm = kon.koneksi.createStatement();
                ResultSet rs = stm.executeQuery(" select id_pml_lahan from pml_lahan order by id_pml_lahan desc limit 1");
                rs.last();
                int row = rs.getRow();
                rs.beforeFirst();
                id_pml_lahan_combo = new String [row];
                while(rs.next()){
                    id_pml_lahan_combo[x] = rs.getString("id_pml_lahan");
                    x++;
                }
        } catch (SQLException ex) {
            Logger.getLogger(m_hsl_produksi.class.getName()).log(Level.SEVERE, null, ex);
        }
            return id_pml_lahan_combo;
    }

    public void insert(String id_pml_lahan_combo, String garam_tf, String pembungkusan_garam_tf) {
        try {
            String query="INSERT INTO `peramalan_garam_d`.`hsl_produksi` (`id_hsl_produksi`, `id_pml_lahan`, `garam`, `pembungkusan_garam`) "
                    + "VALUES (NULL, '" + id_pml_lahan_combo + "', '" + garam_tf + "', '" + pembungkusan_garam_tf + "');";
            kon.execute(query);
           
        } catch (SQLException e) {
            System.out.println(e);
            
        }
    }
}
