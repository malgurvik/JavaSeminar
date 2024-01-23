package org.example.homework1.task02;

/**
 * Напишите функцию printPrimeNums, которая выведет на экран все простые числа
 * в промежутке от 1 до 1000, каждое на новой строке.
 * Напишите свой код в методе printPrimeNums класса Answer.
 * Пример
 * 2
 * 3
 * 5
 * 7
 * 11
 * ...
 */
public class Answer {
    public static void main(String[] args) {
//        int n = 2;
//        while (n <= 1000) {
//            int count = 0;
//            for (int i = 2; i < n / 2 + 1; i++) {
//                if (n%i==0){
//                    count++;
//                }
//            }
//            if(count==0) {
//                System.out.println(n);
//            }
//            n++;
//        }
        for (int i = 2; i <= 1000; i++) {
            int count = 0;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}
