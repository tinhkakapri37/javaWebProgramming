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
public class Mang {
    Scanner input= new Scanner(System.in);
    public int phanTu;
    public int[] giaTri;
    
    public Mang()
    {
        this.phanTu=5;
        this.giaTri= new int[5];
    }
    
    public Mang(int phanTu,int[] giaTri){
        this.phanTu=phanTu;
        this.giaTri=giaTri;
    }
    public int getPhanTu() {
        return phanTu;
    }
    public void setPhanTu(int phanTu) {

        this.phanTu = phanTu;
    }

    public int[] getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(int[] giaTri) {
        this.giaTri = giaTri;
    }
    public int sum(int sum)
    {
        sum=0;
        for(int i=0;i<this.phanTu;i++)
        {
            sum=sum+this.giaTri[i];
        }
        return sum;
    }
    public int sumLe(int sumLe)
    {
        sumLe=0;
        for(int i=0;i<this.phanTu;i++)
        {
            if(this.giaTri[i]%2!=0)
            {
                sumLe+=this.giaTri[i];
            }
        }
        return sumLe;
    }
    public int sumChan(int sumChan)
    {
        sumChan=0;
        for(int i=0;i<this.phanTu;i++)
        {
            if(this.giaTri[i]%2==0)
            {
                sumChan+=this.giaTri[i];
            }
        }
        return sumChan;
    }
    public int min(int min)
    {
        for (int i=0;i<this.phanTu;i++)
        {
            min=giaTri[0];
            if(this.giaTri[i]<min)
            {
                min=this.giaTri[i];
                
            }
        }
        return min;
    }
    public int max(int max)
    {
        for (int i=0;i<this.phanTu;i++)
        {
            max=giaTri[0];
            if(this.giaTri[i]>max)
            {
                max=this.giaTri[i];
                
            }
        }
        return max;
    }
        
}
