package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UltrabookTest {

    @Test
    void testReplaceBattery() {
        Ultrabook laptop = new Ultrabook("ASUS", 15.6, 8, 512, 12, 100, 1.8, 1.7);
        Assertions.assertFalse(laptop.replaceBattery(10));
    }

    @Test
    void testSetters() {
        Ultrabook laptop = new Ultrabook();
        laptop.setModel("ASUS");
        Assertions.assertEquals("ASUS", laptop.getModel());
        laptop.setScreenSize(15.6);
        Assertions.assertEquals(15.6, laptop.getScreenSize());
        laptop.setRam(8);
        Assertions.assertEquals(8, laptop.getRam());
        laptop.setStorage(512);
        Assertions.assertEquals(512, laptop.getStorage());
        laptop.setBatteryLife(12);
        Assertions.assertEquals(12, laptop.getBatteryLife());
        laptop.setBatteryLevel(100);
        Assertions.assertEquals(100, laptop.getBatteryLevel());
        laptop.setWeight(1.8);
        Assertions.assertEquals(1.8, laptop.getWeight());
        laptop.setThickness(1.7);
        Assertions.assertEquals(1.7, laptop.getThickness());
    }
}
