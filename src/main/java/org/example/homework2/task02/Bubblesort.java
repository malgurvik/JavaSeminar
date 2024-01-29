package org.example.homework2.task02;
//import java.io.FileReader;
//import java.io.BufferedReader;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class Bubblesort {
    private static final Logger logger;

    static {
        System.setProperty("java.util.logging.SimpleFormatter.format",
                "%1$tF %1$tR %5$s %n");
        logger = Logger.getLogger(Bubblesort.class.getName());
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 8, 3, 1};
        sort(arr);
    }

    public static void sort(int[] arr) {
        try {
            FileHandler fileHandler = new FileHandler("log.txt");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);

            for (int i = 0; i < arr.length - 1; i++) {
                boolean swapped = false;
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                        swapped = true;
                    }
                }
                logger.info(Arrays.toString(arr));
//                if (!swapped) {
//                    break;
//                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
