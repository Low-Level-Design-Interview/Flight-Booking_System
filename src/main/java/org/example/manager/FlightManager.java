package org.example.manager;

import org.example.exception.FlightCustomException;
import org.example.model.Flight;
import org.example.model.Route;

import java.util.List;
import java.util.Map;

public class FlightManager {
    static Map<Route, List<Flight>> routToFlightMap;
    static Map<Integer,List<Flight>> deapartureDateToFlightMap;

    public static void searchFlight(String from,String to,int departDate,int paxCount) throws FlightCustomException {
        Route route = new Route(from,to);
        if( !routToFlightMap.containsKey(route))
            throw new FlightCustomException("No flight available for route");

        if(!deapartureDateToFlightMap.containsKey(departDate))
            throw new FlightCustomException("No flight available for date");

        List<Flight> routeFlight=routToFlightMap.get(route);
        List<Flight> sameDateFlight=deapartureDateToFlightMap.get(departDate);

        routeFlight.retainAll(sameDateFlight);

        routeFlight.stream().filter(item-> item.getAvailableSeats()>=paxCount).forEach(System.out::println);


    }
}
