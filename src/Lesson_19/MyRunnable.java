package Lesson_19;

public class MyRunnable implements Runnable  {

    @Override
    public void run() {
        System.out.println("Запущен поток " +Thread.currentThread().getName());
    }
}
