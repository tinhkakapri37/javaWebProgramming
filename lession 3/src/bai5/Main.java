/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

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
        double sum1 = 0;
        for (int i = 1; i <= n; i++) {
            sum1 += 1 / i;
        }
        System.out.println("1.tong= " + sum1);
        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            sum2 += i;
        }
        System.out.println("2.tong= " + sum2);
        int sum3 = 0;
        for (int i = 1; i <= n; i++) {
            sum3 += i * i;
        }
        System.out.println("3.tong= " + sum3);
        int sum4 = 0;
        for (int i = 1; i <= n; i++) {
            sum4 += 1 / (2 * i);
        }
        System.out.println("4.tong= " + sum4);
        int sum5 = 0;
        for (int i = 1; i <= n; i++) {
            sum5 += 1 / (2 * i + 1);
        }
        System.out.println("5.tong= " + sum5);
        int sum6 = 0;
        for (int i = 1; i <= n; i++) {
            sum6 += 1 / (i * (i + 1));
        }
        System.out.println("6.tong= " + sum6);
        int sum7 = 0;
        for (int i = 1; i <= n; i++) {
            sum7 += (2 * i + 1) * (2 * i + 2);
        }
        System.out.println("7.tong= " + sum7);
        int sum8 = 0;
        int giaithua = 1;
        for (int i = 1; i <= n; i++) {
            giaithua *= i;
            sum8 += giaithua;
        }
        System.out.println("8.tong= " + sum8);
        System.out.println("nhap x :");
        Scanner nhapx = new Scanner(System.in);
        int x = nhapx.nextInt();
        int sum9 = 0;
        for (int i = 1; i <= n; i++) {
            sum9 += Math.pow(x, n);
        }
        System.out.println("9.tong(x,n)= " + sum9);
        int sum10 = 0;
        for (int i = 1; i <= n; i++) {
            sum10 += Math.pow(x, 2 * n);
        }
        System.out.println("10.tong(x,n)= " + sum10);
        int sum11 = 0;
        for (int i = 1; i <= n; i++) {
            sum11 += Math.pow(x, 2 * n + 1);
        }
        System.out.println("11.tong(x,n)= " + sum11);
        int sum12 = 0;
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i;
            sum12 += 1 / tong;
        }
        System.out.println("12.tong(n)= " + sum12);

    }
}
