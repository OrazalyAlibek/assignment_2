package models;

public class Employee extends Person {
    private String position;
    private double salary;

    public Employee(){
        super();
    }
    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public double getPaymentAmount() {
        return getSalary();
    }
    @Override
    public String toString() {
        return "Employee " + getId() + " " + getName() + " " + getSurname();
    }
}
