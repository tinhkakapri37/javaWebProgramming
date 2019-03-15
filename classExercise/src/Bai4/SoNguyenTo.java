/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SoNguyenTo {
    public int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    Scanner input= new Scanner(System.in);
    
    public boolean isSoNguyenTo(int x)
    {
        boolean flag=true;
        for(int i=2;i<=Math.sqrt(x);i++)
        {
            if(x%i==0)
            {
                flag=false;
                break;
            }
        }
        return flag;
    }
    public int SoNguyenTo()
    {
        System.out.println("nhap so nguyen X:");
       int  x=input.nextInt();

        if(isSoNguyenTo(x)==true)
        {
            this.a=x;
        }
        else System.out.println("X khong phai la so nguyen to, khong luu tru");
        return this.a;
    }
    public int timsoNguyenToTiepTheo()
    {
       int  i=a+1;
        while (isSoNguyenTo(i)==false)
        {
            i++;
        }
        return i;
        
    }
    public void printA()
    {
        System.out.println("so nguyen to A la:"+this.a);
    }


}
