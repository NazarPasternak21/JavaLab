package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GamingLaptopTest {

    @Test
    void testReplaceBattery() {
        GamingLaptop laptop =new GamingLaptop("ASUS", 17.3, 32, 1024, 8, 100, "NVIDIA GeForce RTX 3080", 2);
        Assertions.assertTrue(laptop.replaceBattery(10));
        Assertions.assertEquals(10, laptop.getBatteryLife());
        Assertions.assertEquals(100, laptop.getBatteryLevel());
    }
    @Test
    void testSetters() {
        GamingLaptop laptop = new GamingLaptop();
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
        laptop.setGraphicsProcessor("NVIDIA GeForce RTX 3080");
        Assertions.assertEquals("NVIDIA GeForce RTX 3080", laptop.getGraphicsProcessor());
        laptop.setFansNumber(2);
        Assertions.assertEquals(2, laptop.getFansNumber());
    }
}
