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
public class Aptech {
    public boolean hdse;
    public double mark;
    public boolean rule;
    public boolean test;

    public boolean isHdse() {
        return hdse;
    }

    public void setHdse(boolean hdse) {
        this.hdse = hdse;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public boolean isRule() {
        return rule;
    }

    public void setRule(boolean rule) {
        this.rule = rule;
    }

    public boolean isTest() {
        return test;
    }

    public void setTest(boolean test) {
        this.test = test;
    }
    Scanner input = new Scanner(System.in);
    
    public void inputInfo()
    {
        System.out.println("la hoc vien dang ki khoa hoc HDSE(true or false) ");
        this.hdse=input.nextBoolean();
        System.out.println("diem tong ket:");
        this.mark=input.nextDouble();
        System.out.println("vi pham nooi quy cua trung tam (true or false):");
        this.rule=input.nextBoolean();
        System.out.println("cac ki thi chi thi lan dau tien (true or false)");
        this.test=input.nextBoolean();
    }
    public boolean hocBong()
    {
        boolean flag=false;
        if(this.hdse==true&&this.rule==false&&this.test==true&&this.mark>=7.5)
        {
            flag=true;
        }
        return flag;
    }
}
