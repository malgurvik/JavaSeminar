package org.example.homework3.task02;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Дан произвольный массив целых чисел. Создайте список ArrayList, заполненный данными
 * из этого массива. Необходимо удалить из списка четные числа и вернуть результирующий.
 * Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers
 * принимает на вход один параметр: Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>
 * Примеры.
 * Исходный массив:
 * 1, 2, 3, 4, 5, 6, 7, 8, 9
 * Результат:
 * [1, 3, 5, 7, 9]
 * Исходный массив:
 * 2, 4, 6, 8
 * Результат:
 * []
 */
public class task02 {
    public static void removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer integer : arr) {
            if (integer % 2 != 0) {
                arrayList.add(integer);
            }
        }
        System.out.println("arrayList = " + arrayList);
    }

    public static ArrayList<Integer> removeEvenNumbers1(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> numbs = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < numbs.size(); i++) {
            if (numbs.get(i) % 2 == 0) {
                numbs.remove(i);
                i--;
            }
        }
        return numbs;
    }

    public static void main(String[] args) {
//        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] arr = new Integer[]{2, 4, 6, 8};
        removeEvenNumbers(arr);
        System.out.println("removeEvenNumbers1(arr) = " + removeEvenNumbers1(arr));

    }
}
