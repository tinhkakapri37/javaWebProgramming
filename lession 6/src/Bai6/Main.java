/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import Bai8.Matrix;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[][] m1valul= new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                m1valul[i][j]=input.nextInt();
            }
        }
        
        Matrix m1 =new Matrix(3,3,m1valul);
        
        m1.tongHang();
        m1.tongCot();
        
     }
}
