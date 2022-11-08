package Lesson4;

import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Array;
import java.util.*;

public class Lesson4_1 {
    public static void main(String[] args) {
        Integer[] array = {3, 6, 21, 7, 8, 4, 2};
        System.out.println("Массив до удаления" + Arrays.toString(array));
        Integer number = new Scanner(System.in).nextInt();
        boolean contains = Arrays.stream(array).anyMatch(number::equals);
        if (contains == false) {
            throw new NoSuchElementException("Нет такого Эллемента");
        } else {
            System.out.println(contains);
            array = ArrayUtils.removeElement(array, number);
            System.out.println( "Массив после удаления " + Arrays.toString(array));
        }
    }
}