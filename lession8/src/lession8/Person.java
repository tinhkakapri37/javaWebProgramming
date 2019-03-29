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
public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void input(){
        Scanner input= new Scanner(System.in);
        System.out.println("Nhập tên : ");
        this.name=input.nextLine();
        System.out.println("Nhập id: ");
        this.id=input.nextInt();
    }
}
