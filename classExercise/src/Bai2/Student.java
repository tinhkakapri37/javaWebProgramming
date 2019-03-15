/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student {
    public String stdNumber;
    public double mark;
    public int old;
    public String clas;

    public String getStdNumber() {
        return stdNumber;
    }

    public void setStdNumber(String stdNumber) {
        this.stdNumber = stdNumber;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }
    Scanner input= new Scanner(System.in);
    public void inputInfo()
    {
        System.out.println("nhap ma xinh vien : ");
        this.stdNumber= input.nextLine();
        System.out.println("nhap so tuoi cua sinh vien (>=18) : ");
        this.old=input.nextInt();
        System.out.println("Nhap lop cua dinh vien");
        this.clas=input.nextLine();
        System.out.println("nhap diem trung binh :");
        this.mark=input.nextDouble();
        
    }
    public void showInfo()
    {
        System.out.println("ma dinh vien : "+this.stdNumber);
        System.out.println("tuoi :"+this.old);
        System.out.println("lop : "+this.clas);
        System.out.println("diem trung binh:"+this.mark);
    }
    public boolean hocBong()
    {
        boolean flag = false;
        if(this.mark>8.0)
        {
            flag=true;
        }
        return flag;
    }
}
