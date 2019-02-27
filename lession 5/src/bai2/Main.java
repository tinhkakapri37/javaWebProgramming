/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] arr3 =new int[5];
        int max=0;
        int min=0;
        int j=0;
        Scanner input= new Scanner(System.in);
        for (int i=0;i<array.length;i++)
        {
            array[i]=input.nextInt();
            if(array[i]<max)
            {
                max=array[i];
                
            }else min=array[i];
            if(array[i]%3==0)
            {
                arr3[j]=array[i];
                j++;
            }
            
        }
        System.out.println("phần tử lớn nhất trong mảng:"+max);
        System.out.println("phần tử nho nhất trong mảng:"+min);
        System.out.println("tat cả các phần tử chia hết cho 3");
        for(int i=0;i<arr3.length;i++)
        {
            System.out.println(arr3[i]);
        }
    }
}
