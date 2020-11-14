package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Console console = new Console();
        Integer numOfPets = console.getNumberOfPets();
        ArrayList<Pet> receivedPets = console.getPetsInput(numOfPets);
        console.printListOfPets(receivedPets);
    }
}

