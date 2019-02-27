/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        int sum=0;
        int sumL=0;
        int sumC=0;
        Scanner input= new Scanner(System.in);
        for (int i=0;i<array.length;i++)
        {
            array[i]=input.nextInt();
            sum+=array[i];
            if(array[i]%2==0)
            {
                sumC+=array[i];
            }
            else sumL+=array[i];
            
        }
        System.out.println("mang vua nhap!!");
        for (int i=0;i<array.length;i++)
        {
            System.out.print(array[i]);
            
        }
        System.out.println("tong cac phan tử trong mảng :"+sum);
        System.out.println("tong cac phan tử lẻ trong mảng :"+sumL);
        System.out.println("tong cac phan tử chắn trong mảng :"+sumC);
    }
            
}
