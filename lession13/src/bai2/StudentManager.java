/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.io.ObjectInputStream

import java.io.ObjectOutputStream;

public class StudentManager {

    List<Student> list = new ArrayList<>();

    public boolean add(Student std) {
        boolean flag = false;
        list.add(std);
        flag = true;
        return flag;
    }
    public Student seach(String name){
        for( Student std: list){
            if(std.getName()==name){
                return std;
            }
        }
        return null;
        
    }
    public Student update(){
        
        return ;
    }
    public  void detele(Student std){            
                list.remove(std);     
    }
    public boolean save(String path){
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(path));
           return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean readFile(String path){
        
        
        try {
                    ObjectInputStream ois= new ObjectInputStream(new FileInputStream(path));
                    List<Student> list=(List<Student>) ois.readObject();
                    return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }

}
