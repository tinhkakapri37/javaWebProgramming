/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        int a, b, c;
        double x1, x2;
        Scanner input = new Scanner(System.in);
        System.out.print("nhap lan luot cac he so a,b,c :");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        double denta = b ^ b - 4 * a * c;

        if (denta < 0) {
            System.out.println("phuong trinh vo nghiem");
        } else if (denta == 0) {
            System.out.println("phuong trinh co nghiem kep");
            System.out.println("x1=x2= " + -b / (2 * a));

        } else {
            System.out.println("phuong trinh co 2 nghiem phan biet");
            System.out.println("x1= " + ((-b - sqrt(denta)) / (2 * a)));
            System.out.println("x1= " + (-b + sqrt(denta)) / (2 * a));
        }

    }
}
