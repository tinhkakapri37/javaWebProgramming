/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien {

    Scanner input = new Scanner(System.in);
    public String name;
    public int old;
    public String add;
    public double money;
    public int time;

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void inputInfo() {
        System.out.println("nhap vao ten nhan vien: ");
        this.name = input.nextLine();
        System.out.println("nhap tuoi cua nhan vien");
        this.old = input.nextInt();
        System.out.println("nhap dia chi cua nhan vien:");
        this.add = input.next();
        System.out.println("nhap tien luong cua nhan vien:");
        this.money = input.nextDouble();
        System.out.println("nhap vao so gio lam viec :");
        this.time = input.nextInt();

    }

    public void printInfo() {
        System.out.println("in ra thong tin nhan vien: ");
        System.out.println("ten nhan vien" + this.name);
        System.out.println("tuoi cua nhan vien" + this.old);
        System.out.println("dia chi cua nhan vien" + this.add);
        System.out.println("tien luong cua nhan vien" + this.money);
        System.out.println("so gio lafm viec cua nhan vien" + this.time);

    }

    public double tinhThuong(double tienThuong) {
        if (this.time >= 200) {
            tienThuong = this.money * 20.0 / 100;

        } else if (this.time < 100) {
            tienThuong = 0;
        } else {
            tienThuong = this.money * 10.0 / 100;
        }
        return tienThuong;
    }

}
