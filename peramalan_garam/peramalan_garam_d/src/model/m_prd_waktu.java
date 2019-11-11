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
public class m_prd_waktu extends m_model{
    String query;
    
    public m_prd_waktu() throws SQLException{
    super();
}
    public DefaultTableModel getTabel(){
        String[] header = {"Id Periode Waktu", "Id Total Periode Waktu", "Total Periode Waktu", "Periode Waktu", "T Total Periode Waktu"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from prd_waktu";
            ResultSet rs = kon.getResult(query);
            
            while (rs.next()) {
                String[] kolom = new String[5];
                kolom[0] = rs.getString("id_prd_waktu");
                kolom[1] = rs.getString("id_total_prd_waktu");
                kolom[2] = rs.getString("total_prd_waktu");
                kolom[3] = rs.getString("prd_waktu");
                kolom[4] = rs.getString("t_total_prd_waktu");
                dtm.addRow(kolom);
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;
}

    public String[] getid_t_prd_waktu_combo() {
        String[] id_t_prd_waktu_combo = null;
            int x=0;
            try{
                Statement stm = kon.koneksi.createStatement();
                ResultSet rs = stm.executeQuery(" select id_total_prd_waktu from total_prd_waktu order by id_total_prd_waktu desc limit 1");
                rs.last();
                int row = rs.getRow();
                rs.beforeFirst();
                id_t_prd_waktu_combo = new String [row];
                while(rs.next()){
                    id_t_prd_waktu_combo[x] = rs.getString("id_total_prd_waktu");
                    x++;
                }
        } catch (SQLException ex) {
            Logger.getLogger(m_prd_waktu.class.getName()).log(Level.SEVERE, null, ex);
        }
            return id_t_prd_waktu_combo;
    }

    public String gett_prd_waktu_tf(String id) throws SQLException {
        System.out.println(id);
        String t_prd_waktu = null;
        try{
            Statement stm = kon.koneksi.createStatement();
            ResultSet rs = stm.executeQuery("select total_prd_waktu from total_prd_waktu where id_total_prd_waktu= " + id + " ");
            rs.next();
            t_prd_waktu = String.valueOf(rs.getInt("total_prd_waktu"));
        }catch (SQLException ex) {
            Logger.getLogger(m_prd_waktu.class.getName()).log(Level.SEVERE, null, ex);
        }
    return t_prd_waktu;
    }

    public void insert(String id_t_prd_waktu_combo, String t_prd_waktu_tf, String prd_waktu_tf, String t_t_prd_waktu_tf) {
        try {
            String query="INSERT INTO `peramalan_garam_d`.`prd_waktu` (`id_prd_waktu`, `id_total_prd_waktu`, `total_prd_waktu`, `prd_waktu`, `t_total_prd_waktu`) "
                    + "VALUES (NULL, '" + id_t_prd_waktu_combo + "', '" + t_prd_waktu_tf + "', '" + prd_waktu_tf + "', '" + t_t_prd_waktu_tf + "');";
            kon.execute(query);
            
            String query1="INSERT INTO `peramalan_garam_d`.`total_prd_waktu` (`id_total_prd_waktu`, `total_prd_waktu`) "
                    + "VALUES (NULL, '" + t_t_prd_waktu_tf + "');";
            kon.execute(query1);
           
        } catch (SQLException e) {
            System.out.println(e);
            
        }
    }
}
