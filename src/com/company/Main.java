package com.company;

import com.company.functionalities.Functionalities;
import com.company.models.Account;
import com.company.models.Address;
import com.company.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Functionalities functionalities = new Functionalities();
        List<Customer> customerList = new ArrayList<>();
        Customer customer1 = new Customer();
        Address address1 = new Address("21", "streeta","nainital","uk");
        Account account1 = new Account("7633542367","HDFC0001",899.2);
        customer1.setName("nikhil");

        customer1.setAddress(address1);
        customer1.setAccount(account1);

        Customer customer2 = new Customer();
        Address address2 = new Address("23", "streetc","nainital","uk");
        Account account2 = new Account("7633542328","HDFC00055",899.2);
        customer2.setName("gauri");


        customer2.setAddress(address2);
        customer2.setAccount(account2);

        Customer customer3 = new Customer();
        Address address3 = new Address("22", "streetb","haldwani","uk");
        Account account3 = new Account("7633542368","HDFC0002",8334.2);
        customer3.setName("yash");


        customer3.setAddress(address3);
        customer3.setAccount(account3);

        Customer customer4 = new Customer();
        Address address4 = new Address("24", "streetd","haldwani","uk");
        Account account4 = new Account("7633542347","HDFC0009",87445.2);
        customer1.setName("siddhu");


        customer4.setAddress(address4);
        customer4.setAccount(account4);

        Customer customer5 = new Customer();
        Address address5 = new Address("25", "streeta","nainital","uk");
        Account account5 = new Account("7633542363","HDFC0008",899.2);
        customer5.setName("simpy");

        customer5.setAddress(address5);
        customer5.setAccount(account5);

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);

//        for(Customer customer: customerList){
//            System.out.println(customer.getName());
//        }

        Customer query1 = functionalities.getCustomerWithExactMatchingName(customerList,"nikhil");
        query1.toString();



    }
}
