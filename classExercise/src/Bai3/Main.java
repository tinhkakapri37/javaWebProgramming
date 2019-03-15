/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Aptech apt= new Aptech();
        apt.inputInfo();
        if(apt.hocBong()==true) System.out.println("DAT HOC BONG");
        else System.out.println("KHONG DAT HOC BONG");
    }
}
