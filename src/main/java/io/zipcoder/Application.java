package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        /*Console console = new Console();
        Integer numOfPets = console.getNumberOfPets();
        ArrayList<Pet> receivedPets = console.getPetsInput(numOfPets);
        console.printListOfPets(receivedPets);*/

        String[] arr = new String[]{"b", "d", "c", "a"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);
    }
}

