package org.example.seminar5.task02;

import java.util.*;

/**
 * 2)	Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
 * В противном случае (false).
 */
public class task02 {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 8, 6, 2, 4, 9));


        Map<Integer, Integer> dubs = new HashMap<>();
        for (Integer i : lst) {
            dubs.putIfAbsent(i, 0);
            dubs.put(i, dubs.get(i) + 1);
        }

        System.out.println(containsDouble(dubs));
    }

    private static boolean containsDouble(Map<Integer, Integer> dubs) {
        for (Map.Entry<Integer, Integer> elem : dubs.entrySet()){
            if (elem.getValue() > 1){
                return true;
            }
        }
        return false;
    }

//    public static void main(String[] args) {
//        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 2, 3, 3));
//
//        System.out.println(containsDouble(lst));
//    }
//
//    public static boolean containsDouble(List<Integer> lst) {
//        Map<Integer, Integer> dubs = new HashMap<>();
//        for (Integer i : lst) {
//            if (!dubs.containsKey(i)) {
//                dubs.put(i, 1);
//            } else {
//                return true;
//            }
//        }
//        return false;
//    }
}
