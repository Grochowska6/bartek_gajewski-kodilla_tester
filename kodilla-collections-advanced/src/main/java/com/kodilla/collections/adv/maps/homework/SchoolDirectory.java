package com.kodilla.collections.adv.maps.homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {

        Map<Principal, School> principe = new HashMap<>();
        School chemik = new School("Zespół szkół chemicznych");
        School budowlanka= new School("Zespół szkół budowlanych");
        School ekonom = new School("Zespół szkół ekonomicznych");
        School mechanik = new School("Zespół szkół zawodowych");

        Principal jan = new Principal("Jan", "Kowalski");
        Principal adam = new Principal("Adam", "Nowak");
        Principal piotr = new Principal("Piotr", "Wyskowicz");
        Principal tomasz = new Principal("Tomasz", "Zasada");

        School chemikSchool  = new School(Arrays.asList(30.0, 20.0, 22.0, 32.0, 27.0, 29.0, 23.0));
        School budowlankaSchool = new School(Arrays.asList(28.0, 27.0, 30.0, 25.0, 23.0, 29.0, 34.0));
        School ekonmomSchool = new School(Arrays.asList(30.0, 32.0, 28.0, 26.0, 23.0, 30.0));
        School mechanikSchool = new School(Arrays.asList(23.0, 34.0, 32.0, 23.0, 22.0, 25.0, 20.0));

        principe.put(jan, chemikSchool);
        principe.put(adam, budowlankaSchool);
        principe.put(piotr, ekonmomSchool);
        principe.put(tomasz, mechanikSchool);

        System.out.println(principe.get(adam));

        for(Map.Entry<Principal, School> SchoolEntry : principe.entrySet()) {
            System.out.println(SchoolEntry.getKey().getPrincipalName() + " number: " + SchoolEntry.getValue().getAverage());
        }

    }
}
