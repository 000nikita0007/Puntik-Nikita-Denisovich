package Lesson_15_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lesson15_2 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Никита");
        myList.add("Никита");
        myList.add("Паша");
        myList.add("Яна");
        myList.add("Вася");
        myList.add("Даша");
        myList.add("Лёша");
        myList.add("Женя");
        myList.add("Коля");
        System.out.println(myList);
//        List<String> myList1 = myList.stream().filter(x -> x.contains("Никита")).findAny()
//                .stream().collect(Collectors.toList());
//        myList1.stream().forEach(System.out::println);
        Map<String,Integer> map= myList.stream().collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
        System.out.println(map);
    }
}
