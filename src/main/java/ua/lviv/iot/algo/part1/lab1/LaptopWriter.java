package ua.lviv.iot.algo.part1.lab1;

import ua.lviv.iot.algo.part1.lab1.models.Laptop;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class LaptopWriter {

    public static final String LAPTOP_FILE_NAME = "laptops.csv";
    public static final int CHUNK_SIZE = 100;

    public void writeToFile(final List<Laptop> laptops) throws IOException {
        if (laptops == null || laptops.isEmpty()) {
            throw new IllegalArgumentException(
                    "Список ноутбуків не може бути порожнім або null");
        }

        laptops.sort(Comparator.comparing(laptop -> laptop.getClass().getSimpleName()));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LAPTOP_FILE_NAME))) {
            String prevouslyWrittenClass = null;
            for (var laptop : laptops) {
                if (laptop.getClass().getSimpleName() != prevouslyWrittenClass) {
                    writer.write(laptop.getHeaders());
                    writer.newLine();
                    prevouslyWrittenClass = laptop.getClass().getSimpleName();
                }
                writer.write(laptop.toCSV());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
