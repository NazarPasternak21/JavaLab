package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Laptop {
    private String model;
    private double screenSize;
    private int ram;
    private int storage;
    public int batteryLife;
    private int batteryLevel;

    public abstract boolean replaceBattery(int capacityInHours);
}
