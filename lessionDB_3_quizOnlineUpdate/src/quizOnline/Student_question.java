/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizOnline;

/**
 *
 * @author Admin
 */
public class Student_question {

    public int student_id;
    public int question_id;
    public String answwer;

    public Student_question() {
    }

    public Student_question(int student_id, int question_id, String answwer) {
        this.student_id = student_id;
        this.question_id = question_id;
        this.answwer = answwer;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getAnswwer() {
        return answwer;
    }

    public void setAnswwer(String answwer) {
        this.answwer = answwer;
    }

}
