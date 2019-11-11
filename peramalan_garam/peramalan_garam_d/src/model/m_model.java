/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;

/**
 *
 * @author admin pc
 */
public abstract class m_model {
    m_koneksi kon;
    public m_model() throws SQLException{
        kon=new m_koneksi("peramalan_garam_d","root","");
    }
}
