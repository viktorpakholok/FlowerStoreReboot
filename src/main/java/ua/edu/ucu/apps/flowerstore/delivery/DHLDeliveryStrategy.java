package ua.edu.ucu.apps.flowerstore.delivery;

import java.util.List;
import ua.edu.ucu.apps.flowerstore.Item;

public class DHLDeliveryStrategy implements Delivery {
    private String deliveryNotification 
    = Delivery.DELIVERY_NOTIFICATION + "DHL";

    public String deliver(List<Item> items) {
        return (
            "Your items: " + items.toString() + " are " + deliveryNotification
        );
    }
}
