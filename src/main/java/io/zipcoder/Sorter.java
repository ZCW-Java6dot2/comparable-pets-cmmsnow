package io.zipcoder;

import java.util.ArrayList;
import java.util.Comparator;

public class Sorter implements Comparator<Pet> {
    Console console = new Console();
    ArrayList<Pet> pets = console.getPetsCoven();

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

    @Override
    public int compare(Pet o1, Pet o2) {
        return 0;
    }
}
