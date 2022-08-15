package com.company.functionalities;

import com.company.models.Customer;

import java.util.List;

public class Functionalities {

    public Customer getCustomerWithExactMatchingName(List<Customer> customerList, String name){

        return customerList.stream()
                .filter(customer -> customer.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }





}
