package org.example.model;

import org.example.model.fare.Fare;

import java.util.Objects;

public class Seat {
    String seatId;
    Integer flightNumber;
    Fare fareType;

    public Seat(String seatId, Integer flightNumber, Fare fareType) {
        this.seatId = seatId;
        this.flightNumber = flightNumber;
        this.fareType = fareType;
    }
    public int getSeatPrice(){
        return fareType.price();
    }
    public String getSeatId() {
        return seatId;
    }



    public Integer getFlightNumber() {
        return flightNumber;
    }


    public Fare getFareType() {
        return fareType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seat)) return false;
        Seat seat = (Seat) o;
        return Objects.equals(getSeatId(), seat.getSeatId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSeatId());
    }
}
