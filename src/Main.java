import java.net.SocketImpl;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, count = 0;

        while (true) {
            System.out.println("Введи число , только не проебись");

            try {
                number = new Scanner(System.in).nextInt();
            } catch (Exception ex) {
                System.out.println("Я же сказал не проебись");
                continue;
            }

            if (number < 15 && number > 0) {
                System.out.println("Group1");
                count = 1;
            } else if (number < 30 && number >= 15) {
                System.out.println("Group2");
                count = 2;
            } else if (number >= 30) {
                System.out.println("Group3");
                count = 3;
            } else System.out.println("Usless group");

            for (int i = 0; i < count; i++) {
                System.out.println("— Подонок, это было последнее пиво. Я убью тебя!\n" +
                        "— И я убью тебя, друг. Я тоже тебя убью. ");
            }
            break;
        }
    }
}