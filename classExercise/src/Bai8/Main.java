/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Complex cp= new Complex();
        cp.info();
        cp.add(cp, cp);
        cp.print();
    }
}
