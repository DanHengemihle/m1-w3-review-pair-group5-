package com.techelevator.crm;

import com.techelevator.hr.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTests {

    private Customer customer;

    @Test
    public void returns_total_balance(){
        customer = new Customer("Reno", "Staples");
        Map<String, Double> services = new HashMap<>();
        services.put("Walking", 100.0);
        services.put("Grooming", 50.0);

        Assert.assertEquals(150.0, customer.getBalanceDue(services), .05);

    }



}
