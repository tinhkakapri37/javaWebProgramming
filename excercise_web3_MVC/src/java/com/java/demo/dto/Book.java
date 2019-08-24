/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.dto;

/**
 *
 * @author DELL 5440
 */
public class Book {
    private int id;
    private String tenSach;
    private String tacGia;
    private String gia;
    private String soLuong ;

    public Book() {
    }

    public Book(int id, String tenSach, String tacGia, String gia, String soLuong) {
        this.id = id;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
