package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public final class OfficeLaptop extends Laptop {

    private String laptopColor;

    private double laptopPrice;
    private static String Headers = "laptopColor, laptopPrice \n";

    public OfficeLaptop(final String model, final double screenSize, final int ram, final int storage,
                        final int batteryLife, final int batteryLevel, final String laptopColor,
                        final double laptopPrice) {
        super(model, screenSize, ram, storage, batteryLife, batteryLevel);
        this.laptopColor = laptopColor;
        this.laptopPrice = laptopPrice;
    }


    @Override
    public boolean replaceBattery(final int newCapacity) {
        this.setBatteryLife(newCapacity);
        this.setBatteryLevel(BATTERY_LEVEL_FULL);
        return true;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", " + Headers;

    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + laptopColor + "," + laptopPrice + "\n";
    }

    private static final int BATTERY_LEVEL_FULL = 100;
}
