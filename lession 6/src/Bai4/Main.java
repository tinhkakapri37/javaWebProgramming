/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int[] arrRandom =new int[15];
        Random random= new Random();
        for(int i=0;i<arrRandom.length;i++)
        {
            arrRandom[i]= random.nextInt(1000);
        }
        System.out.println("mang vua tao:");
        for(int i=0;i<arrRandom.length;i++)
        {
            System.out.print(arrRandom[i]);
            System.out.print(" ");
        }
        for(int i=0;i<arrRandom.length-1;i++)
        {
            if(arrRandom[i]>arrRandom[i+1])
            {
                int temp;
                temp=arrRandom[i];
                arrRandom[i]=arrRandom[i+1];
                arrRandom[i+1]=temp;
            }
            
        }
        System.out.println("");
        System.out.println("mang tang dan");
        for(int i=0;i<arrRandom.length;i++)
        {
            System.out.print(arrRandom[i]);
            System.out.print(" ");
        }
        for(int i=0;i<arrRandom.length-1;i++)
        {
            if(arrRandom[i]<arrRandom[i+1])
            {
                int temp;
                temp=arrRandom[i];
                arrRandom[i]=arrRandom[i+1];
                arrRandom[i+1]=temp;
            }
        }
        System.out.println("");
        System.out.println("mang giam dan");
        for(int i=0;i<arrRandom.length;i++)
        {
            System.out.print(arrRandom[i]);
            System.out.print(" ");
        }
        int demChan=0;
        int demLe=0;
        for(int i=0;i<arrRandom.length;i++)
        {
            if(arrRandom[i]%2==0)
            {
                demChan++;
            }
            else demLe++;
        }
        System.out.println("so cac so chan :"+demChan);
        System.out.println("so cac so le :"+demLe);
    }

}
