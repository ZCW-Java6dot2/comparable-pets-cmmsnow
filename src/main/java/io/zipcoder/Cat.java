package io.zipcoder;

import java.lang.Comparable;

public class Cat extends Pet {
    public Cat(String name){
        super(name);
    }

    public Cat(String name, String type){
        super(name, type);
    }

    @Override
    public String speak() {
        return "Meow";
    }
}
