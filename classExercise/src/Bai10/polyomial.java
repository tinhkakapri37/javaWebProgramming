/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai10;

/**
 *
 * @author Admin
 */
public class polyomial {
    private int[] heSo;
    private int[] soMu;

    public polyomial(int[] heSo, int[] soMu) {
        this.heSo = heSo;
        this.soMu = soMu;
    }

    public int[] getHeSo() {
        return heSo;
    }

    public void setHeSo(int[] heSo) {
        this.heSo = heSo;
    }

    public int[] getSoMu() {
        return soMu;
    }

    public void setSoMu(int[] soMu) {
        this.soMu = soMu;
    }

    public polyomial add(polyomial a,polyomial b){
        int[] heso = new int[10];
        for (int i=0;i<soMu.length;i++)
        {
            heso[i]=a.heSo[i]+b.heSo[i];
            
        }
        return new polyomial(heso, soMu);
    }
    
    
}
