package ua.edu.ucu.apps.flowerstore.payment;

import java.util.LinkedList;

import ua.edu.ucu.apps.flowerstore.Item;
import ua.edu.ucu.apps.flowerstore.delivery.Delivery;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment newPayment) {
        this.payment = newPayment;
    }

    public void setDeliveryStrategy(Delivery newDelivery) {
        this.delivery = newDelivery;
    }

    public double calculateTotalPrice() {
        double res = 0;
        for (Item item : items) {
            res += item.price();
        }
        return res;
    }

    public void procesOrder() {
        payment.pay(calculateTotalPrice());
        delivery.deliver(items);
        System.out.println("Your order is processed");
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
