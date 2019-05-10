/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Guest
 */
public class Menu {

    private Map<String,String>map;
    public Menu() {
        this.map= new HashMap<>();
        
    }
    public void loadData(){
//        this.map.put("menu", "Menu");
//        this.map.put("add","add new");
//        this.map.put("menu", "danh muc");
//        this.map.put("add","them moi");
        try {
            BufferedReader reader= new BufferedReader(new InputStreamReader(new FileInputStream("manu-vn-locate")));
            while (true){
                String line =reader.readLine();
                
                if(line==null)break;
                String[] split=line.split("=");
                this.map.put(split(0), split(1));
            }
        } catch (Exception e) {
          e.printStackTrace();
        }

   
    }
    public void print(){
        System.out.println("\n----%s----",this.map.get("menu"));
    }
    
 
   
    
    
    
    
}
