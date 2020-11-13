package io.zipcoder;

import java.lang.Comparable;

public class Bunny extends Pet {
    public Bunny(String name){
        super(name);
    }

    public Bunny(String name, String type){
        super(name, type);
    }

    @Override
    public String speak() {
        return "Quiet sniff with nose twitches";
    }
}
