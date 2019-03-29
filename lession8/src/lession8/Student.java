/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession8;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student extends Person{
    private String email;

    public Student(String email, int id, String name) {
        super(id, name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void input() {
        super.input(); 
        System.out.println("email :");
        Scanner input= new Scanner(System.in);
        
        this.email=input.nextLine();
    }
    
}
