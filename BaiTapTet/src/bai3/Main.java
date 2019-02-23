/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        int menhGia5 = 500000;
        int menhGia2=200000;
        int menhGia1=100000;
        
        int soTo5 = 3000000 / menhGia5;
        int soTo2;
        int soTo1 =200000/menhGia1;
        for (int i = soTo5; i>0; i--) {
            System.out.print(+i+"to"+menhGia5);
            soTo2=(soTo5-i)*menhGia5/menhGia2;
            System.out.print("va"+soTo2+"to"+menhGia2);
            soTo1=((soTo5-i)*menhGia5%menhGia2)/menhGia1;
            System.out.print("va"+soTo1+"to"+menhGia1);
            System.out.println("");
       }
        soTo2 =3000000/menhGia2;
        for (int i=soTo2;i>0;i--)
            {
                System.out.print(+i+"to"+menhGia2);  
                soTo1=((soTo2-i)*menhGia2)/menhGia1;
                System.out.println("va"+soTo1+"to"+menhGia1);
            }
        soTo1=3000000/menhGia1;
        System.out.println(+soTo1+"to"+menhGia1);
    }

}
