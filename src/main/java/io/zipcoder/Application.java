package io.zipcoder;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args){
        Console console = new Console();
        Integer numOfPets = console.getNumberOfPets();
        ArrayList<Pet> receivedPets = console.getPets(numOfPets);
        console.printListOfPets(receivedPets);
    }
}

