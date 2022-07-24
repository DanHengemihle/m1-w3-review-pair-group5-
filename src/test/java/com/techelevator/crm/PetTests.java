package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class PetTests {

    private Pet pet;


    @Before
    public void setup(){
        pet = new Pet("Freyja", "German Shepard");

        List<String> vaccinations = new ArrayList<>();

        vaccinations.add("Rabies");
        vaccinations.add("Distemper");
        vaccinations.add("Parvo");

        pet.setVaccinations(vaccinations);
    }

    @Test
    public void method_returns_string_when_given_list(){

        Assert.assertEquals("Rabies, Distemper, Parvo", pet.listVaccinations() );
    }
}
