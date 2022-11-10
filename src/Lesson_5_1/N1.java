package Lesson_5_1;

import java.util.Arrays;

public class N1 {
    public static void main(String[] args) {
        String [][] array = new String[8][8];
        for (int i = 0; i< array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if ((i + j) % 2 == 0) array[i][j] = "W";
                else array[i][j] = "B";
            }
        }
        System.out.println(Arrays.deepToString(array).replace("], ", "]\n"));    }
}
