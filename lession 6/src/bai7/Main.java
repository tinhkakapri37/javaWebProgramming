/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import Bai8.Matrix;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int[][] m1Values = { {1,2,3}, {3,2,1}, {1,1,1} };
        int[][] m2Values = { {3,1,5}, {2,1,4}, {2,2,2} };
        
        Matrix m1 = new Matrix(3, 3, m1Values );
        Matrix m2 = new Matrix(3, 3, m2Values );
        
        Matrix sum=m1.add(m2);
        sum.print();
    }
}
