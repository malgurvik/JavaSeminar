package org.example.homework5.task02;

public class task02 {
    public static void main(String[] args) {
        String name1 = "Elena";
        String name2 = "Elena";
        String name3 = "Elena";
        String name4 = "Elena";
        String name5 = "Ivan";

        NamesCounter namesCounter = new NamesCounter();
        namesCounter.addName(name1);
        namesCounter.addName(name2);
        namesCounter.addName(name3);
        namesCounter.addName(name4);
        namesCounter.addName(name5);

        namesCounter.showNamesOccurrences();
    }
}
