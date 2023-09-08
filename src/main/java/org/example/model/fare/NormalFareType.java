package org.example.model.fare;

import org.example.model.Seat;
import org.example.model.enums.FarePrice;

import java.util.Map;

public class NormalFareType implements Fare{
    Map<String, Seat> seatMap;

    @Override
    public int price() {
        return FarePrice.valueOf(fareType()).getPrice();
    }

    @Override
    public Class<? extends Fare> getFareType() {
        return NormalFareType.class;
    }

    public String fareType(){
        return getFareType().getSimpleName();
    }

    @Override
    public Seat getSeats(String seatId) {
        return seatMap.getOrDefault(seatId,null);
    }

    @Override
    public boolean isSeatPresent(String seatId) {
        if(seatMap.containsKey(seatId))
            return true;
        return false;
    }
}
