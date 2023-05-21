/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kkp.sipenalek;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Dell
 */

public class DBConnection {
    public Connection con;
    public Statement stm;
    public ResultSet rs;
    
    public void config(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sipenalek", "root", "");
            stm = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Failed "+e.getMessage());
        }
    }

    public void closeConnection(){
        try {
            if(!stm.isClosed())
                stm.close();
            if(!con.isClosed())
                con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Failed "+e.getMessage());
        }
    }
}
