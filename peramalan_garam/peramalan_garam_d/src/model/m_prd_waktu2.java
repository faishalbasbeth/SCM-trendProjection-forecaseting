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
public class m_prd_waktu2 extends m_model{
    String query;
    
    public m_prd_waktu2() throws SQLException{
    super();
}
    public DefaultTableModel getTabel(){
        String[] header = {"Id Periode Waktu²", "Id Periode Waktu", "Periode Waktu", "Periode Waktu²", "Id Total Periode Waktu²", "Total Periode Waktu²", "T Total Periode Waktu²"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from prd_waktu2";
            ResultSet rs = kon.getResult(query);
            
            while (rs.next()) {
                String[] kolom = new String[7];
                kolom[0] = rs.getString("id_prd_waktu2");
                kolom[1] = rs.getString("id_prd_waktu");
                kolom[2] = rs.getString("prd_waktu");
                kolom[3] = rs.getString("prd_waktu2");
                kolom[4] = rs.getString("id_total_prd_waktu2");
                kolom[5] = rs.getString("total_prd_waktu2");
                kolom[6] = rs.getString("t_total_prd_waktu2");
                dtm.addRow(kolom);
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;
}

    public String[] getid_prd_waktu_combo() {
        String[] id_prd_waktu_combo = null;
            int x=0;
            try{
                Statement stm = kon.koneksi.createStatement();
                ResultSet rs = stm.executeQuery(" select id_prd_waktu from prd_waktu order by id_prd_waktu desc limit 1");
                rs.last();
                int row = rs.getRow();
                rs.beforeFirst();
                id_prd_waktu_combo = new String [row];
                while(rs.next()){
                    id_prd_waktu_combo[x] = rs.getString("id_prd_waktu");
                    x++;
                }
        } catch (SQLException ex) {
            Logger.getLogger(m_penjualan.class.getName()).log(Level.SEVERE, null, ex);
        }
            return id_prd_waktu_combo;
    }

    public String[] getid_t_prd_waktu2_combo() {
        String[] id_t_prd_waktu2_combo = null;
            int x=0;
            try{
                Statement stm = kon.koneksi.createStatement();
                ResultSet rs = stm.executeQuery(" select id_total_prd_waktu2 from total_prd_waktu2 order by id_total_prd_waktu2 desc limit 1");
                rs.last();
                int row = rs.getRow();
                rs.beforeFirst();
                id_t_prd_waktu2_combo = new String [row];
                while(rs.next()){
                    id_t_prd_waktu2_combo[x] = rs.getString("id_total_prd_waktu2");
                    x++;
                }
        } catch (SQLException ex) {
            Logger.getLogger(m_penjualan.class.getName()).log(Level.SEVERE, null, ex);
        }
            return id_t_prd_waktu2_combo;
    }

    public String getprd_waktu_tf(String id) throws SQLException{
        System.out.println(id);
        String prd_waktu_tf = null;
        try{
            Statement stm = kon.koneksi.createStatement();
            ResultSet rs = stm.executeQuery("select prd_waktu from prd_waktu where id_prd_waktu= " + id + " ");
            rs.next();
            prd_waktu_tf = String.valueOf(rs.getInt("prd_waktu"));
        }catch (SQLException ex) {
            Logger.getLogger(m_prd_waktu2.class.getName()).log(Level.SEVERE, null, ex);
        }
    return prd_waktu_tf;
    }

    public String gett_prd_waktu2_tf(String id) throws SQLException{
        System.out.println(id);
        String t_prd_waktu2_tf = null;
        try{
            Statement stm = kon.koneksi.createStatement();
            ResultSet rs = stm.executeQuery("select total_prd_waktu2 from total_prd_waktu2 where id_total_prd_waktu2= " + id + " ");
            rs.next();
            t_prd_waktu2_tf = String.valueOf(rs.getInt("total_prd_waktu2"));
        }catch (SQLException ex) {
            Logger.getLogger(m_prd_waktu2.class.getName()).log(Level.SEVERE, null, ex);
        }
    return t_prd_waktu2_tf;
    }

    public void insert(String id_prd_waktu_combo, String prd_waktu_tf, String prd_waktu2_tf, String id_t_prd_waktu2_combo, String t_prd_waktu2_tf, String t_t_prd_waktu2_tf) {
        try {
            String query="INSERT INTO `peramalan_garam_d`.`prd_waktu2` (`id_prd_waktu2`, `id_prd_waktu`, `prd_waktu`, `prd_waktu2`, `id_total_prd_waktu2`, `total_prd_waktu2`, `t_total_prd_waktu2`) "
                    + "VALUES (NULL, '" + id_prd_waktu_combo + "', '" + prd_waktu_tf + "', '" + prd_waktu2_tf + "', '" + id_t_prd_waktu2_combo + "', '" + t_prd_waktu2_tf + "', '" + t_t_prd_waktu2_tf + "');";
            kon.execute(query);
            
            String query1="INSERT INTO `peramalan_garam_d`.`total_prd_waktu2` (`id_total_prd_waktu2`, `total_prd_waktu2`) "
                    + "VALUES (NULL, '" + t_t_prd_waktu2_tf + "');";
            kon.execute(query1);
           
        } catch (SQLException e) {
            System.out.println(e);
            
        }
    }
}
