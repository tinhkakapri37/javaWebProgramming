/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        ManagerStudent manager = new ManagerStudent();

        do {
            System.out.println("---MENU---");
            System.out.println("1. Nhap");
            System.out.println("2. Danh sach");
            System.out.println("3. Top 3");
            System.out.println("4. Thoat");
            System.out.print("Chon > ");
            int c = Integer.parseInt(input.nextLine());
            switch (c) {
                case 1:
                    manager.add();
                    break;
                case 2:
                    manager.list();
                    break;
                case 3:
                    manager.showTop(3);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai");
            }
        } while (true);

    }

    
}
