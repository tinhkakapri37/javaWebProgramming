/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int[] array1 ={1,2,3,4,5};
        Mang a= new Mang(5,array1);
       int tong=a.sum(0);
        System.out.println("tổng ="+tong);
        int tongChan=a.sumChan(tong);
        int tongLe=a.sumLe(tong);
        System.out.println("tổng chan ="+tongChan);
        System.out.println("tong le ="+tongLe);
        
    }

}
