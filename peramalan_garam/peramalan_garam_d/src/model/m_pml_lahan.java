/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin pc
 */
public class m_pml_lahan extends m_model{
    String query;
    
    public m_pml_lahan() throws SQLException{
        super();
}
    public DefaultTableModel getTabel(){
        String[] header = {"Id Pemeliharaan Lahan", "Bulan", "Saluran Utama", "Bozem", "Pintu Air", "Penghubung Evaporator", "Meja Kristalisasi", "Tahun"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from pml_lahan";
            ResultSet rs = kon.getResult(query);
            
            while (rs.next()) {
                String[] kolom = new String[8];
                kolom[0] = rs.getString("id_pml_lahan");
                kolom[1] = rs.getString("bulan_pml_lahan");
                kolom[2] = rs.getString("slr_utama");
                kolom[3] = rs.getString("bozem");
                kolom[4] = rs.getString("pintu_air");
                kolom[5] = rs.getString("phb_evaporator");
                kolom[6] = rs.getString("meja_kts");
                kolom[7] = rs.getString("tahun_pml_lahan");
                dtm.addRow(kolom);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;
}

    public void insert(String bulan_pml_lahan_combo, String slr_utama_combo, String bozem_combo, String pintu_air_combo, String phb_evaporator_combo, String meja_kts_combo, String tahun_pml_lahan_tf) {
        try {
            String query="INSERT INTO `peramalan_garam_d`.`pml_lahan` (`id_pml_lahan`, `bulan_pml_lahan`, `slr_utama`, `bozem`, `pintu_air`, `phb_evaporator`, `meja_kts`, `tahun_pml_lahan`) "
                    + "VALUES (NULL, '" + bulan_pml_lahan_combo + "', '" + slr_utama_combo + "', '" + bozem_combo + "', '" + pintu_air_combo + "', '" + phb_evaporator_combo + "', '" + meja_kts_combo + "', '" + tahun_pml_lahan_tf + "');";
            kon.execute(query);
           
        } catch (SQLException e) {
            System.out.println(e);
            
        }
    }
    
}
