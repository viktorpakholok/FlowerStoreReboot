package ua.edu.ucu.apps.flowerstore.payment;

import java.util.List;

import ua.edu.ucu.apps.flowerstore.Item;

public class CreditCardPaymentStrategy implements Payment {
    private String description = Payment.DESCRIPTION + "credit card";
    
    @Override
    public String pay(double price) {
        return "You paid " + price + description;
    }

    @Override
    public String pay(List<Item> items) {
        double price = 0;

        for (Item item : items) {
            price += item.price();
        }

        return "You paid" + price + " for " + items.toString() + description;
    }
}
