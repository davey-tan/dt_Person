/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dt_person;

/**
 *
 * @author Crestfall
 */
public class Staff {
    
    public String getSchool() {
        return staffSchool;
    }
    
    public void setSchool(String school) {
        staffSchool = school;
    }
    
    public double getPay() {
        return staffPay;
    }
    
    public void setPay(double pay) {
        staffPay = pay;
    }
    
    private String staffSchool;
    private double staffPay;
    
    public Staff(String school, double pay) {
        staffSchool = school;
        staffPay = pay;
    }
}
