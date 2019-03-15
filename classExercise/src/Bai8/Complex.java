/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Complex {
    private int real;
    private int virtual;
    public Complex(){
        
    }
    public Complex(int real,int virtual){
           this.real=real;
           this.virtual=virtual;
    }

    

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getVirtual() {
        return virtual;
    }

    public void setVirtual(int virtual) {
        this.virtual = virtual;
    }
    Scanner input= new Scanner(System.in);

    public void info(){
        System.out.println("nhap so phuc:");
        this.real=input.nextInt();
        this.virtual=input.nextInt();
    }
    public void print(){
        System.out.println(this.real+"i"+this.virtual);
    }
    public int add(Complex A,Complex B){
        
        int real=A.real+B.real;
        int virtual= A.virtual+B.virtual;
        return new Complex(real,virtual);
    }
   
}