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
public class ResultExam {

    Connection conn;

    public ResultExam() throws ClassNotFoundException, SQLException {
        Connector connector = new Connector();
        this.conn = connector.getConnect();

    }

    public void saveResult(int studenID, int questionID, String answer) throws SQLException {
        String query = "INSERT INTO `quizonline`.`student_question` (`student_id`, `question_id`, `answer`) VALUES (?, ?, ?)";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setInt(1, studenID);
        pstmt.setInt(2, questionID);
        pstmt.setString(3, "answer");

        ResultSet rs = pstmt.executeQuery();
        
    }
}
