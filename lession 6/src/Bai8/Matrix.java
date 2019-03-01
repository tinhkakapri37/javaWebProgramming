/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8;

/**
 *
 * @author Admin
 */
public class Matrix {
    private int col;
    private int row;
    private int[][] values;

    public Matrix() {
        this.col = 3;
        this.row = 3;
        this.values = new int[3][3];
    }

    public Matrix(int col, int row, int[][] values) {
        this.col = col;
        this.row = row;
        this.values = values;
    }

    public int getCol() {
        return this.col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int[][] getValues() {
        return values;
    }

    public void setValues(int[][] values) {
        this.values = values;
    }

    public Matrix add(Matrix m) {
        // Kiem tra kich thuoc
        Matrix result = new Matrix(this.col, this.row, this.values);

        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                result.values[i][j] = m.values[i][j] + this.values[i][j];
            }
        }

        return result;
    }

    public boolean checkDX() {
        boolean flag = true;
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (this.values[i][j] != this.values[j][i]) {
                    flag = false;
                    break;
                }

            }
        }
        return flag;
    }

    public void print() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print(this.values[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public void tongHang()
    {
        for(int i=0;i<this.col;i++)
        {
            int tongHang=0;
            for(int j=0;j<this.row;j++){
            tongHang=tongHang +this.values[j][i];
           }
           System.out.println("tong cua cot "+i+"la"+tongHang); 
        }
       
    }
    public void tongCot()
    {
        for(int i=0;i<this.col;i++)
        {
           int tongCot=0;
            for(int j=0;j<this.row;j++){
            tongCot=tongCot +this.values[j][i];
           }
           System.out.println("tong cua cot "+i+"la"+tongCot); 
        }
       
    }

}


