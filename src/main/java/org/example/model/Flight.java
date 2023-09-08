package org.example.model;

import org.example.model.fare.Fare;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Flight {
    Integer flightNumber;
    Route route;
    Map<String,Seat> seats;
    Integer availableSeats;

    final Integer price;

    Map<Fare, List<Seat>> fareSeatMap;

    public Flight(Integer flightNumber, Route route, Map<String, Seat> seats, Integer availableSeats, Integer price, Map<Fare, List<Seat>> fareSeatMap) {
        this.flightNumber = flightNumber;
        this.route = route;
        this.seats = seats;
        this.availableSeats = availableSeats;
        this.price = price;
        this.fareSeatMap = fareSeatMap;
    }

    public Integer getPrice() {
        return price;
    }

    public Map<Fare, List<Seat>> getFareSeatMap() {
        return fareSeatMap;
    }

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Map<String, Seat> getSeats() {
        return seats;
    }

    public void setSeats(Map<String, Seat> seats) {
        this.seats = seats;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getFlightNumber(), flight.getFlightNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlightNumber());
    }
}
