/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoPRODUCT;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
Produce produce[] = new Produce[20];
        Store s = new Store(produce);
        Scanner sc= new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. AddProduct");
            System.out.println("2. ListProduct");
            System.out.println("3. SearchProduct");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    s.addProduce();
                    break;
                case 2:
                    s.listProduce();
                    break;
                case 3:
                    System.out.println("Nhap name");
                    s.search(sc.nextLine());
            }
        } while (choice != 4);
    }

}
