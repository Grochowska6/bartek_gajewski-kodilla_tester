package com.kodilla.collections.adv.exercises.homework;


import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flightsTable = new ArrayList<>();

        flightsTable.add(new Flight("Warszawa", "Katowice"));
        flightsTable.add(new Flight("Warszawa","Krakow"));
        flightsTable.add(new Flight("Warszawa", "Gdansk"));
        flightsTable.add(new Flight("Warszawa", "Wroclaw"));
        flightsTable.add(new Flight("Wroclaw", "Krakow"));
        flightsTable.add(new Flight("Wroclaw", "Gdansk"));
        flightsTable.add(new Flight("Wroclaw", "Katowice"));
        return flightsTable;
    }
}
