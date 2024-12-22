package com.meryem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonTest {

    @Test
    public void testPersonSorting() {
        // Création d'une liste de personnes
        List<Person> people = new ArrayList<>();
        people.add(new Person("Meryem", "Benchelh"));
        people.add(new Person("Fati", "Brada"));
        people.add(new Person("Meryem", "Charles"));
        people.add(new Person("Rania", "Kssim"));

        // Tri de la liste
        Collections.sort(people);

        // Vérification de l'ordre attendu
        assertEquals("Fati, Brada", people.get(0).toString());
        assertEquals("Meryem, Benchelh", people.get(1).toString());
        assertEquals("Meryem, Charles", people.get(2).toString());
        assertEquals("Rania, Kssim", people.get(3).toString());
    }
}
