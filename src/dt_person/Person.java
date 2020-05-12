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
public class Person {
    
    public String getName() {
        return personName;
    }
    
    public void setName(String name) {
        personName = name;
    }
    
    public String getAddress() {
        return personAddress;
    }
    
    public void setAddress(String address) {
        personAddress = address;
    }
    
    @Override
    public String toString() {
        return "Person[name = " + personName + ", address = " + personAddress + "]";
    }
    
    String personName;
    String personAddress;
    
    public Person(String name, String address) {
        personName = name;
        personAddress = address;
    }
}
