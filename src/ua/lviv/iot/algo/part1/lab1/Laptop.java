package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {
    private String model = "Unknown";
    private double screenSize = 15.6;
    private int ram = 8;
    private int storage = 256;
    private int batteryLife = 5;
    private int batteryLevel = 100;
    private static Laptop instance = new Laptop();

    public void addRam(int value) {
        ram += value;
    }

    public void addStorage(int value) {
        storage += value;
    }

    public void charge() {
        System.out.println("Charging the battery...");
        batteryLevel = 100;
        batteryLife = 10;
        System.out.println("Done. Battery level: " + batteryLevel + "%.");
    }

    public static Laptop getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Laptop[] laptops = new Laptop[4];
        laptops[0] = new Laptop();
        laptops[1] = new Laptop("Acer", 15.6, 16, 512, 10, 100);
        laptops[2] = getInstance();
        laptops[3] = getInstance();

        for (int i = 0; i < laptops.length; i++) {
            System.out.println("Laptop " + (i + 1) + ": " + laptops[i].toString());
        }
    }
}
