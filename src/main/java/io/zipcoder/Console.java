package io.zipcoder;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Console {
    private Scanner scan = new Scanner(System.in);
    private Integer numberOfPets;
    private String type;
    private String name;
    private ArrayList<Pet> petsCoven = new ArrayList<Pet>();

    public String getInput(String prompt) {
        System.out.print(prompt);
        scan.nextLine();
        return scan.next();
    }

    public Integer getNumberOfPets(){
        System.out.println("How many pets do you have?");
        numberOfPets = scan.nextInt();
        return numberOfPets;
    }

    public ArrayList<Pet> getPetsInput(Integer numberOfPets){
        ArrayList<Pet> newPets = new ArrayList<Pet>();
        for (int i=0; i<numberOfPets; i++){
            type = (getInput("What type is your pet: dog, cat, or bunny?  ")).toLowerCase();
            name = (getInput("Enter this pet's name:  "));
            if (type.equals("dog")){
                Dog dog = new Dog(name);
                newPets.add(dog);
            } else if (type.equals("cat")){
                Cat cat = new Cat(name);
                newPets.add(cat);
            } else if (type.equals("bunny")){
                Bunny bunny = new Bunny(name);
                newPets.add(bunny);
            }
        }
        this.petsCoven = newPets;
        return newPets;
    }

    public void printListOfPets(ArrayList<Pet> rPets){
        System.out.println("List of your " + rPets.size() + " pets:\n");
        for (Pet p : rPets){
            System.out.println("\n" + (p.getName()) + " says " + (p.speak()));
        }
    }

    public void setPetsCoven(ArrayList<Pet> petsCoven) {
        this.petsCoven = petsCoven;
    }

    public ArrayList<Pet> getPetsCoven(){
        return this.petsCoven;
    }

    public void sortByType(){
        Comparator<Pet> comparator = Comparator.comparing(Pet::getType);
        Collections.sort(getPetsCoven(), comparator);
    }
}

