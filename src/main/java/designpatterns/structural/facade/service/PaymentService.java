package designpatterns.structural.facade.service;

import designpatterns.structural.facade.model.Customer;

public class PaymentService {

    public void makePayment(Customer customer, double amount) {
        System.out.println("Making payment of " + amount + " TL for customer " + customer);
    }
}
