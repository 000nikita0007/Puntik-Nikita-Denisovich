package Lesson_5_1;

import java.util.Arrays;
import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        System.out.println("Enter massive size n x n");
        int n = new Scanner(System.in).nextInt();
        int array[][] = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * 100));
            }
        }
        System.out.println(Arrays.deepToString(array).replace("], ", "]\n"));
        System.out.println("Первая диагональ:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }
            }

        }
        System.out.println("\n" + "Вторая диагональ:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0, x = array[i].length - 1; j < array[i].length; j++, x--) {
                if (i == x) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}