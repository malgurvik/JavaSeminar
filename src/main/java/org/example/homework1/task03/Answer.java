package org.example.homework1.task03;

import java.util.Scanner;
import java.io.IOException;

/**
 * Реализуйте простой калькулятор
 * В методе calculate класса Calculator реализовать калькулятор, который будет
 * выполнять математические операции (+, -, *, /) над двумя целыми числами и
 * возвращать результат вещественного типа.
 * В классе Printer необходимо реализовать проверку переданного оператора, при
 * некорректном операторе программа должна вывести сообщение об
 * ошибке "Некорректный оператор: 'оператор'".
 * Аргументы, передаваемые в метод/функцию:
 * '3'  7  2  16
 * '+'  -  *  /
 * '7'  3  9  4
 * На выходе:
 * 10.0
 */
public class Answer {
    static int addition(int a, int b) {
        return a + b;
    }

    static int subtraction(int a, int b) {
        return a - b;
    }

    static int multiplication(int a, int b) {
        return a * b;
    }

    static double division(int a, int b) {
        if (b == 0) return -1;
        return (double) a / b;
    }

    static double calculate(char op, int a, int b) {
        double result = 0;
        switch (op) {
            case '+':
                result = addition(a, b);
                break;
            case '-':
                result = subtraction(a, b);
                break;
            case '*':
                result = multiplication(a, b);
                break;
            case '/':
                result = division(a, b);
                break;

        }
        return result;
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num A: ");
        int a = scanner.nextInt();
        System.out.println("Enter operation: ");
        char op = (char) System.in.read();
        if (op != '+' && op != '-' && op != '*' && op != '/') {
            System.out.println("Некорректный оператор: " + op);
            return;
        }
        System.out.println("Enter num B: ");
        int b = scanner.nextInt();
        System.out.println(calculate(op, a, b));


    }
}
