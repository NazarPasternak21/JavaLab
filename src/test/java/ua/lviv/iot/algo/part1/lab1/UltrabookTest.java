package ua.lviv.iot.algo.part1.lab1;

import org.junit.Test;
import static org.junit.Assert.*;

public class UltrabookTest {

    @Test
    public void testReplaceBattery() {
        Ultrabook laptop = new Ultrabook("ASUS", 15.6, 8, 512, 12, 100, 1.8, 1.7);
        boolean result = laptop.replaceBattery(10);
        assertFalse(result);
        assertEquals(100, laptop.getBatteryLife());
    }
    @Test
    public void testWeight() {
        Ultrabook laptop = new Ultrabook("ASUS", 15.6, 8, 512, 12, 100, 1.8, 1.7);
        assertEquals(1.8, laptop.getWeight(), 0.01);
        laptop.setWeight(1.9);
        assertEquals(1.9, laptop.getWeight(), 0.01);
    }
    @Test
    public void testThickness() {
        Ultrabook laptop = new Ultrabook("ASUS", 15.6, 8, 512, 12, 100, 1.8, 1.7);
        assertEquals(1.7, laptop.getThickness(), 0.01);
        laptop.setThickness(1.8);
        assertEquals(1.8, laptop.getThickness(), 0.01);
    }
}
