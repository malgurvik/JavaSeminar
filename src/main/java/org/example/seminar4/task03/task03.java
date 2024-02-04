package org.example.seminar4.task03;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Заменить некратные 3 элементы списка, суммой нечетных элементов.
 */
public class task03 {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("getSumEven(integerList) = " + getSumEven(integerList));
        System.out.println("getSumOdd(integerList) = " + getSumOdd(integerList));
        getDivThree(integerList);
        System.out.println("getDiv " + integerList);
    }

    private static void getDivThree(List<Integer> integerList) {
        int sum = getSumOdd(integerList);
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) % 3 != 0) {
                integerList.set(i, sum);
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
