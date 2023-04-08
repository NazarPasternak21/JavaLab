package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class StudentLaptop extends Laptop {
    private String Processor;
    private String Producing_Country;

    public StudentLaptop(String model, double screenSize, int ram, int storage, int batteryLife, int batteryLevel,
                         String Processor, String Producing_Country) {
        super(model, screenSize, ram, storage, batteryLevel, batteryLife);
        this.Processor = Processor;
        this.Producing_Country = Producing_Country;
    }

    @Override
    public boolean replaceBattery(int capacityInHours) {
        this.setBatteryLife(capacityInHours);
        this.setBatteryLevel(100);
        return true;
    }
}
