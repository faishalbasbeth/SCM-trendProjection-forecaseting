/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.m_login;
import view.v_login;

/**
 *
 * @author admin pc
 */
public class c_login {
    v_login views;
    m_login users;
    
    public c_login() throws SQLException {
        views = new v_login();
        users = new m_login();
        views.setVisible(true);
        views.getlogin_btn().addActionListener(new kliklogin());
    }

    private  class kliklogin implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int userlevel = users.ok(views.getusername_tf(), views.getpassword_tf());
                if (userlevel == 1) {
                    new c_menu_manajer();
                    views.dispose();
                } else if (userlevel == 2) {
                    new c_menu_produksi();
                    views.dispose();
                            
                } else if (userlevel == 3) {
//                    new c_menup();
                    views.dispose();
                }    else {
                    JOptionPane.showMessageDialog(views, "Inputan Salah");
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
