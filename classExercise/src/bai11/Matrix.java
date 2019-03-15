/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Matrix {
    private int row;
    private int col;
    private int[][] value;

    public Matrix(int row, int col,int[][] value) {
        this.row = row;
        this.col = col;
        this.value=this.value;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int[][] getValue() {
        return value;
    }

    public void setValue(int[][] value) {
        this.value = value;
    }
    
    Scanner input= new Scanner(System.in);
    public void scanMatrix(){
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.col;j++){
                this.value[i][j]=input.nextInt();
            }
        }
    }
    public Matrix add(Matrix a,Matrix b){
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.col;j++){
                value[i][j] = a.value[i][j]+b.value[i][j];
            }
        }
        return new Matrix(row, col, value);
    }
}
