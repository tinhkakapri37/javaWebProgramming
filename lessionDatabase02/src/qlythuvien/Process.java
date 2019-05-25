/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlythuvien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class Process {
    public ResultSet ex6(String bookName,String date) throws ClassNotFoundException, SQLException{
        DBconnector dbConnector =new DBconnector();
        Connection conn=dbConnector.getconnect();
        String sql = "select d.ten from PHIEUMUON p " +
                    "join SACH s on s.masach = p.masach " +
                    "join DOCGIA d on d.sothe = p.sothe " +
                    "where s.ten = ? and p.ngaymuon = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, bookName);
        pstmt.setString(2, date);
        
        return pstmt.executeQuery();
    }
}
