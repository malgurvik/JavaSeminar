package org.example.seminar6.task03;

import java.util.*;

/**
 * 3) Найти пересечения слов в массивах и указать их общее количество.
 * Пример:
 * Mas1= [“qwe”,”asd”,”qwe”,”x”]
 * Mas2=[“qwe”,”v”]
 * Результат:
 * qwe=3
 */
public class task03 {
    public static void main(String[] args) {
        String[] arr = {"qwe", "asd", "qwe", "x"};
        String[] arr2 = {"qwe", "v"};
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        set.retainAll(new HashSet<>(Arrays.asList(arr2)));
        List<String> lst = new ArrayList<>(Arrays.asList(arr));
        lst.addAll(Arrays.asList(arr2));

        for (String elem : set) {
            int count = 0;
            for (String item : lst) {
                if (elem == item) {
                    count++;
                }
            }
            System.out.println("count = " + elem + "" + count);
        }

    }
}
