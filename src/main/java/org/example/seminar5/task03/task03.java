package org.example.seminar5.task03;

import java.util.*;

/**
 * 3) Написать перевод из Римских цифр в арабские:
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */
public class task03 {
    public static void main(String[] args) {
        System.out.println("LVIII = "  + getArabNumb("LVIII"));
        System.out.println("MCMXCIV = "  + getArabNumb("MCMXCIV"));
    }

    public static int getArabNumb(String str) {
        Map<Character, Integer> nums = new HashMap<>(Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        ));
        System.out.println("nums = " + nums);
        int result = nums.get(str.charAt(str.length()-1)) ;
        for (int i = 0; i < str.length()-1; i++) {
            if (nums.get(str.charAt(i)) < nums.get(str.charAt(i+1))){
                result-= nums.get(str.charAt(i));
            }else {
                result+= nums.get(str.charAt(i));
            }
        }
        return result;
    }
}
