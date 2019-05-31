/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizOnline;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class questionExam {

    Connection conn;

    public questionExam() throws ClassNotFoundException, SQLException {
        Connector connector = new Connector();
        this.conn = connector.getConnect();

    }

    public void exam(int id) throws SQLException {
        String query = "select id,content,answer_A,answer_B,answer_C,answer_D from question where id=?";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setInt(1, id);

        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("id"));
            System.out.println(rs.getString("content"));
            System.out.println(rs.getString("answer_a"));
            System.out.println(rs.getString("answer_b"));
            System.out.println(rs.getString("answer_c"));
            System.out.println(rs.getString("answer_d"));

        }

    }

    public String result(int id) throws SQLException {
        String correct = "a";
        String query = "SELECT correct FROM question where id=?";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setInt(1, id);

        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            correct = rs.getString("correct");
        }
        return correct;

    }
}
