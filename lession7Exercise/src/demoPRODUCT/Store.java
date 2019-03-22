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
public class Store{
    private Produce[] produce;
    int max_produce=20;
    int number=0;

    public Store(){
        
    }

    public Store(Produce[] produce) {
        this.produce = produce;
    }

    public Produce[] getProduce() {
        return produce;
    }

    public void setProduce(Produce[] produce) {
        this.produce = produce;
    }
    Scanner input= new Scanner(System.in);
    
    public void addProduce(){
        if(number<max_produce){
               Scanner input = new Scanner(System.in);
               System.out.println("chọn 1 để nhập smartphone,chọn 2 để nhập camera :");
               int choice=input.nextInt();
               if(choice==1){
                     Produce smp= new SmartPhone();
                     produce[number]=smp;
                     number++;
               }else{
                   Produce cmr= new Camera();
                     produce[number]=cmr;
                     number++;
               }
        }else System.out.println("produce fulled!!!");
    }
        void listProduce(){
        System.out.println("=====Danh Sach=====");
        for(Produce p: produce){
            if(p == null)
                break;
            System.out.println(p);
        }
    }
        void search(String name){
        for(Produce p : produce){
            if(p == null)
                break;
            if(p.getName().equals(name)){
                System.out.println(p);
                return ;
            }
        }
        System.out.println("Khong tim thay");
    }

    
    
    
}
