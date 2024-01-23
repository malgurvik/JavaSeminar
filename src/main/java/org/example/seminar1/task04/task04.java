package org.example.seminar1.task04;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(isSimmetr(arr));
    }

    /**
     * @param arr массив для проверки на симметричность
     * @return результат проверки
     * @apiNote Дан массив целых чисел.
     * Верно ли, что массив является симметричным.
     */
    private static boolean isSimmetr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}

