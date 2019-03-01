/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner input= new Scanner(System.in);
        for (int i=0;i<array.length;i++)
        {
            array[i]=input.nextInt();
            
        }
        System.out.println("nhap so nguyen a: ");
        int a=input.nextInt();
        
        for(int i=0;i<array.length;i++)
        {
           if(array[i]==a) 
           {
               System.out.println("vi tri cua a :"+i);
           }
        }
    }

}
