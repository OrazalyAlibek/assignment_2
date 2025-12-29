import models.Employee;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Scanner sc = new Scanner(File);
        prindData(people);
    }
    public static void prindData(Iterable<Person> persons) {
        for (Person p : persons) {
            System.out.println(p.toString() + " earns " + p.getPaymentAmount() + " tenge ");
        }
    }
}
