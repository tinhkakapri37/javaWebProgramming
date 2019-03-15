/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        rectangle rect= new rectangle();
        rect.inputAdge();
        System.out.println("chu vi cua r hình chữ nhật là :"+rect.perimeter());
        System.out.println("diện tích của hình chữ nhật là:"+rect.acreage());
    }
}
