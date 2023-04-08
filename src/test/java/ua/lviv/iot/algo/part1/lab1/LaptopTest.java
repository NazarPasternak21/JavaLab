package ua.lviv.iot.algo.part1.lab1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LaptopTest {

    @Test
    void testReplaceBattery() {
        Laptop laptop = new GamingLaptop();
        boolean result = laptop.replaceBattery(10);
        assertEquals(true, result);
    }

}
