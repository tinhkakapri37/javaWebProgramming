/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Hoàng Nhật
 */
public class WriteFile extends Fileset{
    private String text;

    public WriteFile() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void write(){
        try {
            Scanner input= new Scanner(System.in);
        System.out.println("Nhap van ban :");
        this.text=input.nextLine();
        PrintWriter pw= new PrintWriter(this.getPash());
        pw.print(this.text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
    
}
