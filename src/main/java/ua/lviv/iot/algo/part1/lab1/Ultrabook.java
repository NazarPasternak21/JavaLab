package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class Ultrabook extends Laptop {
    private double weight;
    private double thickness;

    public Ultrabook(final String model, final double screenSize, final int ram, final int storage, final int batteryLife,
                     final int batteryLevel, final double ultrabookWeight, final double ultrabookThickness) {
        super(model, screenSize, ram, storage, batteryLevel, batteryLife);
        this.weight = ultrabookWeight;
        this.thickness = ultrabookThickness;
    }

    @Override
    public final boolean replaceBattery(final int capacityInHours) {
        return false;
    }
}
