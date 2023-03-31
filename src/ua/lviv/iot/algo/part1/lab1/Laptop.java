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
        batteryLevel = 100;
        batteryLife = 10;
    }

    public static Laptop getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Laptop[] laptops = {
                new Laptop(),
                    new Laptop("Acer", 15.6, 16, 512, 10, 100),
                    getInstance(),
                    getInstance()
        };

        for (Laptop laptop : laptops) {
            System.out.println(laptop.toString());
        }
    }
}
