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
public class Camera extends Produce{
    private boolean hasWifi;
    
    public Camera(){
        
    }
    public Camera(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }
    @Override
    public void addNew(){
        Produce p= new Produce();
        Camera cmr1= new Camera();
        p.addNew();
        Scanner input= new Scanner(System.in);
        System.out.println("Nhập true/false để biết co wifi không :");
        cmr1.hasWifi=input.nextBoolean();
    }
}
