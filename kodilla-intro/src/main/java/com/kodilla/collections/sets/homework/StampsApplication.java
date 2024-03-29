package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
            stamps.add(new Stamp("Castle", 4, true));
            stamps.add(new Stamp("Train", 3, true));
            stamps.add(new Stamp("King", 4, false));
            stamps.add(new Stamp("Castle", 4, false));
            stamps.add(new Stamp("Nature", 3, true));
            stamps.add(new Stamp("Castle", 4, true));
            stamps.add(new Stamp("Train", 3, false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}
