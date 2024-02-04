package org.example.homework4.task03;

import java.io.IOException;
import java.util.Scanner;

public class task03 {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter operation: ");
        char op = (char) System.in.read();
        System.out.println("Enter num A: ");
        int a = scanner.nextInt();
        System.out.println("Enter num B: ");
        int b = scanner.nextInt();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
        System.out.println("Enter operation: ");
        char op2 = (char) System.in.read();
        System.out.println("Enter num A2: ");
        int a2 = scanner.nextInt();
        System.out.println("Enter num B2: ");
        int b2 = scanner.nextInt();
        double result2 = calculator.calculate(op2, a2, b2);
        System.out.println(result2);
        System.out.println("Enter operation: ");
        char undo = (char) System.in.read();
        double prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}
