package designpatterns.structural.facade.service;

import designpatterns.structural.facade.model.Customer;

// Customer Management
public class CustomerService {

    public void checkCustomer(Customer customer) {
        System.out.println("Checking customer for " + customer);
    }
}
