package Lesson_19;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Запущен поток " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поток отработал:::" + Thread.currentThread().getName());
    }
}
