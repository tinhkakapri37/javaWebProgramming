/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Student sv=new Student();
        sv.inputInfo();
        sv.showInfo();
        if(sv.hocBong()==true)
            System.out.println("*DUOC HOC BONG*");
        else System.out.println("K DUOC HOC BONG");
    }
}
