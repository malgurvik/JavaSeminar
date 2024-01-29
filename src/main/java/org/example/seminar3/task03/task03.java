package org.example.seminar3.task03;
//Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
//его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.).
//Найти:
//- количество кубиков желтого цвета и их суммарный объем;
//- количество деревянных кубиков с ребром 3 см

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task03 {
    public static void main(String[] args) {
        List<Cube> cubeList = new ArrayList<>(Arrays.asList(
                new Cube(3, "green", "wood"),
                new Cube(3, "red", "metal"),
                new Cube(3, "yellow", "paper"),
                new Cube(3, "yellow", "wood")));

        int countColor = 0;
        int sum = 0;
        int countMaterial = 0;
        for (Cube cube : cubeList) {
            if (cube.getColor().equals("yellow")) {
                countColor++;
                sum += cube.getVolume();
            }
            if (cube.getMaterial().equals("wood") && cube.getSize() == 3) {
                countMaterial++;
            }
        }
        System.out.println("count = " + countColor);
        System.out.println("sum = " + sum);
        System.out.println("countMaterial = " + countMaterial);
    }
}
