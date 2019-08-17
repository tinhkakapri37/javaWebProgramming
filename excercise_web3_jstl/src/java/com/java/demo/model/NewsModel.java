/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.model;

import com.java.demo.db.DB_Connector;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL 5440
 */
public class NewsModel {

    public List<News> getNews() throws ClassNotFoundException, SQLException {
        DB_Connector db = new DB_Connector();
        db.getConnect();
        Connection conn = db.getConnect();
        PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM news");
        ResultSet rs = pstmt.executeQuery();
        List<News> list = new ArrayList<News>();
        while (rs.next()) {
            list.add(new News(rs.getInt(rs.getInt("id")), rs.getString("title"), rs.getString("content"), rs.getInt("author_id"), rs.getString("summary")));
           
        }
        return list;
    }
}
