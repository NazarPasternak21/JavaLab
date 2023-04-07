package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class GamingLaptop extends Laptop {
    private String graphicsProcessor;
    private int FansNumber;

    public GamingLaptop(String model, double screenSize, int ram, int storage, int batteryLife, int batteryLevel,
                        String graphicsProcessor, int FansNumber) {
        super(model,screenSize,ram,storage,batteryLife,batteryLevel);
        this.graphicsProcessor = graphicsProcessor;
        this.FansNumber = FansNumber;
    }

    public boolean replaceBattery(int capacityInHours) {
        this.batteryLife = capacityInHours;
        return true;
    }
}
