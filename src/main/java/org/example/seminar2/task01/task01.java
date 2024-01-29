package org.example.seminar2.task01;

/**
 * Дана последовательность из N целых чисел. Найти сумму чисел,
 * оканчивающихся на 5, перед которыми идет четное число.
 */

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        int sum = getSum(scanner, n);
        System.out.println("Summ of elements");
        System.out.println(getSum(scanner, n));
    }

    /**
     *
     * @param scanner
     * @param n
     * @return Сумма
     * @APInote  * 1) Дана последовательность из N целых чисел. Найти сумму чисел,
     *  * оканчивающихся на 5, перед которыми идет четное число.
     */
    private static int getSum(Scanner scanner, int n) {
        int sum = 0;
        int current = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int next = scanner.nextInt();
            if (next % 10 == 5 && current % 2 == 0) {
                sum += next;
            }
            current = next;
        }
        return sum;
    }
}
