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
public class Student extends Person {

    public String getProgram() {
        return studentProgram;
    }

    public void setProgram(String program) {
        studentProgram = program;
    }

    public int getYear() {
        return studentYear;
    }

    public void setYear(int year) {
        studentYear = year;
    }

    public double getFee() {
        return studentFee;
    }

    public void setFee(double fee) {
        studentFee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() + ", program = " + studentProgram + ", year = " + studentYear + ", fee= " + studentFee;
    }
    
    private String studentProgram;
    private int studentYear;
    private double studentFee;

    public Student(String name, String address, String program, int year, double fee) {
        setName(name);
        setAddress(address);
        studentProgram = program;
        studentYear = year;
        studentFee = fee;
    }
}
