package designpatterns.structural.facade.service;

import designpatterns.structural.facade.model.Product;

// Inventory Management
public class InventoryService {

    public void checkStock(Product product) {
        System.out.println("Checking stock for " + product);
    }
}
