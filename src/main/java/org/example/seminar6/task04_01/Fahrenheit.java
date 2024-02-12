package org.example.seminar6.task04_01;

public class Fahrenheit extends Converter{
    /**
     *
     * @param value температура в Цильсиях
     * @return температура по Фаренгейту
     */

    @Override
    public double convertValue(double value) {
        return (value * 1.8) + 32;
    }
}
