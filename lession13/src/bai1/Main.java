/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Guest
 */
public class Main {
    public static void main(String[] args) {
        String path="D:\\New folder\\f1.txt";
        File file=new File(path);
        
        Map<String,String> menu_vi_locale= new HashMap<>();
        
        menu_vi_locale.put("menu","danh muc");
        menu_vi_locale.put("add","them moi");
        menu_vi_locale.put("exit","thoat");
        
        Map<String,String> menu_en_locale= new HashMap<>();
        
        menu_vi_locale.put("menu","menu");
        menu_vi_locale.put("add","add new");
        menu_vi_locale.put("exit","exit");

                
    }
}
