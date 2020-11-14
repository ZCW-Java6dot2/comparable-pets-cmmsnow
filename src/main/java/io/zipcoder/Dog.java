package io.zipcoder;

import java.lang.Comparable;

public class Dog extends Pet {

    public Dog(String name){
        super(name);
        this.setType("dog");
    }

    @Override
    public String speak() {
        return "Woof";
    }
}
