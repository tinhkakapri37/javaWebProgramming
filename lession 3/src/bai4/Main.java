/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        int max = 0;
        for (int i = 0; i < 500; i++) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            if (n > max) {
                max = n;
            }
            if (n == 0) {
                break;
            }

        }
        System.out.println("so lon nhat la : " + max);
    }
}
