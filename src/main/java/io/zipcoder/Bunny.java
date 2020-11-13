package io.zipcoder;

import java.lang.Comparable;

public class Bunny extends Pet {
    public Bunny(String name){
        super(name);
    }

    @Override
    public String speak() {
        return "Quiet sniff with nose twitches";
    }
}
