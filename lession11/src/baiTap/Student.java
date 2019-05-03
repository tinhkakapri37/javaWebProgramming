/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap;

/**
 *
 * @author Guest
 */
public class Student implements Comparable<Student>{
    private int id;
    private String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }

    @Override
    public boolean equals(Object obj) {
        Student that = (Student) obj;
        return this.id == that.id;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name); // So sanh theo ten
//        return this.id - o.id; // So sanh theo id
    }
    
}
