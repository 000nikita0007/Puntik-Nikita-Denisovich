package Lesson_5_1;

import java.util.Arrays;
import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        int sum = 0;
        int n = new Scanner(System.in).nextInt();
        int m = new Scanner(System.in).nextInt();
        int array[][] = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * 100));
            }
        }
        System.out.println(Arrays.deepToString(array).replace("], ", "]\n"));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }
        System.out.println("Summa = " +sum);
    }
}
