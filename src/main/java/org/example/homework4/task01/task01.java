package org.example.homework4.task01;

import java.util.LinkedList;

/**
 * Дан LinkedList с несколькими элементами разного типа. В методе revert
 * реализуйте разворот этого списка без использования встроенного функционала.
 * Пример
 * // Дан
 * [1, One, 2, Two]
 * // Вывод
 * [1, One, 2, Two]
 * [Two, 2, One, 1]
 */
public class task01 {
    public static void main(String[] args) {
        LinkedList<Object> oll = new LinkedList<>();
        oll.add(1);
        oll.add("One");
        oll.add(2);
        oll.add("Two");
        System.out.println("oll = " + oll);
        revert(oll);
        System.out.println("revert = " + oll);
    }

    private static void revert(LinkedList<Object> oll) {
        for (int i = 0; i < oll.size() / 2; i++) {
            Object temp = oll.get(i);
            oll.set(i, oll.get(oll.size() - i - 1));
            oll.set(oll.size() - i - 1, temp);
        }
    }
}
