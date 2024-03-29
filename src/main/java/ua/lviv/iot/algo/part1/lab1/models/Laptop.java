package ua.lviv.iot.algo.part1.lab1.models;

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

    private int batteryLife;

    private int batteryLevel;

    private static final String headers = "model, screenSize, RAM, storage, batteryLife, batteryLevel";

    public String getHeaders() {
        return headers;
    }

    public String toCSV() {
        return model + ", " + screenSize + ", " + ram + ", "
                + storage + ", " + batteryLife + ", " + batteryLevel;
    }

    public abstract boolean replaceBattery(int capacityInHours);
}