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
public class m_total_jual_garam extends m_model{
    String query;
    
    public m_total_jual_garam() throws SQLException{
    super();
}
    public DefaultTableModel getTabel(){
        String[] header = {"Id Total Jual Garam", "Total Jual Garam"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from total_jual_garam";
            ResultSet rs = kon.getResult(query);
            
            while (rs.next()) {
                String[] kolom = new String[2];
                kolom[0] = rs.getString("id_total_jual_garam");
                kolom[1] = rs.getString("total_jual_garam");
                dtm.addRow(kolom);
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;
}
}
