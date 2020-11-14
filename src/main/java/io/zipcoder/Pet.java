package io.zipcoder;

import java.lang.Comparable;
import java.util.ArrayList;

public class Pet implements Comparable<Pet> {
    private String name;
    private String type;

    public Pet(){}

    public Pet(String name){
        this.name = name;
        this.type = "";
    }

    public void setType(String type){ this.type = type; }

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

    @Override
    public int compareTo(Pet o) {
        int answer = this.name.compareTo(o.getName());
        return answer == 0 ? this.type.compareTo(o.getType()) : answer;
    }
}
