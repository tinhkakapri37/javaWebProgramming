/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang2chieu_b1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int[] tongHang = new int[3];
        int[] tongCot= new int [3];
        Scanner input =new Scanner(System.in);
        for (int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j]=input.nextInt();
                
            }
        }
        System.out.println("in ra mang 2 chieu :");
        for (int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        for(int i=0;i<matrix.length;i++)
        {
            System.out.println("tong cua hang "+i+"la"+(matrix[i][0]+matrix[i][1]+matrix[i][2]));
        }
        for(int j=0;j<3;j++)
        {
            System.out.println("tong cua cot "+j+"la"+(matrix[0][j]+matrix[1][j]+matrix[2][j]));
        }
        
            
    
    }
}
