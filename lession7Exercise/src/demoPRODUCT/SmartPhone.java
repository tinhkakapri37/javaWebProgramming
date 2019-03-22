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
public class SmartPhone extends Produce{
    private boolean hasCamera;
    private int sim;

    public SmartPhone(){
        
    }
    public SmartPhone(boolean hasCamera, int sim) {
        this.hasCamera = hasCamera;
        this.sim = sim;
    }

    public boolean isHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public int getSim() {
        return sim;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }
        
    
    @Override 
    public void addNew(){
        Produce p= new Produce();
        SmartPhone sphone1= new SmartPhone();
        p.addNew();
        System.out.println("Nhập vào true/false để biết có camera hay k:");
        Scanner input=new Scanner(System.in);
        sphone1.hasCamera=input.nextBoolean();
        System.out.println("Nhập sim");
        sphone1.sim=input.nextInt();
    }
}
