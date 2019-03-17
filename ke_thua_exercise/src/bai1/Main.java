/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main{
    public static void main (String[] args) {
        StudentManager manager = new StudentManager();
        Scanner input= new Scanner(System.in);
        System.out.println("-----Student Manager---");
        System.out.println("1.  List");
        System.out.println("2.  Search");
        System.out.println("3.  Add");
        System.out.println("4.  Exit");
        System.out.println("Choice :");
        int flag=input.nextInt();
        switch(flag){
            case 1:
            {
                System.out.println("Order(true/false) :");
                boolean order=input.nextBoolean();
                manager.list(order);
                break;
            }
            case 2:
            {
                System.out.println("Nhập tên muốn search :");
                String name=input.nextLine();
                manager.search(name);
                break;
            }
            case 3:
            {
                System.out.println("Nhập sinh vien muốn thêm :");
                Student stud= new Student();
                stud.scan();
                manager.add(stud);
                break;
                
            }
            case 4:
            {
                System.out.println("Exit!!!");
                break;
            }
            default:{
                System.out.println("Nhập không hợp lệ,nhập lại!!!");
                break;
            }
        }
    }
}
