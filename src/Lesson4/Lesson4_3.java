package Lesson4;

import java.util.Arrays;

public class Lesson4_3 {
    public static void main(String[] args) {
        int[] array1 = new int[]{3, 10, 5, 8, 12};
        int[] array2 = new int[]{4, 12, 6, 32, 8};
        double avg1, avg2 ,sum1 = 0, sum2 = 0;
        System.out.println(Arrays.toString(array1) + "\n" + Arrays.toString(array1));
        for (int i = 0; i < array1.length; i++) {
            sum1 = sum1 + array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            sum2 = sum2 + array2[i];
        }
        System.out.println("Sum1=" + sum1 + "\nSum2=" + sum2);
        avg1 = sum1 / array1.length;
        avg2 = sum2 / array2.length;
        System.out.println("avg1=" + avg1 + "\navg2=" + avg2);
    }

}
