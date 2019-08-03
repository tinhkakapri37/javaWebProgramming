/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DELL 5440
 */
public class DB_connect {
    public Connection getConnect() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        String constr="jdbc:mysql://localhost:3306/student_manager?autoReconnect=true&useSSL=false";
        Connection conn=DriverManager.getConnection(constr, "root", "root");
        return conn;
        
    }
    
}
