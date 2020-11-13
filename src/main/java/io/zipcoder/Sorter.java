package io.zipcoder;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Sort objects by type, break ties by name.
 *                ~ then ~
 * Sort objects by name, break ties by type.
 */

public class Sorter implements Comparator<Pet> {
    Console console = new Console();
    ArrayList<Pet> pets = console.getPetsCoven();

    @Override
    public int compare(Pet o1, Pet o2) {
        return 0;
    }

    public ArrayList<Pet> compareByType(ArrayList<Pet> input){
        /*Pet pet1, pet2;
        for (int i = 0; i < input.size(); i++){
            pet1 = input.get(input.indexOf(i));
            pet2 = input.get(input.indexOf(i+1));
        }*/
        return null;
    }

    public ArrayList<Pet> compareByName(ArrayList<Pet> input){
        return null;
    }
}
