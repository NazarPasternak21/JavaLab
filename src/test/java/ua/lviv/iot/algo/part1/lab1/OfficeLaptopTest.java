package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OfficeLaptopTest {

    @Test
    void testReplaceBattery() {
        OfficeLaptop laptop = new OfficeLaptop("Lenovo", 17.3, 16, 1024, 6, 100, "black", 25000);
        Assertions.assertTrue(laptop.replaceBattery(10));
        Assertions.assertEquals(10, laptop.getBatteryLife());
        Assertions.assertEquals(100, laptop.getBatteryLevel());
    }
    @Test
    void testSetters() {
        OfficeLaptop laptop = new OfficeLaptop();
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
        laptop.setColor("black");
        Assertions.assertEquals("black", laptop.getColor());
        laptop.setPrice(25000);
        Assertions.assertEquals(25000, laptop.getPrice());
    }
}
