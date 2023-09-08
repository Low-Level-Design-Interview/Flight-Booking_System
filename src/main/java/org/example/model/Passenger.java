package org.example.model;

import java.util.Objects;

public class Passenger {
    private String userId;
    private String name;
    private Integer fund;

    public Passenger(String userId, String name, Integer fund) {
        this.userId = userId;
        this.name = name;
        this.fund = fund;
    }

    public String getUserId() {
        return userId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFund() {
        return fund;
    }

    public void setFund(Integer fund) {
        this.fund = fund;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passenger)) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(getUserId(), passenger.getUserId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId());
    }
}
