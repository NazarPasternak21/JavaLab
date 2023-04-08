package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

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
