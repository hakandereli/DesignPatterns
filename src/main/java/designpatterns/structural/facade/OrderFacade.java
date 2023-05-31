package designpatterns.structural.facade;

import designpatterns.structural.facade.model.Customer;
import designpatterns.structural.facade.model.Product;
import designpatterns.structural.facade.service.CustomerService;
import designpatterns.structural.facade.service.InventoryService;
import designpatterns.structural.facade.service.PaymentService;

public class OrderFacade {

    private InventoryService inventoryService;
    private CustomerService customerService;
    private PaymentService paymentService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.customerService = new CustomerService();
        this.paymentService = new PaymentService();
    }

    public void placeOrder(Product product, Customer customer, Double amount) {
        inventoryService.checkStock(product);
        this.customerService.checkCustomer(customer);
        paymentService.makePayment(customer, amount);
        System.out.println("Order placed: " + product + ", " + customer + ", " + amount);
    }
}
