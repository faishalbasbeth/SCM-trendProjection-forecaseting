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
public class m_xy extends m_model{
    String query;
    
    public m_xy() throws SQLException{
    super();
}
    public DefaultTableModel getTabel(){
        String[] header = {"Id XY", "Id Periode Waktu", "Periode Waktu", "Id Jual Garam", "Jual Garam", "XY", "Id Total XY", "Total XY", "T Total XY"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from xy";
            ResultSet rs = kon.getResult(query);
            
            while (rs.next()) {
                String[] kolom = new String[9];
                kolom[0] = rs.getString("id_xy");
                kolom[1] = rs.getString("id_prd_waktu");
                kolom[2] = rs.getString("prd_waktu");
                kolom[3] = rs.getString("id_jual_garam");
                kolom[4] = rs.getString("jual_garam");
                kolom[5] = rs.getString("xy");
                kolom[6] = rs.getString("id_total_xy");
                kolom[7] = rs.getString("total_xy");
                kolom[8] = rs.getString("t_total_xy");
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
            Logger.getLogger(m_xy.class.getName()).log(Level.SEVERE, null, ex);
        }
            return id_prd_waktu_combo;
    }

    public String[] getid_jual_garam_combo() {
        String[] id_jual_garam_combo = null;
            int x=0;
            try{
                Statement stm = kon.koneksi.createStatement();
                ResultSet rs = stm.executeQuery(" select id_jual_garam from jual_garam order by id_jual_garam desc limit 1");
                rs.last();
                int row = rs.getRow();
                rs.beforeFirst();
                id_jual_garam_combo = new String [row];
                while(rs.next()){
                    id_jual_garam_combo[x] = rs.getString("id_jual_garam");
                    x++;
                }
        } catch (SQLException ex) {
            Logger.getLogger(m_xy.class.getName()).log(Level.SEVERE, null, ex);
        }
            return id_jual_garam_combo;
    }

    public String[] getid_t_xy_combo() {
        String[] id_t_xy_combo = null;
            int x=0;
            try{
                Statement stm = kon.koneksi.createStatement();
                ResultSet rs = stm.executeQuery(" select id_total_xy from total_xy order by id_total_xy desc limit 1");
                rs.last();
                int row = rs.getRow();
                rs.beforeFirst();
                id_t_xy_combo = new String [row];
                while(rs.next()){
                    id_t_xy_combo[x] = rs.getString("id_total_xy");
                    x++;
                }
        } catch (SQLException ex) {
            Logger.getLogger(m_xy.class.getName()).log(Level.SEVERE, null, ex);
        }
            return id_t_xy_combo;
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
            Logger.getLogger(m_xy.class.getName()).log(Level.SEVERE, null, ex);
        }
    return prd_waktu_tf;
    }

    public String getjual_garam_tf(String id) throws SQLException{
        System.out.println(id);
        String jual_garam_tf = null;
        try{
            Statement stm = kon.koneksi.createStatement();
            ResultSet rs = stm.executeQuery("select jual_garam from jual_garam where id_jual_garam= " + id + " ");
            rs.next();
            jual_garam_tf = String.valueOf(rs.getInt("jual_garam"));
        }catch (SQLException ex) {
            Logger.getLogger(m_xy.class.getName()).log(Level.SEVERE, null, ex);
        }
    return jual_garam_tf;
    }

    public String gett_xy_tf(String id) throws SQLException{
        System.out.println(id);
        String t_xy_tf = null;
        try{
            Statement stm = kon.koneksi.createStatement();
            ResultSet rs = stm.executeQuery("select total_xy from total_xy where id_total_xy= " + id + " ");
            rs.next();
            t_xy_tf = String.valueOf(rs.getInt("total_xy"));
        }catch (SQLException ex) {
            Logger.getLogger(m_xy.class.getName()).log(Level.SEVERE, null, ex);
        }
    return t_xy_tf;
    }

    public void insert(String id_prd_waktu_combo, String prd_waktu_tf, String id_jual_garam_combo, String jual_garam_tf, String xy_tf, String id_t_xy_combo, String t_xy_tf, String t_t_xy_tf) {
        try {
            String query="INSERT INTO `peramalan_garam_d`.`xy` (`id_xy`, `id_prd_waktu`, `prd_waktu`, `id_jual_garam`, `jual_garam`, `xy`, `id_total_xy`, `total_xy`, `t_total_xy`) "
                    + "VALUES (NULL, '" + id_prd_waktu_combo + "', '" + prd_waktu_tf + "', '" + id_jual_garam_combo + "', '" + jual_garam_tf + "', '" + xy_tf + "', '" + id_t_xy_combo + "', '" + t_xy_tf + "', '" + t_t_xy_tf + "');";
            kon.execute(query);
            
            String query1="INSERT INTO `peramalan_garam_d`.`total_xy` (`id_total_xy`, `total_xy`) "
                    + "VALUES (NULL, '" + t_t_xy_tf + "');";
            kon.execute(query1);
           
        } catch (SQLException e) {
            System.out.println(e);
            
        }
    }
}
