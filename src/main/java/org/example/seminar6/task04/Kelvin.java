package org.example.seminar6.task04;

public class Kelvin implements Converter {
    /**
     * @param value температура в Цильсиях
     * @return температура в Кельвинах
     */

    @Override
    public double convertValue(double value) {
        return value + 273.15;
    }
}
