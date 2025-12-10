package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Rucksack> rucksacks = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("input.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (!line.isEmpty()) {
                    rucksacks.add(new Rucksack(line));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Plik input.txt nie został znaleziony!");
            return;
        }

        RucksackReorganization reorganization = new RucksackReorganization();
        int totalPriority = reorganization.calculateTotalPriority(rucksacks);
        System.out.println("Suma priorytetów: " + totalPriority);
    }
}
