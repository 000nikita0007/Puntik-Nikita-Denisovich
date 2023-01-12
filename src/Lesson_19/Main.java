package Lesson_19;

import java.net.SocketImpl;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable1 = new MyRunnable();
        Thread thread1 = new Thread(myRunnable1, "T1");
        Thread thread2 = new Thread(myRunnable1, "T2");
        Thread thread3 = new Thread(myRunnable1, "T3");
        thread3.start();
        try {
            thread3.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
        try {
            thread2.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();
        try {
            thread1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Все потоки отработали");
    }
}