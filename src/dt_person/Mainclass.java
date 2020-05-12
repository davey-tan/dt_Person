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
public class Mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student = new Student("Davey", "Robinson", "BIS", 2023, 420000);
        System.out.println(student);
        Staff staff = new Staff("Kate Tobias", "Bean News Box", "Bean News University", 0);
        System.out.println(staff);
    }

}
