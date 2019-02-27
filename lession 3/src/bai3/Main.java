/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        int n;
        System.out.println("nhap n :");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int j;
        int dem = 0;
        if (n < 2) {
            System.out.println("so n khong la so nguyen to");
        } else {
            for (j = 1; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    dem++;
                }
            }
            if (dem > 1) {
                System.out.println("so n khong phai la so nguyn to!!!");
            } else {
                System.out.println("so n la so nguyen to!!!");
            }

            int demN = 0;
            dem = 0;
            int i = 2;
            while (demN < n) {
                for (j = 1; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        dem++;
                    }
                }
                if (dem < 2) {
                    demN++;
                    System.out.print(i);
                }
                dem = 0;
                i++;

            }

        }

    }

}
