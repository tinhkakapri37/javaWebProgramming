/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Date;


/**
 *
 * @author Guest
 */
public class Student {
    private String rollnumber;
    private String name;
    private Date dob;
    private  String email;

    public Student() {
    }

    public Student(String rollnumber, String name, Date dob, String email) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    public String getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(String rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
