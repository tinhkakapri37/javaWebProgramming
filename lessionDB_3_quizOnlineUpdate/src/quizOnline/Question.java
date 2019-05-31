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
public class Question {

    public int id;
    public String content;
    public String answer_a;
    public String answer_b;
    public String answer_c;
    public String answer_d;
    public String correct;

    public Question() {
    }

    public Question(int id, String content, String answer_a, String answer_b, String answer_c, String answer_d) {
        this.id = id;
        this.content = content;
        this.answer_a = answer_a;
        this.answer_b = answer_b;
        this.answer_c = answer_c;
        this.answer_d = answer_d;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswer_a() {
        return answer_a;
    }

    public void setAnswer_a(String answer_a) {
        this.answer_a = answer_a;
    }

    public String getAnswer_b() {
        return answer_b;
    }

    public void setAnswer_b(String answer_b) {
        this.answer_b = answer_b;
    }

    public String getAnswer_c() {
        return answer_c;
    }

    public void setAnswer_c(String answer_c) {
        this.answer_c = answer_c;
    }

    public String getAnswer_d() {
        return answer_d;
    }

    public void setAnswer_d(String answer_d) {
        this.answer_d = answer_d;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "Question{" + "id=" + id + ", content=" + content + ", answer_a=" + answer_a + ", answer_b=" + answer_b + ", answer_c=" + answer_c + ", answer_d=" + answer_d + ", correct=" + correct + '}';
    }
    

}
