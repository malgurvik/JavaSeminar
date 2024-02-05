package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
//        List<Integer> phoneNum = new ArrayList<>();
        phoneBook.put("Ivanov", new ArrayList<>(Arrays.asList(123456)));
        System.out.println("phoneBook = " + phoneBook);
        phoneBook.put("Petrov", new ArrayList<>(Arrays.asList(654321)));
        System.out.println("phoneBook = " + phoneBook);
        if (phoneBook.containsKey("Ivanov")){
            phoneBook.get("Ivanov").add(654321);
        }
        System.out.println("phoneBook = " + phoneBook);

    }
}