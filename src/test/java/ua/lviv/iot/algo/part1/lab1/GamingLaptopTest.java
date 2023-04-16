package ua.lviv.iot.algo.part1.lab1;

import org.junit.Test;
import static org.junit.Assert.*;

public class GamingLaptopTest {

    @Test
    public void testReplaceBattery() {
        GamingLaptop laptop = new GamingLaptop("ASUS", 17.3, 32, 1024, 8, 100, "NVIDIA GeForce RTX 3080", 2);
        boolean result = laptop.replaceBattery(10);
        assertTrue(result);
        assertEquals(10, laptop.getBatteryLife());
    }

    @Test
    public void testGraphicsProcessor() {
        GamingLaptop laptop = new GamingLaptop("ASUS", 17.3, 32, 1024, 8, 100, "NVIDIA GeForce RTX 3080", 2);
        assertEquals("NVIDIA GeForce RTX 3080", laptop.getGraphicsProcessor());
        laptop.setGraphicsProcessor("new graphics");
        assertEquals("new graphics", laptop.getGraphicsProcessor());
    }

    @Test
    public void testFansNumber() {
        GamingLaptop laptop = new GamingLaptop("ASUS", 17.3, 32, 1024, 8, 100, "NVIDIA GeForce RTX 3080", 2);
        assertEquals(2, laptop.getFansNumber());
        laptop.setFansNumber(3);
        assertEquals(3, laptop.getFansNumber());
    }

}

