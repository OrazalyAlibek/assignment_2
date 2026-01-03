import models.Employee;
import models.Person;
import models.Student;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        File employees = new File("/Users/alibekorazaly/IdeaProjects/assignment_2/src/sources/employees_data");
        File students = new File("/Users/alibekorazaly/IdeaProjects/assignment_2/src/sources/students_data");
        Scanner sc1 = new Scanner(employees);
        Scanner sc2 = new Scanner(students);
        while (sc1.hasNextLine()) {

        }
        while (sc2.hasNextLine()) {


        }
        prindData(people);
    }
    public static void prindData(Iterable<Person> persons) {
        for (Person p : persons) {
            System.out.println(p.toString() + " earns " + p.getPaymentAmount() + " tenge ");
        }
    }
}
