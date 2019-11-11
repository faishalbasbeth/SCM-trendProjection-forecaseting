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
public class m_jual_garam extends m_model{
    String query;
    
    public m_jual_garam() throws SQLException{
    super();
}
    public DefaultTableModel getTabel(){
        String[] header = {"Id Jual Garam", "Id Total Jual Garam", "Total Jual Garam", "Jual Garam", "T Total Jual Garam"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from jual_garam";
            ResultSet rs = kon.getResult(query);
            
            while (rs.next()) {
                String[] kolom = new String[5];
                kolom[0] = rs.getString("id_jual_garam");
                kolom[1] = rs.getString("id_total_jual_garam");
                kolom[2] = rs.getString("total_jual_garam");
                kolom[3] = rs.getString("jual_garam");
                kolom[4] = rs.getString("t_total_jual_garam");
                dtm.addRow(kolom);
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;
}
    public DefaultTableModel getTabel_h_ramal(){
        String[] header = {"Pembungkusan Garam","Total Jual"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select pembungkusan_garam,total_jual from penjualan";
            ResultSet rs = kon.getResult(query);
            
            while (rs.next()) {
                String[] kolom = new String[2];
                kolom[0] = rs.getString("pembungkusan_garam");
                kolom[1] = rs.getString("total_jual");
                dtm.addRow(kolom);
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;
}

    public String[] getid_t_jual_garam_combo() {
        String[] id_t_jual_garam_combo = null;
            int x=0;
            try{
                Statement stm = kon.koneksi.createStatement();
                ResultSet rs = stm.executeQuery(" select id_total_jual_garam from total_jual_garam order by id_total_jual_garam desc limit 1");
                rs.last();
                int row = rs.getRow();
                rs.beforeFirst();
                id_t_jual_garam_combo = new String [row];
                while(rs.next()){
                    id_t_jual_garam_combo[x] = rs.getString("id_total_jual_garam");
                    x++;
                }
        } catch (SQLException ex) {
            Logger.getLogger(m_jual_garam.class.getName()).log(Level.SEVERE, null, ex);
        }
            return id_t_jual_garam_combo;
    }
    
    public String gett_jual_garam_tf(String id) throws SQLException {
        System.out.println(id);
        String t_jual_garam = null;
        try{
            Statement stm = kon.koneksi.createStatement();
            ResultSet rs = stm.executeQuery("select total_jual_garam from total_jual_garam where id_total_jual_garam= " + id + " ");
            rs.next();
            t_jual_garam = String.valueOf(rs.getInt("total_jual_garam"));
        }catch (SQLException ex) {
            Logger.getLogger(m_jual_garam.class.getName()).log(Level.SEVERE, null, ex);
        }
    return t_jual_garam;
    }

    public void insert(String id_t_jual_garam_combo, String t_jual_garam_tf, String jual_garam_tf, String t_t_jual_garam_tf) {
        try {
            String query="INSERT INTO `peramalan_garam_d`.`jual_garam` (`id_jual_garam`, `id_total_jual_garam`, `total_jual_garam`, `jual_garam`, `t_total_jual_garam`) "
                    + "VALUES (NULL, '" + id_t_jual_garam_combo + "', '" + t_jual_garam_tf + "', '" + jual_garam_tf + "', '" + t_t_jual_garam_tf + "');";
            kon.execute(query);
            
            String query1="INSERT INTO `peramalan_garam_d`.`total_jual_garam` (`id_total_jual_garam`, `total_jual_garam`) "
                    + "VALUES (NULL, '" + t_t_jual_garam_tf + "');";
            kon.execute(query1);
           
        } catch (SQLException e) {
            System.out.println(e);
            
        }
    }
}
