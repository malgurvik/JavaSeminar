package org.example.seminar6.task01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 1) Дан массив чисел, посчитать процент уникальных чисел.
 * процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */
public class task01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,5,7,6,9};

        unicProcent(arr);
    }

    /**
     * @apiNote Рассчитывает процент уникальных чисел
     * @param arr массив чисел
     */
    private static void unicProcent(int[] arr) {
        Set<Integer> set = new HashSet<>(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)));
//        Set<Integer> set = new HashSet<>();
//        for (int item : arr) {
//            set.add(item);
//        }
        System.out.println("set = " + set);
        int unicProcent = set.size()*100/ arr.length;
        System.out.println("unicProcent = " + unicProcent+"%");
    }
}
