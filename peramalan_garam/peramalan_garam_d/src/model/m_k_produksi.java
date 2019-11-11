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
public class m_k_produksi extends m_model{
    String query;
    
    public m_k_produksi() throws SQLException{
        super();
    }
    
    public DefaultTableModel getTabel(){
        String[] header = {"Id Keputusan Produksi", "Id Ramal","Keputusan Produksi"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from k_produksi";
            ResultSet rs = kon.getResult(query);
            
            while (rs.next()) {
                String[] kolom = new String[3];
                kolom[0] = rs.getString("id_k_produksi");
                kolom[1] = rs.getString("id_ramal");
                kolom[2] = rs.getString("k_produksi");
                dtm.addRow(kolom);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;
}
    public DefaultTableModel getTabel_k_produksi(){
        String[] header = {""};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select k_produksi from k_produksi order by id_k_produksi desc limit 1";
            ResultSet rs = kon.getResult(query);
            
            while (rs.next()) {
                String[] kolom = new String[1];
                kolom[0] = rs.getString("k_produksi");
                dtm.addRow(kolom);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;
}

    public String[] getid_ramal_combo() {
        String[] id_ramal_combo = null;
            int x=0;
            try {
                Statement stm = kon.koneksi.createStatement();
                ResultSet rs = stm.executeQuery(" select id_ramal from ramal order by id_ramal desc limit 1");
                rs.last();
                int row = rs.getRow();
                rs.beforeFirst();
                id_ramal_combo = new String [row];
                while(rs.next()){
                    id_ramal_combo[x] = rs.getString("id_ramal");
                    x++;
                }
        } catch (SQLException ex) {
            Logger.getLogger(m_k_produksi.class.getName()).log(Level.SEVERE, null, ex);
        }
            return id_ramal_combo;
    }

    public void insert(String id_ramal_combo, String k_produksi_tf) {
        try {
            String query="INSERT INTO `peramalan_garam_d`.`k_produksi` (`id_k_produksi`, `id_ramal`, `k_produksi`) "
                    + "VALUES (NULL, '" + id_ramal_combo + "', '" + k_produksi_tf + "');";
            kon.execute(query);
           
        } catch (SQLException e) {
            System.out.println(e);
            
        }
    }
}
