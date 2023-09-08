package org.example.model;

import java.util.Objects;

public class Route {
    private String startCity;
    private String endCity;

    public Route(String startCity, String endCity) {
        this.startCity = startCity;
        this.endCity = endCity;
    }

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    public String getEndCity() {
        return endCity;
    }

    public void setEndCity(String endCity) {
        this.endCity = endCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Route)) return false;
        Route route = (Route) o;
        return Objects.equals(getStartCity(), route.getStartCity()) && Objects.equals(getEndCity(), route.getEndCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStartCity(), getEndCity());
    }
}
