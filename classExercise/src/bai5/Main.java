/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        triangle tri= new triangle();
        tri.inputAdge();
        if(tri.checkIsosceles()&&tri.checkRightTriangle())System.out.println("là tam giác vuong cân");
        else if(tri.checkIsosceles())System.out.println("là tam giac cân");
        else if(tri.checkRightTriangle())System.out.println("là tam giac vuông");
        else System.out.println("la tam giac thuong");
        System.out.println("chui vi của tam giác :"+tri.perimeter());
        System.out.println("diện tích của tam giác :"+tri.acreage());
        
    }
}
