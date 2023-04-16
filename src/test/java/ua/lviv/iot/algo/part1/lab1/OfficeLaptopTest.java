package ua.lviv.iot.algo.part1.lab1;

import org.junit.Test;
import static org.junit.Assert.*;

public class OfficeLaptopTest {

    @Test
    public void testReplaceBattery() {
        OfficeLaptop laptop = new OfficeLaptop("Lenovo", 17.3, 16, 1024, 6, 100, "black", 25000);
        boolean result = laptop.replaceBattery(10);
        assertTrue(result);
        assertEquals(10, laptop.getBatteryLife());
    }
    @Test
    public void testColor() {
        OfficeLaptop laptop = new OfficeLaptop("Lenovo", 17.3, 16, 1024, 6, 100, "black", 25000);
        assertEquals("black", laptop.getLaptopColor());
        laptop.setLaptopColor("new graphics");
        assertEquals("new graphics", laptop.getLaptopColor());
    }
    @Test
    public void testPrice() {
        OfficeLaptop laptop = new OfficeLaptop("Lenovo", 17.3, 16, 1024, 6, 100, "black", 25000);
        assertEquals(25000, laptop.getLaptopPrice(), 0.01);
        laptop.setLaptopPrice(25000);
        assertEquals(25000, laptop.getLaptopPrice(), 0.01);
    }
}
