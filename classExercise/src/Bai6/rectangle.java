/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class rectangle {
    private double length;
    private  double wide;
    public rectangle(){
    }
    public rectangle(double  length,double wide){
        this.length=length;
        this.wide=wide;
        
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }
    public void inputAdge(){
        Scanner input = new Scanner(System.in);
        System.out.println("nhập chiều dài :");
        this.length=input.nextDouble();
        System.out.println("nhập chiều rộng :");
        this.wide=input.nextDouble();
    }
    public double perimeter(){
        double perimeter=2*(this.length+this.wide);
        return perimeter;
    }
    public double acreage(){
        double acreage=this.length*this.wide;
        return acreage;
    }
}
