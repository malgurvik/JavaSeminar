package org.example.seminar1.task01;
/**
 *  Учитывая целое число n, верните разницу между произведением его цифр и суммой его цифр.
 *  Пример 1:
 *  Вход: n = 234
 *  Выход: 15
 *  Пояснение:
 *  Произведение цифр = 2 * 3 * 4 = 24
 *  Сумма цифр = 2 + 3 + 4 = 9
 *  Результат = 24 - 9 = 15
 *  Пример 2:
 *  Ввод: n = 4421
 *  Выход: 21
 *  Пояснение:
 *  Произведение цифр = 4 * 4 * 2 * 1 = 32.
 *  Сумма цифр = 4 + 4 + 2 + 1 = 11
 *  Результат = 32 - 11 = 21
 *  Ограничения:
 *  1 <= n <= 10^5
 */

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        int result = resultPrMinusSum(n);
        System.out.println("Outcome: " + result);
    }

    public static int resultPrMinusSum(int n) {
        int pr = 1;
        int sum = 0;
        while (n != 0) {
            pr *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return pr - sum;
    }
}
