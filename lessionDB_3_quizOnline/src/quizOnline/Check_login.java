/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizOnline;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class Check_login{
    Connection conn;
    public Check_login() throws ClassNotFoundException, SQLException{
      Connector connector = new Connector();
      this.conn = connector.getConnect();  
    }
    public boolean login(String email, String pass) throws SQLException{
        String query = "SELECT * FROM student where email=? and pass=? ";
        PreparedStatement pstmt= this.conn.prepareStatement(query);
        pstmt.setString(1, email);
        pstmt.setString(2, pass);
        
        ResultSet rs= pstmt.executeQuery();
        return rs.next();
    }
}
