package org.example;

import java.util.HashSet;
import java.util.Set;

public class Rucksack {
    private String firstCompartment;
    private String secondCompartment;

    public Rucksack(String items) {
        int halfLength = items.length() / 2;
        this.firstCompartment = items.substring(0, halfLength);
        this.secondCompartment = items.substring(halfLength);
    }

    public char findCommonItem() {
        Set<Character> firstSet = new HashSet<>();
        for (char c : firstCompartment.toCharArray()) {
            firstSet.add(c);
        }

        for (char c : secondCompartment.toCharArray()) {
            if (firstSet.contains(c)) {
                return c;
            }
        }
        throw new RuntimeException("No common item found!");
    }

    public static int getPriority(char item) {
        if (Character.isLowerCase(item)) {
            return item - 'a' + 1;
        } else {
            return item - 'A' + 27;
        }
    }
}
