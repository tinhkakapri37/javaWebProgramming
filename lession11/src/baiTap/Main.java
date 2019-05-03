/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Vector;

/**
 *
 * @author Guest
 */
public class Main {
    public static void main(String[] args) {
        List<Student> stud = new ArrayList<>();
        stud.add(new Student(3, "CONG"));
        stud.add(new Student(2, "BINH"));
        stud.add(new Student(1, "AN"));
        stud.add(new Student(4, "DAO"));
        
//        stud.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        boolean remove = stud.remove(new Student(2, "BINH"));
//        System.out.println(remove);
        
        for (Student s : stud) {
            System.out.println(s);
        }
        
        
        Vector<String> v = new Vector<>();
        v.addElement("HOANG");
        v.add("HUNG");
        System.out.println(v.elementAt(0));
        System.out.println(v.get(1));
        System.out.println(v.size());
        
        for (String item : v) {
            System.out.println(item);
        }
        
        System.out.println("=============+LINKEDLIST+=========");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("ANH");
        linkedList.add("BINH");
        linkedList.add("CUONG");
        linkedList.add("DUNG");
        
        System.out.println(linkedList.size());
        for (String item : linkedList) {
            System.out.println(item);
        }
        
        Queue q = new ArrayDeque();
        
    }
    

}
