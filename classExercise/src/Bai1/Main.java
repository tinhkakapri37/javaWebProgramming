/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        NhanVien nv= new NhanVien();
        nv.inputInfo();
        nv.printInfo();
        System.out.println("so tien thuong :"+nv.tinhThuong(0));
    }
}
