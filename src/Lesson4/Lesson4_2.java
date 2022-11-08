package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson4_2 {
    public static void main(String[] args) {
        System.out.println("Enter massive size  ");
        int x = new Scanner(System.in).nextInt();
        int[] array = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100));
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int min = array[0];
        int max = array[array.length - 1];
        int avg = array[array.length / 2];
        System.out.println("min=" + min + "\n" + "max= " + max + "\n" + "avg= " + avg);
    }
}
