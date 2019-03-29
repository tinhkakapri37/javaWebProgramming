/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession8;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Employee extends Person{
    private double salary;

    

    public Employee(double salary, int id, String name) {
        super(id, name);
        this.salary = salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    @Override
    public void input(){
        Scanner input= new Scanner(System.in);
        System.out.println("Nhập salary: ");
        this.salary=Double.parseDouble(input.nextLine());
        //chuyển đổi từ String sang double
        
        
    }
    
}
