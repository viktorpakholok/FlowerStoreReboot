package ua.edu.ucu.apps.flowerstore.decorators;

import lombok.ToString;
import ua.edu.ucu.apps.flowerstore.Item;

@ToString
public class RibbonDecorator extends ItemDecorator {
    private static final double RIBBON_PRICE = 40;
    private Item item;

    public RibbonDecorator(Item item) {
        this.item = item;
    }

    public double price() {
        return RIBBON_PRICE + item.price();
    }

    public String getDescription() {
        return item.getDescription() + "Wrapped in ribbon decorator";
    }
}
