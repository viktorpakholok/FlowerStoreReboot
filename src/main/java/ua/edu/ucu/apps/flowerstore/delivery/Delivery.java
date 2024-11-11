package ua.edu.ucu.apps.flowerstore.delivery;

import java.util.List;
import ua.edu.ucu.apps.flowerstore.Item;

public interface Delivery {
    String DELIVERY_NOTIFICATION = "delivered by ";

    String deliver(List<Item> items);
}
