package ua.lviv.iot.algo.part1.lab1;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LaptopManager {

    private final static List<Laptop> laptops= new ArrayList<>();
    public static void main(String[] args) {
        addLaptop(new GamingLaptop("ASUS", 17.3, 32, 1024, 8, 100, "NVIDIA GeForce RTX 3080", 2));
        addLaptop(new GamingLaptop("ACER", 15.6, 8, 512, 6, 100, "NVIDIA GeForce RTX 3050 Ti", 2));
        addLaptop(new Ultrabook("ASUS", 15.6, 8, 512, 12, 100, 1.8, 1.7));
        addLaptop(new Ultrabook("Lenovo", 15.6, 16, 1024, 12, 100, 1.8, 1.7));
        addLaptop(new OfficeLaptop("Lenovo", 17.3, 16, 1024, 6, 100,  25000,"black"));
        addLaptop(new OfficeLaptop("ACER", 15.6, 8, 512, 8, 1002,16000, "white"));
        addLaptop(new StudentLaptop("Lenovo", 15.6, 16, 1024, 8, 100, "Intel Core i5-10300h","China" ));
        addLaptop(new StudentLaptop("ASUS", 17.3, 32, 1024, 12, 100, "Intel Core i7-1165G7 ","China" ));

        for(var laptop : laptops)
        {
            System.out.println(laptop);
            System.out.println(laptop.replaceBattery(10));
        }

        findAllWithSameRam(16);
        findAllWithSameModel("ASUS");
    }
    public static void addLaptop(final Laptop laptop) {
        laptops.add(laptop);
    }
    public static void findAllWithSameModel(String model) {
        System.out.println("\nLaptop with the model:  " + model + ":");
        laptops.stream().filter(v -> (Objects.equals(v.getModel(), model))).toList().forEach(System.out::println);
    }

    public static void findAllWithSameRam(int ram) {
        System.out.println("Laptop with  ram " + ram + ":");
        laptops.stream().filter(v -> (Objects.equals(v.getRam(), ram))).toList().forEach(System.out::println);
    }
}
