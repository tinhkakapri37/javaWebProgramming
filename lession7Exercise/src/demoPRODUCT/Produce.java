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
public class Produce {
    private int id;
    private String name;
    private double price;
    private int quantity;
    
    public Produce(){
        
    }

    public Produce(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    public void addNew(){
        Scanner input= new Scanner(System.in);
        Produce produce1= new Produce();
        System.out.println("Nhập vào mã id sản phẩm : ");
        produce1.id=input.nextInt();
        System.out.println("Nhập vào tên sản phẩm : ");
        produce1.name=input.next();
        System.out.println("Nhập vào giá sản phẩm : ");
        produce1.price=input.nextDouble();
        System.out.println("Nhập vào số lượng sản phẩm : ");
        produce1.quantity=input.nextInt();
        
    }
   
    
}
