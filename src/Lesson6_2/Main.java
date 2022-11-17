package Lesson6_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bancomat bancomatBTB = new Bancomat();
        int k = 0;
        boolean isEnded = false;
        while (true) {
            System.out.println("Введите номер операции:\n\t" +
                    "1 - Добавить купюру номиналом 20\n\t" +
                    "2 - Добавить купюру номиналом 50\n\t" +
                    "3 - Добавить купюру номиналом 100\n\t" +
                    "4 - Показать все деньги в банкомате\n\t" +
                    "5 - Показать информацию о банкомате\n\t" +
                    "0 - Вернуть карточку из банкомата\n\n");

            k = new Scanner(System.in).nextInt();

            switch (k) {
                case 1:
                    bancomatBTB.add(20);
                    break;
                case 2:
                    bancomatBTB.add(50);
                    break;
                case 3:
                    bancomatBTB.add(100);
                    break;
                case 4:
                    System.out.println(bancomatBTB.allMoney);
                    break;
                case 5:
                    System.out.println(bancomatBTB.toString());
                    break;
                case 0:
                    System.out.println("Карточка возвращена");
                    isEnded = true;
                    break;
            }
            if (isEnded)
                break;
        }
    }
}

