import models.Employee;
import models.Person;
import models.Student;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        File employees = new File("/Users/alibekorazaly/IdeaProjects/assignment_2/src/sources/employees_data");
        File students = new File("/Users/alibekorazaly/IdeaProjects/assignment_2/src/sources/students_data");
        Scanner sc1 = new Scanner(employees);
        Scanner sc2 = new Scanner(students);
        while (sc1.hasNextLine()) {
            String name = sc1.next();
            String surname = sc1.next();
            String position = sc1.next();
            double salary = sc1.nextDouble();
            people.add(new Employee(name, surname, position, salary));
        }
        while (sc2.hasNextLine()) {
            String name = sc2.next();
            String surname = sc2.next();
            double gpa = sc2.nextDouble();
            people.add(new Student(name, surname, gpa));
        }

        Collections.sort(people);
        printData(people);

    }
    public static void printData(Iterable<Person> persons) {
        for (Person p : persons) {
            System.out.println(p.toString() + " earns " + p.getPaymentAmount() + " tenge ");
        }
    }
}
