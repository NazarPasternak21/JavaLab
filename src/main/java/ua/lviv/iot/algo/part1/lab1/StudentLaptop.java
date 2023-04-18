package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public final class StudentLaptop extends Laptop {

    private String processor;

    private String producingCountry;

    private static String Headers ="processor, producingCountry \n";


    public StudentLaptop(final String model, final double screenSize, final int ram, final int storage,
                         final int batteryLife, final int batteryLevel, final String processor,
                         final String producingCountry) {
        super(model, screenSize, ram, storage, batteryLife, batteryLevel);
        this.processor = processor;
        this.producingCountry = producingCountry;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", " + Headers;
    }

    @Override
    public String toCSV() {
        return  super.toCSV() + ", " + processor + ", " + producingCountry + "\n";
    }


    @Override
    public boolean replaceBattery(final int newCapacity) {
        this.setBatteryLife(newCapacity);
        this.setBatteryLevel(BATTERY_LEVEL_FULL);
        return true;
    }

    private static final int BATTERY_LEVEL_FULL = 100;
}
