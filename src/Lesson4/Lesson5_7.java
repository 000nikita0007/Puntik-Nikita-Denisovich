package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson5_7 {
    public static void main(String[] args) {
        boolean isSorted = false;
        int buf = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 15));
        }
        System.out.println(Arrays.toString(array));
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
