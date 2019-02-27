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
        int[] vecto1 = new int[3];
        int[] vecto2 = new int[3];
        int[] sum= new int [3];
        int tich;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("nhap vao vecto thu nhat");
        for(int i=0;i<vecto1.length;i++)
        {
            vecto1[i]=input.nextInt();
        }
        System.out.println("nhap vao vecto thu hai");
        for(int i=0;i<vecto2.length;i++)
        {
            vecto2[i]=input.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            sum[i]=vecto1[i]+vecto2[i];
        }
        System.out.println("tong 2 vecto la : ");
        for(int i=0;i<3;i++)
        {
            System.out.print(sum[i]);
            System.out.println(" ");
        }
            tich=vecto1[02]*vecto2[0]+vecto1[1]*vecto2[1]+vecto1[2]*vecto2[2];
        System.out.print("tich vo huong cua 2 vecto :"+tich);
    }
  
}
