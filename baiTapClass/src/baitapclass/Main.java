/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapclass;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            MyDate d = new mydate(1, 1, 2019);
            d.addDay(61);
            d.print(0);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
}