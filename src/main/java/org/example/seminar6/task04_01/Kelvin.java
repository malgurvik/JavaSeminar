package org.example.seminar6.task04_01;

public class Kelvin extends Converter{
    /**
     *
     * @param value температура в Цильсиях
     * @return температура в Кельвинах
     */

    @Override
    public double convertValue(double value) {
        return value + 273.15;
    }
}
