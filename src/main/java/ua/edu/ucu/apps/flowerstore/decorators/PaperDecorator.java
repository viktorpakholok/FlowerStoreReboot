package ua.edu.ucu.apps.flowerstore.decorators;

import lombok.ToString;
import ua.edu.ucu.apps.flowerstore.Item;

@ToString
public class PaperDecorator extends ItemDecorator {
    private static final double PAPER_PRICE = 13;
    private Item item;

    public PaperDecorator(Item item) {
        this.item = item;
    }

    public double price() {
        return PAPER_PRICE + item.price();
    }

    public String getDescription() {
        return item.getDescription() + "Wrapped in paper decorator";
    }
}
