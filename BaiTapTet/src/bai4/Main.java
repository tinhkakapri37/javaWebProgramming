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
        System.out.println("nhap chieu cao h= ");
        Scanner input = new Scanner(System.in);
        int h=input.nextInt();
        for(int i=1;i<=h;i++)
        {
            for(int j=1;j<=h-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=(h-i);k<(h+i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1;i<=h;i++)
        {
            for(int j=1;j<=h-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=(h-i);k<(h+i-1);k++)
            {
                if(i==1||i==h)
                    System.out.print("*");
                else if(k==h-i||k==h+i-2)
                System.out.print("*");
                else System.out.print(" ");
            }
            
            System.out.println("");
        }

        
    }
}
