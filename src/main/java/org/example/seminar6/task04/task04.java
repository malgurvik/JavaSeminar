package org.example.seminar6.task04;


/**
 * 4) Напишите интерфейс Converter для конвертации из градусов по Цельсию в
 * Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод
 * интерфейса, для валидного перевода величин. Метод для конвертации назовите "convertValue".
 */
public class task04 {
    public static void main(String[] args) {
        Converter converter = new Celsius();
        System.out.println("Celsius = " + converter.convertValue(100));
        Converter converter1 = new Fahrenheit();
        System.out.println("Fahrenheit = " + converter1.convertValue(100));
        Converter converter2 = new Kelvin();
        System.out.println("Kelvin = " + converter2.convertValue(100));

    }
}
