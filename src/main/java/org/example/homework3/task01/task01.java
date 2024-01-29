package org.example.homework3.task01;

import java.util.Arrays;

public class task01 {
    public static int[] mergeSort(int[] a) {
        if (a.length <= 1) return a;
        int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
        int[] right = Arrays.copyOfRange(a, left.length, a.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int resIn = 0, leftIn = 0, rightIn = 0;
        int[] result = new int[left.length + right.length];

        while (leftIn < left.length && rightIn < right.length)
            if (left[leftIn] < right[rightIn])
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        while (resIn < result.length)
            if (leftIn != left.length)
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        return result;
    }

    public static void main(String[] args) {
        int[] a = {5, 1, 6, 2, 3, 4};
//        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(task01.mergeSort(a));
        System.out.println(itresume_res);
    }

}
