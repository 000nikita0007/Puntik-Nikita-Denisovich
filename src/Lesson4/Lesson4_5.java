package Lesson4;

import java.util.Arrays;

public class Lesson4_5 {
    public static void main(String[] args) {
        int x = 8;
        int[] array = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100));
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}