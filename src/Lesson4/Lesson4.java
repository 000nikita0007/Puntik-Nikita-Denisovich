package Lesson4;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        int[] array = new int[]{34, 12, 64, 21, 23, 1, 4};
        System.out.println("Ввдите число, которое хотите провреить");
        System.out.println(Arrays.toString(array));
        Integer number = new Scanner(System.in).nextInt();
        boolean contains = Arrays.stream(array).anyMatch(number::equals);
        if (contains == false) {
            throw new NoSuchElementException("Нет такого Эллемента");
        } else {
            System.out.println(contains + "\n" + "Есть заданный эллемент");
        }
    }
}