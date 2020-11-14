package io.zipcoder;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ConsoleTest extends TestCase {
    ArrayList<Pet> givenPets;
    Console console = new Console();

    @Before
        public void setUp(){
        givenPets = new ArrayList<>(Arrays.asList(new Dog("Dexter"), new Cat("Dexter"), new Cat("Toby")));
    }

    public void testSortByType() {
        ArrayList<Pet> expected = new ArrayList<>(Arrays.asList(new Cat("Dexter"), new Cat("Toby"), new Dog("Dexter")));
        console.setPetsCoven(givenPets);
        console.sortByType();
        Assert.assertEquals(expected, console.getPetsCoven());
    }
}