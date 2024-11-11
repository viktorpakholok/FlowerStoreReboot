package ua.edu.ucu.apps.flowerstore.flower;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ua.edu.ucu.apps.flowerstore.Item;

@Getter @Setter @ToString
@Entity
@Table
public class Flower extends Item {
    @Id
    private double price;
    private FlowerSpec flowerSpec;

    public Flower() { 

    }

    public Flower(double price, FlowerSpec flowerSpec) {
        this.flowerSpec = flowerSpec;
        this.price = price;
    }

    public Flower(double price, FlowerColor color, double sepalLength, FlowerType flowerType) {
        flowerSpec.setColor(color);
        flowerSpec.setSepalLength(sepalLength);
        flowerSpec.setFlowerType(flowerType);
        this.price = price;
    }

    // copy constructor
    public Flower(Flower flower) {
        price = flower.getPrice();
        flowerSpec = flower.getFlowerSpec();

        setColor(flower.getColor());
        setSepalLength(flower.getSepalLength());
        setFlowerType(flower.getFlowerType());
    }

    public FlowerColor getColor() {
        return FlowerColor.getColor(flowerSpec.getColor());
    }

    public double getSepalLength() {
        return flowerSpec.getSepalLength();
    }

    public FlowerType getFlowerType() {
        return flowerSpec.getFlowerType();
    }

    public void setColor(FlowerColor flowerColor) {
        flowerSpec.setColor(flowerColor);
    }

    public void setSepalLength(double sepalLength) {
        flowerSpec.setSepalLength(sepalLength);
    }

    public void setFlowerType(FlowerType flowerType) {
        flowerSpec.setFlowerType(flowerType);
    }

    public double price() {
        return price;
    }

    public boolean matches(FlowerSpec otherFlowerSpec) {
        return getFlowerSpec().matches(otherFlowerSpec);
    }
}

