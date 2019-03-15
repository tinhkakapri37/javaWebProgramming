/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int[][] m1value = null;
        int[][] m2value = null;
        int[][] sumvalue=null;
         Matrix m1= new Matrix(3, 3, m1value);        
         Matrix m2= new Matrix(3, 3, m2value);
        
        Matrix m= new Matrix(3, 3, sumvalue);
        m1.scanMatrix();
        m2.scanMatrix();
        m.add(m1, m2);
        
    }
}
