package ua.edu.ucu.apps.flowerstore.flower;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@Embeddable
public class FlowerSpec {
    private FlowerColor color;
    private double sepalLength;
    private FlowerType flowerType;

    public FlowerSpec() {

    }

    public FlowerSpec(
        FlowerColor color, double sepalLength, FlowerType flowerType) {
        this.color = color;
        this.sepalLength = sepalLength;
        this.flowerType = flowerType;
    }

    public FlowerSpec(FlowerSpec flowerSpec) {
        color = flowerSpec.color;
        sepalLength = flowerSpec.sepalLength;
        flowerType = flowerSpec.flowerType;
    }

    public String getColor() {
        return color.toString();
    }

    public boolean matches(FlowerSpec flowerSpec) { 
        if (color == flowerSpec.color 
        && sepalLength == flowerSpec.sepalLength 
        && flowerType == flowerSpec.flowerType) {
            return true;
        }
        return false;
    }
}
