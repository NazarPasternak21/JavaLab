package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class OfficeLaptop extends Laptop {
    private String color;
    private double price;

    public OfficeLaptop(String model, double screenSize, int ram, int storage, int batteryLife, int batteryLevel,
                        int price, String color) {
        super(model, screenSize, ram, storage, batteryLevel, batteryLife);
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean replaceBattery(int capacityInHours) {
        this.setBatteryLife(capacityInHours);
        this.setBatteryLevel(100);
        return true;
    }
}
