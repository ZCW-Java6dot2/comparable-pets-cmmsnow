package io.zipcoder;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Sort objects by type, break ties by name.
 *                ~ then ~
 * Sort objects by name, break ties by type.
 */

public class Sorter {

    public static Comparator<Pet> petNameComparator = new Comparator<Pet>(){
        Console console = new Console();
        ArrayList<Pet> pets = console.getPetsCoven();

        @Override
        public int compare(Pet o1, Pet o2) {
            return 0;
        }
    };

    public static Comparator<Pet> petTypeComparator = new Comparator<Pet>(){

        @Override
        public int compare(Pet o1, Pet o2) {
            return 0;
        }
    };


    /*public ArrayList<Pet> compareByType(ArrayList<Pet> input){
        ArrayList<Pet> petsByType = new ArrayList<>();
        Pet pet1, pet2;
        for (int i = 0; i < input.size(); i++){
            pet1 = input.get(input.indexOf(i));
            pet2 = input.get(input.indexOf(i+1));
            if ((pet1.getType()).equals(pet2.getType())){
                compare(pet1.getName(), pet2.getName());
            } else {
                compare(pet1.getType(), pet2.getType());
            }
        }
        return petsByType;
    }

    public ArrayList<Pet> compareByName(ArrayList<Pet> input){
        ArrayList<Pet> petsByName = new ArrayList<>();
        Pet pet1, pet2;
        for (int i = 0; i < input.size()-1; i++){
            pet1 = input.get(input.indexOf(i));
            pet2 = input.get(input.indexOf(i+1));
        }
        return petsByName;
    }*/
}
