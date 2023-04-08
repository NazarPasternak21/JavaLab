package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentLaptopTest {

    @Test
    void testReplaceBattery() {
        StudentLaptop laptop = new StudentLaptop("Lenovo", 15.6, 16, 1024, 8, 100, "Intel Core i5-10300h", "China");
        Assertions.assertTrue(laptop.replaceBattery(10));
        Assertions.assertEquals(10, laptop.getBatteryLife());
        Assertions.assertEquals(100, laptop.getBatteryLevel());
    }
    @Test
    void testSetters() {
        StudentLaptop laptop = new StudentLaptop();
        laptop.setModel("Lenovo");
        Assertions.assertEquals("Lenovo", laptop.getModel());
        laptop.setScreenSize(15.6);
        Assertions.assertEquals(15.6, laptop.getScreenSize());
        laptop.setRam(16);
        Assertions.assertEquals(16, laptop.getRam());
        laptop.setStorage(1024);
        Assertions.assertEquals(1024, laptop.getStorage());
        laptop.setBatteryLife(8);
        Assertions.assertEquals(8, laptop.getBatteryLife());
        laptop.setBatteryLevel(100);
        Assertions.assertEquals(100, laptop.getBatteryLevel());
        laptop.setProcessor("Intel Core i5-10300h");
        Assertions.assertEquals("Intel Core i5-10300h", laptop.getProcessor());
        laptop.setProducing_Country("China");
        Assertions.assertEquals("China", laptop.getProducing_Country());
    }
}
