package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class RucksackTest {

    @Test
    public void testFindCommonItem() {
        Rucksack r1 = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp");
        assertEquals('p', r1.findCommonItem());

        Rucksack r2 = new Rucksack("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL");
        assertEquals('L', r2.findCommonItem());

        Rucksack r3 = new Rucksack("PmmdzqPrVvPwwTWBwg");
        assertEquals('P', r3.findCommonItem());
    }

    @Test
    public void testGetPriority() {
        assertEquals(1, Rucksack.getPriority('a'));
        assertEquals(26, Rucksack.getPriority('z'));
        assertEquals(27, Rucksack.getPriority('A'));
        assertEquals(52, Rucksack.getPriority('Z'));
        assertEquals(16, Rucksack.getPriority('p'));
        assertEquals(38, Rucksack.getPriority('L'));
    }

    @Test
    public void testCalculateTotalPriority() {
        List<Rucksack> rucksacks = Arrays.asList(
                new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp"),
                new Rucksack("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL"),
                new Rucksack("PmmdzqPrVvPwwTWBwg"),
                new Rucksack("wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn"),
                new Rucksack("ttgJtRGJQctTZtZT"),
                new Rucksack("CrZsJsPPZsGzwwsLwLmpwMDw")
        );

        RucksackReorganization reorg = new RucksackReorganization();
        int total = reorg.calculateTotalPriority(rucksacks);
        assertEquals(157, total);
    }
}
