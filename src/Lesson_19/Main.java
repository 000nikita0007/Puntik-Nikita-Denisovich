package Lesson_19;

import java.net.SocketImpl;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable1 = new MyRunnable();
        Thread thread1 = new Thread(myRunnable1,"T1");
        Thread thread2 = new Thread(myRunnable1,"T2");
        Thread thread3 = new Thread(myRunnable1,"T3");
        thread3.start();
        thread3.join(2000);
        thread2.start();
        thread2.join(3000);
        thread1.start();
        thread1.join(4000);
    }
}