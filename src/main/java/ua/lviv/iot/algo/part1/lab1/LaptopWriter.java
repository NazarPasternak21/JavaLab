package ua.lviv.iot.algo.part1.lab1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LaptopWriter {

    public static final String LAPTOP_FILE_NAME = "laptops.csv";
    public static final int CHUNK_SIZE = 100;

    public void writeToFile(List<Laptop> laptops) throws IOException {
        if (laptops == null || laptops.isEmpty()) {
            throw new IllegalArgumentException("Список ноутбуків не може бути порожнім або null");
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LAPTOP_FILE_NAME))) {
            Map<Class<? extends Laptop>, String> headersMap = new HashMap<>();

            for (int i = 0; i < laptops.size(); i += CHUNK_SIZE) {
                int blockEndIndex = Math.min(i + CHUNK_SIZE, laptops.size());
                List<Laptop> laptopsBlock = new ArrayList<>(laptops.subList(i, blockEndIndex));

                for (Laptop laptop : laptopsBlock) {
                    Class<? extends Laptop> laptopClass = laptop.getClass();
                    if (!headersMap.containsKey(laptopClass)) {
                        String headers = laptop.getHeaders();
                        writer.write(headers);
                        writer.newLine();
                        headersMap.put(laptopClass, headers);
                    }
                    String csv = laptop.toCSV();
                    writer.write(csv);
                    writer.newLine();
                }
                writer.newLine(); // Додатковий рядок між блоками ноутбуків
            }
            System.out.println("Запис успішно завершено.");
        } catch (IOException e) {
            System.out.println("Помилка запису у файл: " + e.getMessage());
            throw e;
        }
    }
}