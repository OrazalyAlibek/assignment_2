package models;

public class Student extends Person {
    private double gpa;
    private static final double stipend = 36660.00;

    public Student(){
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        setGpa(gpa);
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public double getPaymentAmount() {
        return (gpa > 2.67) ? stipend : 0.00;
    }
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}
