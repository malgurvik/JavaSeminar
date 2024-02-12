package org.example.seminar6.task04;

public class Fahrenheit implements Converter {
    /**
     * @param value температура в Цильсиях
     * @return температура по Фаренгейту
     */

    @Override
    public double convertValue(double value) {
        return (value * 1.8) + 32;
    }
}
