package org.example;

import java.util.List;

public class RucksackReorganization {

    public int calculateTotalPriority(List<Rucksack> rucksacks) {
        int totalPriority = 0;
        for (Rucksack rucksack : rucksacks) {
            char commonItem = rucksack.findCommonItem();
            totalPriority += Rucksack.getPriority(commonItem);
        }
        return totalPriority;
    }
}
