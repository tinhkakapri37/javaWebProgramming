/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class fraction {
    private int numerator;
    private int denominator;
    public fraction(){
    }
    public fraction(int numerator,int denomination){
        this.denominator=denomination;
        this.numerator=numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public void inputFractioprin(){
        Scanner input= new Scanner(System.in);
        
        System.out.println("nhập tử số :");
        this.numerator=input.nextInt();
        System.out.println("nhập mấu số:");
        this.denominator=input.nextInt();
        
    }
    public void print(){
        System.out.println(this.numerator+"/"+this.denominator);
    }
    public int gcd(int a,int b){
            while (a!=b)
            {
                if(a>b)a=a-b;
                else b=b-a;
            }
            int gcd=a;
            return gcd;
    }
    public fraction reduce(){
        int gcd=gcd(this.numerator,this.denominator);
        int numerator=this.numerator/gcd;
        int denmoinator=this.denominator/gcd;
        return new fraction(numerator,denmoinator);
        
    }
    public fraction inverse(){
        int numerator=this.denominator;
        int denominator=this.numerator;
        return new fraction(numerator,denominator);
    }
    public fraction add(fraction A,fraction B){
        int denominator=A.denominator*B.denominator;
        int numerator=A.numerator*B.denominator+B.numerator*A.denominator;
        return new fraction(numerator,denominator);
        
    }
    public fraction sub(fraction A,fraction B){
        int denominator=A.denominator*B.denominator;
        int numerator=A.numerator*B.denominator-B.numerator*A.denominator;
        return new fraction(numerator,denominator);
    }
    public fraction mul(fraction A,fraction B){
        int denominator=A.denominator*B.denominator;
        int numerator=A.numerator*B.numerator;
        return new fraction(numerator,denominator);
    }
    public fraction div(fraction A,fraction B){
        int denominator=A.denominator*B.numerator;
        int numerator=A.numerator*B.denominator;
        return new fraction(numerator,denominator);
    }
}
