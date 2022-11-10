package Lesson_5_1;

import java.util.Arrays;
import java.util.Scanner;

public class N5 {
    public static void main(String[] args) {
        boolean isSorted = false;
        int buf;
        System.out.println("Enter massive size n x m");
        int n = new Scanner(System.in).nextInt();
        int m = new Scanner(System.in).nextInt();
        int array[][] = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * 10));
            }
        }
        System.out.println(Arrays.deepToString(array).replace("], ", "]\n"));
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
        System.out.println(Arrays.deepToString(array).replace("], ", "]\n"));
    }
}
