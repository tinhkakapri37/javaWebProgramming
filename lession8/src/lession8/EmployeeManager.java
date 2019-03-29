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
public class EmployeeManager extends Manager{
    private Employee[] employee;
            int max=20;
            int numberepl=0;

    public EmployeeManager(Employee[] employee) {
        this.employee = employee;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }
    @Override
    public void add(){
        Employee epl = null;
        Scanner input= new Scanner(System.in);
        if(numberepl<max){
            System.out.println("Nhap thông tin nhan vien: ");
            employee[numberepl]=epl;
            numberepl++;
        }
        
    }
    @Override
    public void show(){
        for(int i=0;i<employee.length;i++){
            System.out.println(employee[i]);
        }
    }
    @Override
    public void search(String name){
        Scanner input= new Scanner(System.in);
        System.out.println("Nhập vào tên muốn tìm: ");
        name=input.nextLine();
        for(int i=0;i<employee.length;i++){
            if(name.compareTo(employee[i].getName())==0){
                System.out.println(employee[i]);
            }
        }
        
    }

    
}
