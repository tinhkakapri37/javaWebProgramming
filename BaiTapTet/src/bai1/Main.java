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
    public static void docChuSo(int chuSo)
        {
            switch(chuSo)
            {
                case 0:System.out.println("không");
                break;
                case 1:System.out.println("một");
                break;
                case 2:System.out.println("hai");
                break;
                case 3:System.out.println("ba");
                break;
                case 4:System.out.println("bốn");
                break;
                case 5:System.out.println("năm");
                break;
                case 6:System.out.println("sáu");
                break;
                case 7:System.out.println("bảy");
                break;
                case 8:System.out.println("tám");
                break;
                case 9:System.out.println("chín");
                break;

            }
        }
    public static int demSoLuongChuSo(int n)
    {
        int dem=0;
        while(n!=0)
        {
            n=n/10;
            dem++;
        }   
        return dem;
    }
    public static void docSo(int n)
    {
        int soDao=0;
        while(n!=0){
        soDao=soDao*10+n%10;
        n=n/10;
        }
        int soLuong=demSoLuongChuSo(soDao);
        while(soDao!=0)
        {
            docChuSo(soDao%10);
            switch (soLuong) {
                case 4:
                    System.out.print("ngàn");
                    break;
                case 3:
                    System.out.print("tram");
                    break;
                case 2:
                    System.out.print("muoi");
                    break;
                default:
                    break;
            }
            soLuong--;
            soDao/=10;
            
            
        }
    }
public static void main(String[] args) {
        System.out.println("nhap so 2 chu so: ");
        Scanner input = new Scanner(System.in);
        int number=input.nextInt();
        docSo(number);
    }
}
