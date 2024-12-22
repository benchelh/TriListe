package com.meryem;

public class Person implements Comparable<Person> {
    private String nom;
    private String prenom;

    public Person(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public int compareTo(Person other) {
        int nomComparison = this.nom.compareTo(other.nom);
        if (nomComparison != 0) {
            return nomComparison; // Tri par nom
        } else {
            return this.prenom.compareTo(other.prenom); // Tri par prénom en cas de noms identiques
        }
    }

    @Override
    public String toString() {
        return nom + ", " + prenom;
    }
}