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

    private static String Headers ="weight, thickness \n";


    public Ultrabook(final String model, final double screenSize, final int ram, final int storage, final int batteryLife,
                     final int batteryLevel, final double ultrabookWeight, final double ultrabookThickness) {
        super(model, screenSize, ram, storage, batteryLevel, batteryLife);
        this.weight = ultrabookWeight;
        this.thickness = ultrabookThickness;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", " + Headers;
    }

    @Override
    public String toCSV() {
        return  super.toCSV() + ", " + weight + ", " + thickness + "\n";
    }

    @Override
    public boolean replaceBattery(final int capacityInHours) {
      return false;
    }
}
