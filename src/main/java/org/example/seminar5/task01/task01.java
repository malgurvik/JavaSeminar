package org.example.seminar5.task01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 1)	Посчитать количество вхождений каждого символа в текст.
 */
public class task01 {
    public static void main(String[] args) {
        Map<Character, Integer> mapCh = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (!mapCh.containsKey(str.charAt(i))) {
                mapCh.put(str.charAt(i), 1);
            } else {
                mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
            }
        }
        for (Map.Entry<Character, Integer> elem : mapCh.entrySet()) {
            System.out.println(elem.getKey() + " встретился : " + elem.getValue() + " раз");
        }
    }

//    public static void main(String[] args) {
//        Map<Character, Integer> mapCh = new HashMap<>();
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        for (int i = 0; i < str.length(); i++) {
//            mapCh.putIfAbsent(str.charAt(i), 0);
//            mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
//        }
//        for (Map.Entry<Character, Integer> elem : mapCh.entrySet()) {
//            System.out.println(elem.getKey() + " встретился : " + elem.getValue() + " раз");
//        }
//    }
}
