package io.zipcoder;

import java.lang.Comparable;

public class Dog extends Pet {
    public Dog(String name){
        super(name);
    }

    public Dog(String name, String type){
        super(name, type);
    }

    @Override
    public String speak() {
        return "Woof";
    }
}
