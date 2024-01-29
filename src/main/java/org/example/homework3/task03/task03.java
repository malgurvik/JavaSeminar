package org.example.homework3.task03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//import java.util.Comparator;

/**
 * Реализуйте метод, который принимает на вход целочисленный массив arr:
 * - Создаёт список ArrayList, заполненный числами из исходого массива arr.
 * - Сортирует список по возрастанию и выводит на экран.
 * - Находит минимальное значение в списке и выводит на экран - Minimum is {число}
 * - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
 * - Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
 * Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:
 * Integer[] arr - массив целых чисел.
 * Пример.
 * Исходный массив:
 * 4, 2, 7, 5, 1, 3, 8, 6, 9
 * Результаты:
 * [1, 2, 3, 4, 5, 6, 7, 8, 9]
 * Minimum is 1
 * Maximum is 9
 */
public class task03 {
    public static void analyzeNumbers(Integer[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
//        arrayList.sort(Comparator.naturalOrder());
        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println("Minimum is " + arrayList.get(0));
        System.out.println("Maximum is " + arrayList.get(arrayList.size() - 1));
        int sum = 0;
        for (Integer integer : arrayList) {
            sum += integer;

        }
        System.out.println("Average is = " + (double) sum / arrayList.size());
    }

    public static void main(String[] args) {
//        Integer[] arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        Integer[] arr = new Integer[]{-2, -1, 0, 1, 2, 3, 4, 5};
        analyzeNumbers(arr);
    }
}
