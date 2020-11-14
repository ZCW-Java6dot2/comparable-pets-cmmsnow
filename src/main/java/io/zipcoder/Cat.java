package io.zipcoder;

import java.lang.Comparable;

public class Cat extends Pet {
    public Cat(String name){
        super(name);
        this.setType("cat");
    }

    @Override
    public String speak() {
        return "Meow";
    }
}
