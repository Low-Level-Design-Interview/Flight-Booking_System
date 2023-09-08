package org.example.model.fare;

import org.example.model.Seat;

import java.util.List;

public interface Fare {
    public int price();
    public Class<? extends Fare> getFareType();

    public Seat getSeats(String seatId);

    public boolean isSeatPresent(String seatId);
}
