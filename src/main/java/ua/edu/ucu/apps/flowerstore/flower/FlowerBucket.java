package ua.edu.ucu.apps.flowerstore.flower;

import java.util.ArrayList;
import java.util.List;

import lombok.ToString;
import ua.edu.ucu.apps.flowerstore.Item;

@ToString
public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        flowerPacks = new ArrayList<>();
    }

    public void addFlowers(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double price() {
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public boolean searchFlower(FlowerSpec flowerSpec) {
        for (FlowerPack flowerPack : flowerPacks) {
            if (flowerPack.matches(flowerSpec)) {
                return true;
            }
        }
        return false;
    }
}

// Закон Деметри не використовувати дві "." (a.m().n() bad)
// Прочитати Head First OOP design and Analysis