package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testAddFlightFrom() {

    List<Flight> departure  = FlightFinder.findFlightsFrom("Warszawa");
    Flight flight = new Flight("From","To");
    List<Flight> departureTable =  new ArrayList<>();
    departureTable.add(new Flight("Warszawa", "Katowice"));
    departureTable.add(new Flight("Warszawa", "Krakow"));
    departureTable.add(new Flight("Warszawa", "Gdansk"));
    departureTable.add(new Flight("Warszawa", "Wroclaw"));
    assertEquals(departureTable, departure);
        System.out.println(departureTable
                .size());
        System.out.println(FlightFinder.findFlightsFrom("Warszawa"));
    }
    @Test
    public void testAddFlight() {

        List<Flight> flightsTable = new ArrayList<>();
        flightsTable.add(new Flight("Warszawa", "Katwice"));
        assertEquals(1, flightsTable.size());
    }
    @Test
    public void testAddFlightTo() {
        List<Flight> arrival = FlightFinder.findFlightsTo("Katowice");

        List<Flight> flightTo = new ArrayList<>();
        flightTo.add(new Flight("Warszawa", "Katowice"));
        flightTo.add(new Flight("Wroclaw","Katowice"));
        assertEquals(flightTo, arrival);
    }






}