/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import bai1.Mang;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int[] array1 ={1,2,3,4,5};
        Mang a= new Mang(5,array1);
        int max=a.max(0);
        int min=a.min(0);
     System.out.println("phần tử lớn nhất trong mảng:"+max);
     System.out.println("phần tử nho nhất trong mảng:"+min);   
    }
}
