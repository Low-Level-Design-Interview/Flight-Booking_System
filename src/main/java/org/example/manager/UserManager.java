package org.example.manager;

import org.example.exception.InvalidUserExceptionFlight;
import org.example.model.Passenger;

import java.util.Map;

//Singleton class but for simplicity using static
public class UserManager {
    private static Map<String, Passenger> passengers;

    public static Passenger addUser(String uId,String name,Integer funds) throws InvalidUserExceptionFlight {
        if(isUserPresent(uId))
            throw new InvalidUserExceptionFlight("User Id already present");

        Passenger newPassenger=new Passenger(uId,name,funds);
        passengers.put(uId,newPassenger);
        return newPassenger;

    }
    public static boolean isUserPresent(String uId){
        if(passengers.containsKey(uId))
            return true;

        return false;
    }
}
