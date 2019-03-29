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
public class StudentManager extends Manager{
    private static final int max=20;
    public StudentManager(){
        this.list=new Student[max];
    }

    

    @Override
    public void add() {
        throw new UnsupportedOperationException("Not supported yet.");
        Student s= new Student();
        s.input();
        this.list[this.curr]=s;
        this.curr++;
    }

    @Override
    public void show() {
        
    }

    @Override
    public void search(String name) {
        for(int i=0;i<this.list.length;i++){
            if()
        }
    }
    
    
}
