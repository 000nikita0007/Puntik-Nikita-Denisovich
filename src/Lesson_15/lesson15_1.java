package Lesson_15;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Collectors;

public class lesson15_1 {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();
        System.out.println("Введите размер Массива");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Рандомный Лист " + "\n");
        for (int i = 0; i < n; i++) {
            myArray.add((int) (Math.random() * 20));
            System.out.print(myArray.get(i) + " ");
        }
        System.out.println("");
        List<Integer> uniqArray = myArray.stream().distinct()
                .collect(Collectors.toList());
        System.out.println("Уникальный Лист");
        printListToConsole(uniqArray);
        System.out.println(" ");
        List<Integer> sortedList = myArray.stream().filter(x -> x % 2 == 0 && x > 7 && x < 17)
                .collect(Collectors.toList());
        System.out.println("Сортированный лист ");
        printListToConsole(sortedList);
        System.out.println("");

        List<Integer> multiplyArray = myArray.stream().map(x -> x *= 2).
                collect(Collectors.toList());
        System.out.println("Лист Умноженный на 2");
        printListToConsole(multiplyArray);
        System.out.println("\n" + "Лист отсартированный по возрастанию");
        List<Integer> sortedArray = myArray.stream().sorted().collect(Collectors.toList());
        sortedArray.stream().limit(4).forEach(x -> System.out.print(x + " "));
        System.out.println("\n" + "Размер Листа" + myArray.stream().count());
        OptionalDouble stats= myArray.stream().mapToInt(Integer::intValue).average();
        System.out.println(stats);
    }

    public static void printListToConsole(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
