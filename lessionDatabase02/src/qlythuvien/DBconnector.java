/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlythuvien;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DBconnector {
    public Connection getconnect() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        String conStr="jdbc:mysql://localhost:3306/qlythuvien";
        Connection conn=DriverManager.getConnection(conStr,"root","root");
        return conn;
    }
}
