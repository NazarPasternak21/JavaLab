package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class Ultrabook extends Laptop {
    private double weight;
    private double thickness;

    public Ultrabook(String model, double screenSize, int ram, int storage, int batteryLife, int batteryLevel,
                     double weight, double thickness) {
        super(model, screenSize, ram, storage, batteryLevel, batteryLife);
        this.weight = weight;
        this.thickness = thickness;
    }

    @Override
    public boolean replaceBattery(int capacityInHours) {
        return false;
    }
}
