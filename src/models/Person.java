package models;

import interfaces.Payable;

public class Person implements Payable, Comparable<Person> {
    private static int id_gen = 1;
    private final int id;
    private String name;
    private String surname;

    public Person() {
        this.id = id_gen++;
    }
    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPosition() {
        return "Student";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + surname;
    }
    @Override
    public double getPaymentAmount() {
        return 0;
    }
    @Override
    public int compareTo(Person other) {
        if (this.getPaymentAmount() > other.getPaymentAmount()) {
            return 1;
        } else if (this.getPaymentAmount() < other.getPaymentAmount()) {
            return -1;
        } else {
            return 0;
        }
    }
}
