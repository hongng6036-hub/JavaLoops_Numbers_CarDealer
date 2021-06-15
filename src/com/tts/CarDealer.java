package com.tts;

import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.*;

public class CarDealer {
    public static void main(String[] args) {

        //Create a HashMap of vehicles.
        HashMap<String, String> vehicles = new HashMap<String, String>();
        //Add the inventory into the HashMap using .put
        // vehicles <Model, Make>. Variable is vehicles. Model is the key. Make is the value.
        vehicles.put("Corolla", "Toyota");
        vehicles.put("Mini Cooper", "BMW");
        vehicles.put("Civic", "Honda");
        vehicles.put("Infiniti", "Nissan");
        vehicles.put("Altima", "Nissan");
        vehicles.put("GT", "Ford");
        vehicles.put("S", "Tesla");
        vehicles.put("Beetle", "Volkswagen");

        //Ask the customer what car(model) they are looking for.
        Scanner buyerInput = new Scanner(System.in);
        System.out.println("Hi! Welcome to the Hong's car dealership! \n" +
                "What car model are you looking for today?");
        String modelFromBuyerInput = buyerInput.nextLine();

        //Use Hash Map to check inventory if we have the vehicle and its make.
        vehicles.containsKey(modelFromBuyerInput);


        //Use boolean to check for inventory and return a match
        boolean isMatch = vehicles.containsKey(modelFromBuyerInput);
        if (isMatch == true) {
            System.out.println("Oh, you're looking for a "
                    + vehicles.get(modelFromBuyerInput) + "!"
                    + " We have " + modelFromBuyerInput + "s over here.");
        } else {
            System.out.println("Sorry, we don't carry that model.");
        }
            return;
        }

}
