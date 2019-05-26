/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizOnline;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
                    boolean flag = false;
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("        Quiz online       ");
            System.out.println("--------------------------");
            System.out.print("Enter Email: ");
            String email = input.nextLine();
            
            System.out.print("Enter Pass: ");
            String pass = input.nextLine();
            
            Check_login clog= new Check_login();
            boolean check= clog.login(email, pass);
            if (check){
                System.out.println("login success!!!");
                 flag=true;
            }
            else
            {
                System.out.println("login fail!!!");
                flag=false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(flag==true){
            int count=0;
            int question=1;
            while( question <=4){
                try {
                Scanner input= new Scanner(System.in);
                System.out.println("co 4 cau hoi");
                System.out.println("lua chon cau hoi so : "+question);
                String id= input.nextLine();
                
                questionExam qx= new questionExam();
                qx.exam(id);
                System.out.println("lua chon dap an (a,b,c or d)");
                String select=input.nextLine();
                if(select.equalsIgnoreCase(qx.result(id))){
                   count++;
                }
                question++;
                
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
            System.out.println("so cau dung : "+count+"/4");
    }
    }
            
}
