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
        System.out.println("nhap chieu dai m=");
        Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        System.out.println("nhap chieu rong n=");
        int n=input.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0||i==n-1)
                System.out.print("*");
                else if(j==0||j==m-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }    
        

        
    }
}
