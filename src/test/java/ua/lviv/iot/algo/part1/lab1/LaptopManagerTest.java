package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LaptopManagerTest {

    private LaptopManager laptopManager;

    @BeforeEach
    public void setUp() {
        laptopManager = new LaptopManager();
    }

    @Test
    public void testAddLaptop() {
        Laptop laptop = new GamingLaptop("ASUS", 17.3, 32, 1024, 8, 100, "NVIDIA GeForce RTX 3080", 2);
        laptopManager.addLaptop(laptop);

        List<Laptop> laptops = laptopManager.getLaptops();
        assertNotNull(laptops);
        assertEquals(1, laptops.size());
        assertEquals(laptop, laptops.get(0));
    }

    @Test
    public void testFindAllWithSameModel() {
        Laptop asusLaptop1 = new GamingLaptop("ASUS", 17.3, 32, 1024, 8, 100, "NVIDIA GeForce RTX 3080", 2);
        Laptop asusLaptop2 = new Ultrabook("ASUS", 15.6, 8, 512, 12, 100, 1.8, 1.7);

        laptopManager.addLaptop(asusLaptop1);
        laptopManager.addLaptop(asusLaptop2);

        laptopManager.findAllWithSameModel("ASUS");
    }

    @Test
    public void testFindAllWithSameRam() {
        Laptop laptop1 = new GamingLaptop("ASUS", 17.3, 32, 1024, 8, 100, "NVIDIA GeForce RTX 3080", 2);
        Laptop laptop2 = new Ultrabook("ASUS", 15.6, 16, 1024, 12, 100, 1.8, 1.7);

        laptopManager.addLaptop(laptop1);
        laptopManager.addLaptop(laptop2);

        laptopManager.findAllWithSameRam(16);
    }

    @Test
    public void testRun() {
        laptopManager.run();
    }
}
