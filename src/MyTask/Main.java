package MyTask;
//C:\Users\Lenovo\Desktop

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person1 = new Person("Puntik", "Nikita", "Male", 31);
        Person person2 = new Person("Dimach", "Dima", "Male", 40);
        Person person3 = new Person("Puntik", "Darya", "FeMale", 20);
        Person person4 = new Person("Vladich", "Vlad", "Male", 21);
        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        FileOutputStream fout = null;
        System.out.println("Введите ваш путь C:\\Users\\Lenovo\\Desktop ");
        String way = new Scanner(System.in).nextLine();
        try {
            fout = new FileOutputStream(way, false);
            for (int i = 0; i < people.size(); i++) {
                fout.write(people.get(i).toString().getBytes());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        ArrayList<Person> myNewArray = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(way);
            String fileContent = new String(fileInputStream.readAllBytes(), StandardCharsets.UTF_8);
            String[] rows = fileContent.split("\n");

            for (int i = 0; i < rows.length; i++) {
                Person person = new Person();
                person.parseFromString(rows[i]);
                myNewArray.add(person);
            }

            for (int i = 0; i < myNewArray.size(); i++)
                System.out.print(myNewArray.get(i));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Коллекция после сортировки");
        Collections.sort(myNewArray);
        for (int i = 0; i < myNewArray.size(); i++)
            System.out.print(myNewArray.get(i));
        FileOutputStream fout1 = null;
        try {
            fout1 = new FileOutputStream(way, false);
            for (int i = 0; i < people.size(); i++) {
                fout1.write(myNewArray.get(i).toString().getBytes());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        int countPeopleOfAge = (int) myNewArray.stream().filter(person -> person.getAge() > 30).count();
        int countMale = (int) myNewArray.stream().filter(person -> "Male".equals(person.getGender())).count();
        int countFeMale = (int) myNewArray.stream().filter(person -> "FeMale".equals(person.getGender())).count();
        System.out.println("Humans > 30 " + countPeopleOfAge);
        System.out.println("Male: " + countMale);
        System.out.println("FeMale: " + countFeMale);
    }
}
