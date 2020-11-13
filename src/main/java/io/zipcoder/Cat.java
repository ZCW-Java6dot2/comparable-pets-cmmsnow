package io.zipcoder;

import java.lang.Comparable;

public class Cat extends Pet {
    public Cat(String name){
        super(name);
    }

    @Override
    public String speak() {
        return "Meow";
    }
}
