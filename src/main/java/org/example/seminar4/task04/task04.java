package org.example.seminar4.task04;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка.
 */
public class task04 {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>(Arrays.asList(1, -2, 3, -4, 5, 6));
        System.out.println("getSumEven(integerList) = " + getSumEven(integerList));
        System.out.println("getSumOdd(integerList) = " + getSumOdd(integerList));
        removeNegative(integerList);
        System.out.println("integerList = " + integerList);
    }

    private static void removeNegative(List<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) < 0) {
                integerList.remove(i);
                i--;
            }
        }
    }

    private static Integer getSumEven(List<Integer> integerList) {
        int sum = 0;
        for (Integer item : integerList) {
            if (item % 2 == 0) {
                sum += item;
            }
        }
        return sum;
    }

    private static Integer getSumOdd(List<Integer> integerList) {
        int sum = 0;
        for (Integer item : integerList) {
            if (item % 2 != 0) {
                sum += item;
            }
        }
        return sum;
    }
}
