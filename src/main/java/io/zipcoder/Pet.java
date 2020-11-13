package io.zipcoder;

import java.lang.Comparable;
import java.util.ArrayList;

public class Pet {
    private String name;
    private String type;

    public Pet(){}

    public Pet(String name){
        this.name = name;
    }

    public Pet(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String speak(){
        return "I'm hella cute";
    }
}
