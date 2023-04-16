package ua.lviv.iot.algo.part1.lab1;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentLaptopTest {

    @Test
    public void testReplaceBattery() {
        StudentLaptop laptop = new StudentLaptop("Lenovo", 15.6, 16, 1024, 8, 100, "Intel Core i5-10300h", "China");
        boolean result = laptop.replaceBattery(10);
        assertTrue(result);
        assertEquals(10, laptop.getBatteryLife());
    }
    @Test
    public void testProcessor() {
        StudentLaptop laptop = new StudentLaptop("Lenovo", 15.6, 16, 1024, 8, 100, "Intel Core i5-10300h", "China");
        assertEquals("Intel Core i5-10300h", laptop.getProcessor());
        laptop.setProcessor("new processor");
        assertEquals("new processor", laptop.getProcessor());
    }
    @Test
    public void testProducingCountry() {
        StudentLaptop laptop = new StudentLaptop("Lenovo", 15.6, 16, 1024, 8, 100, "Intel Core i5-10300h", "China");
        assertEquals("China", laptop.getProducingCountry());
        laptop.setProducingCountry("new producing country");
        assertEquals("new producing country", laptop.getProducingCountry());
    }
}
