/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

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

        int giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }
        System.out.println("giai thua cua n la :" + giaiThua);
    }
}
