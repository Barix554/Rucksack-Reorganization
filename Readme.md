# Advent of Code 2022 - Day 3: Rucksack Reorganization

This project is a Java solution for the Advent of Code 2022, Day 3 challenge.

## Description

Each Elf has a rucksack with two compartments. Every item type is represented by a single letter (`a-z` for lowercase, `A-Z` for uppercase).

The problem is that exactly one item type per rucksack is misplaced and appears in both compartments. The goal is to:

* Identify the item type that appears in both compartments of each rucksack.
* Calculate its priority:
    * Lowercase letters `a-z` have priorities 1-26.
    * Uppercase letters `A-Z` have priorities 27-52.
* Compute the sum of priorities for all rucksacks.

The program reads a list of rucksack contents from `input.txt`, computes the total priority of misplaced items, and prints the result.

## Project Structure


```
Rucksack_Reorganization/
├── pom.xml
├── input.txt
└── src/
    ├── main/java/org/example/
    │   ├── Main.java
    │   ├── Rucksack.java
    │   └── RucksackReorganization.java
    └── test/java/org/example/
        └── RucksackTest.java

```

## How to Run

1. Ensure Java 17 (or later) and Maven are installed.
2. Place your input file as `Rucksack_Reorganization/input.txt`.
3. Compile and run using Maven:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="org.example.Main"
```

## Run tests:

```
mvn test
```
## Example
Example input.txt
```
vJrwpWtwJgWrhcsFMMfFFhFp
jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
PmmdzqPrVvPwwTWBwg
wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
ttgJtRGJQctTZtZT
CrZsJsPPZsGzwwsLwLmpwMDw
```
Expected output:
```
Suma priorytetów: 157
```
## License

This project is open source and free to use.
## Author

Bartosz Kowalski
