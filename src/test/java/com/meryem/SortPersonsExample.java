package com.meryem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortPersonsExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Hamid", "Jamila"));
        people.add(new Person("Martin", "Bob"));
        people.add(new Person("Hamid", "Charles"));
        people.add(new Person("Bernard", "Jamila"));

        // Tri de la liste de personnes
        Collections.sort(people);

        // Affichage des personnes triées
        System.out.println("Liste triée de personnes :");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}