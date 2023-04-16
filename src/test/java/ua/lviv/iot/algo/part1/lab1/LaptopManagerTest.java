package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LaptopManagerTest {

    private LaptopManager laptopManager;

    @BeforeEach
    void setUp() {
        laptopManager = new LaptopManager();
        laptopManager.addLaptopToList(new GamingLaptop("ASUS", 17.3, 32, 1024, 8, 100, "NVIDIA GeForce RTX 3080", 2));
        laptopManager.addLaptopToList(new GamingLaptop("ACER", 15.6, 8, 512, 6, 100, "NVIDIA GeForce RTX 3050 Ti", 2));
        laptopManager.addLaptopToList(new Ultrabook("ASUS", 15.6, 8, 512, 12, 100, 1.8, 1.7));
        laptopManager.addLaptopToList(new Ultrabook("Lenovo", 15.6, 16, 1024, 12, 100, 1.8, 1.7));
        laptopManager.addLaptopToList(new OfficeLaptop("Lenovo", 17.3, 16, 1024, 6, 100, "black", 25000));
        laptopManager.addLaptopToList(new OfficeLaptop("ACER", 15.6, 8, 512, 8, 1002, "white", 16000));
        laptopManager.addLaptopToList(new StudentLaptop("Lenovo", 15.6, 16, 1024, 8, 100, "Intel Core i5-10300h", "China"));
        laptopManager.addLaptopToList(new StudentLaptop("ASUS", 17.3, 32, 1024, 12, 100, "Intel Core i7-1165G7 ", "China"));
    }

    @Test
    void testFindAllWithSameModel() {
        List<Laptop> laptops = laptopManager.findAllWithSameModel("ASUS");
        Assertions.assertEquals(3, laptops.size());
    }

    @Test
    void testFindAllWithSameRam() {
        List<Laptop> laptops = laptopManager.findAllWithSameRam(16);
        Assertions.assertEquals(3, laptops.size());
    }

    @Test
    void testFindLaptopsWith16GBRam() {
        List<Laptop> laptops = laptopManager.findLaptopsWith16GBRam();
        Assertions.assertEquals(3, laptops.size());
    }

    @Test
    void testFindAsusLaptops() {
        List<Laptop> laptops = laptopManager.findAsusLaptops();
        Assertions.assertEquals(3, laptops.size());
    }
}
