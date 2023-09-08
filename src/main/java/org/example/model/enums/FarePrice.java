package org.example.model.enums;

public enum FarePrice {
    NormalFareType(100),
    BusinessFareType(200);

    int price;

    FarePrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
