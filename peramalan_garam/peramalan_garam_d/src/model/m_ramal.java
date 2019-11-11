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
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author admin pc
 */
public class m_ramal extends m_model{
    String query;
    public int[] getPie_real;
    
    public m_ramal() throws SQLException{
    super();
}
     public DefaultTableModel getTabel(){
        String[] header = {"Id Ramal", "Bulan", "Tahun", "Id Periode Waktu", "T Total Periode Waktu", "Periode Waktu", "Id Jual Garam"
                , "T Total Jual Garam", "Rata2 Periode Waktu", "Rata2 Jual Garam", "id XY", "T Total XY", "Id Periode Waktu²"
                , "T Total Periode Waktu²", "b", "a", "Hasil Ramalan"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from ramal";
            ResultSet rs = kon.getResult(query);
            
            while (rs.next()) {
                String[] kolom = new String[17];
                kolom[0] = rs.getString("id_ramal");
                kolom[1] = rs.getString("bulan");
                kolom[2] = rs.getString("tahun");
                kolom[3] = rs.getString("id_prd_waktu");
                kolom[4] = rs.getString("t_total_prd_waktu");
                kolom[5] = rs.getString("prd_waktu");
                kolom[6] = rs.getString("id_jual_garam");
                kolom[7] = rs.getString("t_total_jual_garam");
                kolom[8] = rs.getString("rata_prd_waktu");
                kolom[9] = rs.getString("rata_jual_garam");
                kolom[10] = rs.getString("id_xy");
                kolom[11] = rs.getString("t_total_xy");
                kolom[12] = rs.getString("id_prd_waktu2");
                kolom[13] = rs.getString("t_total_prd_waktu2");
                kolom[14] = rs.getString("b");
                kolom[15] = rs.getString("a");
                kolom[16] = rs.getString("hasil_ramalan");
                
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
            Logger.getLogger(m_ramal.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(m_ramal.class.getName()).log(Level.SEVERE, null, ex);
        }
            return id_jual_garam_combo;
    }

    public String[] getid_xy_combo() {
        String[] id_xy_combo = null;
            int x=0;
            try{
                Statement stm = kon.koneksi.createStatement();
                ResultSet rs = stm.executeQuery(" select id_xy from xy order by id_xy desc limit 1");
                rs.last();
                int row = rs.getRow();
                rs.beforeFirst();
                id_xy_combo = new String [row];
                while(rs.next()){
                    id_xy_combo[x] = rs.getString("id_xy");
                    x++;
                }
        } catch (SQLException ex) {
            Logger.getLogger(m_ramal.class.getName()).log(Level.SEVERE, null, ex);
        }
            return id_xy_combo;
    }

    public String[] getid_prd_waktu2_combo() {
        String[] id_prd_waktu2_combo = null;
            int x=0;
            try{
                Statement stm = kon.koneksi.createStatement();
                ResultSet rs = stm.executeQuery(" select id_prd_waktu2 from prd_waktu2 order by id_prd_waktu2 desc limit 1");
                rs.last();
                int row = rs.getRow();
                rs.beforeFirst();
                id_prd_waktu2_combo = new String [row];
                while(rs.next()){
                    id_prd_waktu2_combo[x] = rs.getString("id_prd_waktu2");
                    x++;
                }
        } catch (SQLException ex) {
            Logger.getLogger(m_ramal.class.getName()).log(Level.SEVERE, null, ex);
        }
            return id_prd_waktu2_combo;
    }

    public String gett_t_prd_waktu_tf(String id) throws SQLException{
        System.out.println(id);
        String t_t_prd_waktu_tf = null;
        try{
            Statement stm = kon.koneksi.createStatement();
            ResultSet rs = stm.executeQuery("select t_total_prd_waktu from prd_waktu where id_prd_waktu= " + id + " ");
            rs.next();
            t_t_prd_waktu_tf = String.valueOf(rs.getInt("t_total_prd_waktu"));
        }catch (SQLException ex) {
            Logger.getLogger(m_ramal.class.getName()).log(Level.SEVERE, null, ex);
        }
    return t_t_prd_waktu_tf;
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
            Logger.getLogger(m_ramal.class.getName()).log(Level.SEVERE, null, ex);
        }
    return prd_waktu_tf;
    }

    public String gett_t_jual_garam_tf(String id) throws SQLException{
        System.out.println(id);
        String t_t_jual_garam_tf = null;
        try{
            Statement stm = kon.koneksi.createStatement();
            ResultSet rs = stm.executeQuery("select t_total_jual_garam from jual_garam where id_jual_garam= " + id + " ");
            rs.next();
            t_t_jual_garam_tf = String.valueOf(rs.getInt("t_total_jual_garam"));
        }catch (SQLException ex) {
            Logger.getLogger(m_ramal.class.getName()).log(Level.SEVERE, null, ex);
        }
    return t_t_jual_garam_tf;
    }

    public String gett_t_xy_tf(String id) throws SQLException{
        System.out.println(id);
        String t_t_xy_tf = null;
        try{
            Statement stm = kon.koneksi.createStatement();
            ResultSet rs = stm.executeQuery("select t_total_xy from xy where id_xy= " + id + " ");
            rs.next();
            t_t_xy_tf = String.valueOf(rs.getInt("t_total_xy"));
        }catch (SQLException ex) {
            Logger.getLogger(m_ramal.class.getName()).log(Level.SEVERE, null, ex);
        }
    return t_t_xy_tf;
    }

    public String gett_t_prd_waktu2_tf(String id) throws SQLException{
        System.out.println(id);
        String t_t_prd_waktu2_tf = null;
        try{
            Statement stm = kon.koneksi.createStatement();
            ResultSet rs = stm.executeQuery("select t_total_prd_waktu2 from prd_waktu2 where id_prd_waktu2= " + id + " ");
            rs.next();
            t_t_prd_waktu2_tf = String.valueOf(rs.getInt("t_total_prd_waktu2"));
        }catch (SQLException ex) {
            Logger.getLogger(m_ramal.class.getName()).log(Level.SEVERE, null, ex);
        }
    return t_t_prd_waktu2_tf;
    }

    public void insert(String id_ramal_tf, String bulan_combo, String tahun_tf, String id_prd_waktu_combo, String t_t_prd_waktu_tf, String prd_waktu_tf, String id_jual_garam_combo, String t_t_jual_garam_tf, String rata_prd_waktu_tf, String rata_jual_garam_tf, String id_xy_combo, String t_t_xy_tf, String id_prd_waktu2_combo, String t_t_prd_waktu2_tf, String b_tf, String a_tf, String hasil_ramalan_tf) {
        try {
            String query="INSERT INTO `peramalan_garam_d`.`ramal` (`id_ramal`, `bulan`, `tahun`, `id_prd_waktu`, `t_total_prd_waktu`, `prd_waktu`, `id_jual_garam`, `t_total_jual_garam`, `rata_prd_waktu`, `rata_jual_garam`, `id_xy`, `t_total_xy`, `id_prd_waktu2`, `t_total_prd_waktu2`, `b`, `a`, `hasil_ramalan`) "
                    + "VALUES (NULL, '" + bulan_combo + "', '" + tahun_tf + "', '" + id_prd_waktu_combo + "', '" + t_t_prd_waktu_tf + "', '" + prd_waktu_tf + "', '" + id_jual_garam_combo + "', '" + t_t_jual_garam_tf + "', '" + rata_prd_waktu_tf + "', '" + rata_jual_garam_tf + "', '" + id_xy_combo + "', '" + t_t_xy_tf + "', '" + id_prd_waktu2_combo + "', '" + t_t_prd_waktu2_tf + "', '" + b_tf + "', '" + a_tf + "', '" + hasil_ramalan_tf + "');";
            kon.execute(query);
            
        } catch (SQLException e) {
            System.out.println(e);
            
        }
    }
    
    public  int[] getPie(){
        int[] a = null;
        int x = 0;
        
        try {
            Statement stm = kon.koneksi.createStatement();
            ResultSet rs = stm.executeQuery("select hasil_ramalan from ramal");
            rs.last();
            int row = rs.getRow();
            rs.beforeFirst();
            a = new int [row];
            while(rs.next()){
                    a[x] = rs.getInt("hasil_ramalan");
                    x++;
                }
        } catch (SQLException ex) {
            Logger.getLogger(m_ramal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return a;
    }
    
    public String[] getBulan(){
        String[] bulan = null;
        int x = 0;
       
        try {
            Statement stm = kon.koneksi.createStatement();
            ResultSet rs = stm.executeQuery("select bulan from ramal");
            rs.last();
            int row = rs.getRow();
            rs.beforeFirst();
            bulan = new String [row];
            while(rs.next()){
                    bulan[x] = rs.getString("bulan");
                    x++;
                }
        } catch (SQLException ex) {
            Logger.getLogger(m_ramal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return bulan;
}

    public int[] getPie_real() {
        int[] b = null;
        int x = 0;
        
        try {
            Statement stm = kon.koneksi.createStatement();
            ResultSet rs = stm.executeQuery("select total_jual from penjualan");
            rs.last();
            int row = rs.getRow();
            rs.beforeFirst();
            b = new int [row];
            while(rs.next()){
                    b[x] = rs.getInt("total_jual");
                    x++;
                }
        } catch (SQLException ex) {
            Logger.getLogger(m_ramal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return b;
    }

}
