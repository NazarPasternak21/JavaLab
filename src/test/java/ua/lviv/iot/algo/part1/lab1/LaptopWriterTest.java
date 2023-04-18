package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LaptopWriterTest {
    private static final String RESULT_FILENAME = "result.csv";
    private static final String EXPECTED_FILENAME = "expected.csv";

    private static LaptopManager manager;
    private static LaptopWriter writer;

    @BeforeAll
    public static void setUp() throws IOException {
        manager = new LaptopManager();
        writer = new LaptopWriter();
        File file = new File(RESULT_FILENAME);
        file.createNewFile();
    }


    @AfterAll
    public static void tearDown() {
        File file = new File(RESULT_FILENAME);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    public void testWriteToFileWithEmptyLaptopList() {
        assertThrows(IllegalArgumentException.class, () -> writer.writeToFile(new ArrayList<>()));
    }

    @Test
    public void testWriteToFileWithListOfLaptops() throws IOException {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new GamingLaptop("ASUS", 17.3, 32, 1024, 8, 100, "NVIDIA GeForce RTX 3080", 2));
        laptops.add(new Ultrabook("ASUS", 15.6, 8, 512, 12, 100, 1.8, 1.7));
        laptops.add(new OfficeLaptop("Lenovo", 17.3, 16, 1024, 6, 100, "black", 25000));
        laptops.add(new StudentLaptop("Lenovo", 15.6, 16, 1024, 8, 100, "Intel Core i5-10300h", "China"));

        writer.writeToFile(laptops);

        File expectedFile = new File(EXPECTED_FILENAME);
        if (!expectedFile.exists()) {
            expectedFile.createNewFile();
        }

        Path expected = expectedFile.toPath();
        Path result = new File(RESULT_FILENAME).toPath();
        assertEquals(-1, Files.mismatch(expected, result));
    }
    @Test
    public void testWriteToFileWithEmptyListLaptop() {
        assertThrows(IllegalArgumentException.class, () -> writer.writeToFile(new ArrayList<Laptop>()));
    }

    @Test
    public void testWriteToFileOverwritingResultFile() throws IOException {
        // Write to result file for the first time
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new GamingLaptop("ASUS", 17.3, 32, 1024, 8, 100, "NVIDIA GeForce RTX 3080", 2));
        writer.writeToFile(laptops);

        // Write to result file again, which should overwrite the previous content
        laptops = new ArrayList<>();
        laptops.add(new GamingLaptop("MSI", 15.6, 16, 512, 6, 80, "NVIDIA GeForce GTX 1660 Ti", 2));
        writer.writeToFile(laptops);

        // Check that the content of the result file matches the expected content
        File expectedFile = new File(EXPECTED_FILENAME);
        if (!expectedFile.exists()) {
            expectedFile.createNewFile();
        }

        Path expected = expectedFile.toPath();
        Path result = new File(RESULT_FILENAME).toPath();
        assertEquals(-1, Files.mismatch(expected, result));
    }

    @Test
    public void testWriteToFileWithNonexistentExpectedFile() throws IOException {
        File expectedFile = new File(EXPECTED_FILENAME);
        if (expectedFile.exists()) {
            expectedFile.delete();
        }

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new OfficeLaptop("Dell", 15.6, 16, 1024, 8, 100, "silver", 30000));
        writer.writeToFile(laptops);

        expectedFile.createNewFile();
        Path expected = expectedFile.toPath();
        Path result = new File(RESULT_FILENAME).toPath();
        assertEquals(-1, Files.mismatch(expected, result));
    }

}
