/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Buoi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        int age;
        String name;
        String school;
        Scanner input = new Scanner(System.in);

        System.out.println("*****NHAP LI LICH BAN THAN*****");

        System.out.println("nhap ho va ten cua ban :");
        name = input.nextLine();

        System.out.println("nhap tuoi cua ban :");
        age = input.nextInt();

        System.out.println("ban hoc truong nao ?");
        Scanner truong = new Scanner(System.in);
        school = truong.nextLine();

        int num = 18;

        System.out.println("****li lich sinh vien*****");
        System.out.println("ho va ten :" + name);
        System.out.println("tuoi :" + age);
        System.out.println("sinh vien truong :" + school);
        if (age >= num) {
            System.out.println("ban da tren 18 tuoi");
        } else {
            System.out.println("ban chua du 18 tuoi!!!!");
        }

    }

}
