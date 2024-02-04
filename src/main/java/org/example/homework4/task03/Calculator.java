package org.example.homework4.task03;

import java.util.ArrayDeque;
import java.util.Deque;

class Calculator {
    public Deque<Double> resultsStack = new ArrayDeque<>();
    public double prevResult;

    public double calculate(char op, int a, int b) {
        if (op == '<') {
            if (resultsStack.size() >= 2) {
                resultsStack.pop();
                prevResult = resultsStack.peek();
            }
            return prevResult;
        } else {
            double result = performOperation(op, a, b);
            resultsStack.push(result);
            prevResult = result;
            return result;
        }
    }
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

    static double performOperation(char op, int a, int b) {
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
}


