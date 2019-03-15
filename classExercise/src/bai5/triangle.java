/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class triangle {

    private int a;
    private int b;
    private int c;

    public triangle() {
    }
    public triangle(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public void inputAdge()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("lan luot nhap so do 3 canh cua tam giac");
        this.a=input.nextInt();
        this.b=input.nextInt();
        this.c=input.nextInt();
    }
    public boolean checkRightTriangle(){
        boolean flag=false;
        if(this.a*this.a==this.b*this.b+this.c*this.c||this.b*this.b==this.a*this.a+this.c*this.c||this.c*this.c==this.a*this.a+this.b*this.b){
            flag=true;
            
        }
        return flag;     
    }
    public boolean checkIsosceles(){
        boolean flag=false;
        if(this.a==this.b&&this.b==this.c&&this.c==this.a)
        {
            flag=true;
        }
        return flag;
    }
    public boolean checkRegularTriangle(){
        boolean flag=false;
        if(checkIsosceles()==false&&checkRightTriangle()==false)
        flag=true;
        return flag;
    }
    public double perimeter(){
        double perimeter=this.a+this.b+this.c;
        return perimeter;
    }
    public double acreage(){
        double p=perimeter()/2;
        double acreage=(sqrt(p*(p-this.a)*(p-this.b)*(p-this.c)));
        return acreage;
    }
    
    
    
}
