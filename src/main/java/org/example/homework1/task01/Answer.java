package org.example.homework1.task01;

import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n).
 * Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
 * Если число n < 1 (ненатуральное) метод должен вернуть -1.
 * Пример
 * n = 4 -> 10
 * n = 5 -> 15
 */
public class Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = countNTriangle(n);
        System.out.println(res);

    }

    private static int countNTriangle(int n) {
        if (n < 1) return -1;
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res += i;

        }
        return res;
    }
}
