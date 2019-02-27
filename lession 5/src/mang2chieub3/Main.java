/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang2chieub3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextInt();

            }
        }
        boolean flag = true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] == 1) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag = true) {
            System.out.println("ma tran la ma tran don vi");
        } else {
            System.out.println("na tran k phai la ma tran don vi");
        }
        int count = 0;
        flag = true;
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 4; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    flag = false;
                    break;
                }
                count++;
            }

        }
        System.out.println("số lần lặp" + count);
    }

}
