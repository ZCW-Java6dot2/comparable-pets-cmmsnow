package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    @Test
    public void constructorTest(){
        String name = "Dexter";
        Dog dog = new Dog(name);
        String actual = dog.getName();
        Assert.assertEquals(name, actual);
    }

    @Test
    public void setNameTest(){
        Cat cat = new Cat("Booboo");
        String newName = "Toby";
        cat.setName(newName);
        String actual = cat.getName();
        Assert.assertEquals(newName, actual);
    }

    @Test
    public void setTypeTest(){
        Cat cat = new Cat("Booboo");
        String newType = "bunny";
        cat.setType(newType);
        String actual = cat.getType();
        Assert.assertEquals(newType, actual);
    }

    @Test
    public void speakTest(){
        Bunny bunny = new Bunny("Booboo");
        String expected = "Quiet sniff with nose twitches";
        String actual = bunny.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void compareToTest1(){
        Cat cat1 = new Cat("Dexter");
        Cat cat2 = new Cat("Toby");
        int actual = cat1.compareTo(cat2);
        Assert.assertTrue( actual < 0);
    }

    @Test
    public void compareToTest2(){
        Dog dog = new Dog("Dexter");
        Cat cat = new Cat("Dexter");
        int actual = dog.compareTo(cat);
        Assert.assertTrue( actual > 0);
    }
}
