package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson4_4 {
    public static void main(String[] args) {
        int x = 0;
        int array[] = new int[x];
        int evenNums = 0;
        while (true) {
            System.out.println("Enter massive size 6-10 ");
            x = new Scanner(System.in).nextInt();
            if (x > 5 && x <= 10) {
                array = new int[x];
                System.out.println("Размер массива равен " + array.length);
                break;
            } else {
                System.out.println("Поввториите ввод");
                continue;
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100));
            if (array[i] % 2 == 0) {
                evenNums++;
            }
        }
        System.out.println(Arrays.toString(array));
        int array1[] = new int[evenNums];
        int index = 0;
        for (int i = 0; i < x; i++) {
            if (array[i] % 2 == 0) {
                array1[index] = array[i];
                index++;
            }
        }
        System.out.println("Второй массив равен = " + Arrays.toString(array1));
    }
}

