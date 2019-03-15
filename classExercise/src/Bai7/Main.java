/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        fraction fract= new fraction();
        fraction fract1= new fraction();
        fract1.inputFractioprin();
        System.out.println("phan so rut gon: ");
        fract1.reduce().print();
        System.out.println("phan so nghich dao: ");
        fract1.inverse().print();
        fraction fract2= new fraction();
        fract2.inputFractioprin();
        System.out.println("phep cong 2 phan so bang: ");
        fract.add( fract1, fract2).reduce().print();
        System.out.println("phep tru 2 phan so bang: ");
        fract.sub(fract1, fract2).reduce().print();
        System.out.println("phep nhan 2 phan so bang: ");
        fract.mul(fract1, fract2).reduce().print();
        System.out.println("phep chia 2 phan so bang: ");
        fract.div(fract1, fract2).reduce().print();

    }
}
