/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class InputInfo {
    private Scanner scanner;

    public InputInfo() {
        this.scanner = new Scanner(System.in);
    }
    
    public String inputId() { // HV000
        String tempId = this.scanner.nextLine();
        try {
            //Kiem tra dieu kien
//            if (!tempId.startsWith("HV")) throw new Exception("Phai bat dau bang HV");
//            String sub = tempId.substring(2);
//            int parseInt = Integer.parseInt(sub);

            // Biểu thức chính quy - Regular Expression
            if (!tempId.matches("HV[0-9]{3}")) 
                throw new Exception("Phai bat dau bang HV va 3 so");
        } catch (Exception e) {
            System.out.println("Sai dinh dang");
            System.out.println(e.getMessage());
            return this.inputId();
        }
        return tempId;
    }
    
    public String inputName() {
        String tempName = this.scanner.nextLine();
        //Kiem tra dieu kien
        try {
            if (tempName.length() < 8) throw new Exception("Ten phai lon hon 8 ky tu");
        } catch (Exception e) {
            System.out.println("Sai dinh dang");
            System.out.println(e.getMessage());
            return this.inputName();
        }
        return tempName;
    }
    
    public double inputMark() {
        double tempMark = Double.parseDouble(this.scanner.nextLine());
        //Kiem tra dieu kien
        try{
            if(tempMark<0||tempMark>10)
                throw  new Exception("diem phai lon hon 0 vaf nho hon 10");
        }catch(Exception e1){
            System.out.println("sai dinh dang:");
            System.out.println(e1.getMessage());
            return this.inputMark();
        }
        
        return tempMark;
    }
    
    public String inputPhone() {
        String tempPhone = this.scanner.nextLine();
        //Kiem tra dieu kien
        
        try{
       if (!tempPhone.matches("([0]+[0-9]{9})"))
           throw  new Exception("sdt khong hop le:");
            }catch(Exception e2){
                System.out.println("sai dinh dang sdt:");
                System.out.println(e2.getMessage());
                return this.inputPhone();
            }
        return tempPhone;

    
    }         
}
