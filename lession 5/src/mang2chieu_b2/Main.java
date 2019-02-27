/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang2chieu_b2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] sum = new int[3][3];
        int [][] multiply= new int[3][3];
        Scanner input =new Scanner(System.in);
        for (int i=0;i<matrix1.length;i++)
        {
            for(int j=0;j<matrix1[0].length;j++)
            {
                matrix1[i][j]=input.nextInt();
                
            }
        }
        System.out.println("nhap vao matran2");
        for (int i=0;i<matrix2.length;i++)
        {
            for(int j=0;j<matrix2[0].length;j++)
            {
                matrix2[i][j]=input.nextInt();
                
            }
        }
                for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum[i][j]=matrix1[i][j]+matrix2[i][j] ;
            }
        }
                System.out.println("tong 2 ma tran");
        for (int i=0;i<sum.length;i++)
        {
            for(int j=0;j<sum[0].length;j++)
            {
                System.out.print(" "+sum[i][j]);
            }
            System.out.println("");
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++){
                    multiply[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
                
            }
        }
        System.out.println("tich 2 ma tran");
        for (int i=0;i<sum.length;i++)
        {
            for(int j=0;j<sum[0].length;j++)
            {
                System.out.print(" "+multiply[i][j]);
            }
            System.out.println("");
        }
        
         
    }
}
