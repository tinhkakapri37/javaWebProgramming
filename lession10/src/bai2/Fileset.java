/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Hoàng Nhật
 */
public class Fileset {
    private String pash;

    public Fileset() {
        
    }

    public String getPash() {
        return pash;
    }

    public void setPash(String pash) {
        this.pash = pash;
    }
    
    public void setpash(){
        Scanner input= new Scanner(System.in);
        System.out.println("Nhap vao duong dan :");
        this.pash=input.nextLine();
        File f= new File(pash);
        
    }
}
