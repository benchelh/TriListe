package com.meryem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortPersonsExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Meryem", "Benchelh"));
        people.add(new Person("Fati", "Brada"));
        people.add(new Person("Meryem", "Charles"));
        people.add(new Person("Rania", "Kssim"));

        // Tri de la liste de personnes
        Collections.sort(people);

        // Affichage des personnes triées
        System.out.println("Liste triée de personnes :");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}