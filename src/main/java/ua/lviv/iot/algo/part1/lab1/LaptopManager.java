package ua.lviv.iot.algo.part1.lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class LaptopManager {
    private final List<Laptop> laptops;

    public LaptopManager() {
        laptops = new ArrayList<>();
    }
        public void addLaptopToList(final Laptop laptop) {
            laptops.add(Objects.requireNonNull(laptop, "laptop cannot be null"));
        }
        public List<Laptop> findAllWithSameModel(final String model) {
            return laptops.stream()
                    .filter(laptop -> Objects.equals(laptop.getModel(), model))
                    .collect(Collectors.toList());
        }
        public List<Laptop> findAllWithSameRam(final int ram) {
            return laptops.stream()
                    .filter(laptop -> laptop.getRam() == ram)
                    .collect(Collectors.toList());
        }
        public List<Laptop> findLaptopsWith16GBRam() {
            return findAllWithSameRam(16);
        }
        public List<Laptop> findAsusLaptops() {
            return findAllWithSameModel("ASUS");
        }
        public static void main(String[] args) {
        LaptopManager manager = new LaptopManager();
        manager.addLaptopToList(new GamingLaptop("ASUS", 17.3, 32, 1024, 8, 100, "NVIDIA GeForce RTX 3080", 2));
        manager.addLaptopToList(new GamingLaptop("ACER", 15.6, 8, 512, 6, 100, "NVIDIA GeForce RTX 3050 Ti", 2));
        manager.addLaptopToList(new Ultrabook("ASUS", 15.6, 8, 512, 12, 100, 1.8, 1.7));
        manager.addLaptopToList(new Ultrabook("Lenovo", 15.6, 16, 1024, 12, 100, 1.8, 1.7));
        manager.addLaptopToList(new OfficeLaptop("Lenovo", 17.3, 16, 1024, 6, 100, "black", 25000));
        manager.addLaptopToList(new OfficeLaptop("ACER", 15.6, 8, 512, 8, 1002, "white", 16000));
        manager.addLaptopToList(new StudentLaptop("Lenovo", 15.6, 16, 1024, 8, 100, "Intel Core i5-10300h", "China"));
        manager.addLaptopToList(new StudentLaptop("ASUS", 17.3, 32, 1024, 12, 100, "Intel Core i7-1165G7 ", "China"));

        for (Laptop laptop : manager.laptops) {
            System.out.println(laptop.toString());
        }

        System.out.println("\nLaptops with 16GB RAM:");
        for (Laptop laptop : manager.findLaptopsWith16GBRam()) {
            System.out.println(laptop.toString());
        }

        System.out.println("\nASUS laptops:");
        for (Laptop laptop : manager.findAsusLaptops()) {
            System.out.println(laptop.toString());
        }
    }
}
