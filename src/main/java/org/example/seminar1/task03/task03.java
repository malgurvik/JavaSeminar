package org.example.seminar1.task03;

import java.util.Scanner;

/**
 * Дана строка. Поменять местами ее половины.
 */
public class task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 = str.substring(0, str.length() / 2);
        String str2 = str.substring(str.length() / 2);
        System.out.println(str2 + str1);

    }
}
