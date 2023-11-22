package com.zoo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;


public class AnimaliZoo {

    public static void main(String[] args) {

        List<Lions> lions = new ArrayList<>();
        lions.add (new Lions ("Franco","pesce",40,LocalDate.of(2019, 4, 2),55,190,50));
        lions.add (new Lions ("Matteo","bradipi",40,LocalDate.of(2009, 4, 2),55,200,50));
        List<Tigers> tigers = new ArrayList<>();
        tigers.add (new Tigers ("Daje","matti",30,LocalDate.of(2011, 4, 2),44,50,60));
        tigers.add (new Tigers ("Branco","pescepurelui",30,LocalDate.of(2019, 4, 2),44,50,110));
        List<Eagles> eagles = new ArrayList<>();
        eagles.add (new Eagles ("Matteo","carne",40,LocalDate.of(2019, 4, 2),55,190,50));
        eagles.add (new Eagles ("Yep","pesce",40,LocalDate.of(2012, 4, 2),33,140,90));
        List<AnimalsWithTail> animals_tail = new ArrayList<>();
        animals_tail.addAll(lions);
        animals_tail.addAll(tigers);
        List<AnimalsWithWings> animals_wings = new ArrayList<>();
        animals_wings.addAll(eagles);

        displayHighAndLow(lions, "Lions");
        displayHighAndLow(tigers, "Tigers");
        displayHighAndLow(eagles, "Eagles");

        displayHeavy(lions, "Lions");
        displayHeavy(tigers, "Tigers");
        displayHeavy(eagles, "Eagles");

        displayLongTail(animals_tail);
        displayLargeWing(animals_wings);
    }

    private static void displayHighAndLow(List<? extends Animal> listed, String specie) {
        if (listed.isEmpty()) {
            System.out.println("No " + specie + " in the system.");
            return;
        }
        Animal Tallest = Collections.max(listed, Comparator.comparingInt(a -> a.height));
        Animal Shortest = Collections.min(listed, Comparator.comparingInt(a -> a.height));
        System.out.println("The tallest " + specie + " has a height of: " + Tallest.height + "m");
        System.out.println("The shortest " + specie + " has a height of: " + Shortest.height + "m");
    }

    private static void displayHeavy(List<? extends Animal> listed, String specie) {
        if (listed.isEmpty()) {
            System.out.println("No " + specie + " in the system.");
            return;
        }
        Animal Heavy = Collections.max(listed, Comparator.comparingInt(a -> a.weight));
        Animal Light = Collections.min(listed, Comparator.comparingInt(a -> a.weight));
        System.out.println("The most heavy " + specie + " weights: " + Heavy.weight + "kg");
        System.out.println("The least heavy " + specie + "weights: " + Light.weight + "kg");
    }

    private static void displayLongTail(List<AnimalsWithTail> animals_tail) {
        if (animals_tail.isEmpty()) {
            System.out.println("No animal in the system.");
            return;
        }
        AnimalsWithTail Lenght = Collections.max(animals_tail, Comparator.comparingInt(AnimalsWithTail::getLongestTail));
        System.out.println("The longest tail is long "+ Lenght.getLongestTail() + "cm");
    }

    private static void displayLargeWing(List<AnimalsWithWings> animals_wings) {
        if (animals_wings.isEmpty()) {
            System.out.println("No animal in the system.");
            return;
        }
        AnimalsWithWings Largest = Collections.max(animals_wings, Comparator.comparingInt(AnimalsWithWings::getLargestWings));
        System.out.println("The largest wing opener is large "+ Largest.getLargestWings() + "cm");
    }



}





