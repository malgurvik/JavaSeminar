package org.example.seminar6.task04_01;

import org.example.seminar6.task04.Celsius;
import org.example.seminar6.task04.Converter;
import org.example.seminar6.task04.Fahrenheit;
import org.example.seminar6.task04.Kelvin;

public class task04_01 {
    public static void main(String[] args) {
        Converter converter = new Celsius();
        System.out.println("Celsius = " + converter.convertValue(100));
        Converter converter1 = new Fahrenheit();
        System.out.println("Fahrenheit = " + converter1.convertValue(100));
        Converter converter2 = new Kelvin();
        System.out.println("Kelvin = " + converter2.convertValue(100));

    }
}
