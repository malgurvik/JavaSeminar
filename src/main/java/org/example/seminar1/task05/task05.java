package org.example.seminar1.task05;

/**
 * Дан массив nums. Мы определяем текущую сумму массива как  runningSum[i] = sum(nums[0]…nums[i]).
 * Вернуть текущую сумму nums.
 * Пример 1:
 * Ввод: nums = [1,2,3,4]
 * Выход: [1,3,6,10]
 * Объяснение: Текущая сумма получается следующим образом: [1, 1+2, 1+2+3, 1+2+ 3+4].
 * Пример 2:
 * Ввод: nums = [1,1,1,1,1]
 * Вывод: [1,2,3,4,5]
 * Объяснение: Текущая сумма получается следующим образом: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 * Пример 3:
 * Ввод: числа = [3,1,2,10,1]
 * Вывод: [3,4,6,16,17]
 * Ограничения:
 * 1 <= nums.length <= 1000
 * -10^6 <= nums[i] <= 10^6
 */
public class task05 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 10, 1};
        int[] result = new int[arr.length];
        result[0] = arr[0];

        for (int i = 1; i < result.length; i++) {
            result[i] += arr[i] + result[i - 1];

        }
        for (int i = 0; i < result.length; i++) {
            System.out.println("result[i] = " + result[i]);

        }

    }
}
