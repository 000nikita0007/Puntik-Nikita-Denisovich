package Lesson6;

import java.util.Scanner;

public class CreditCard {
    String account;
    int currentSum;

    public CreditCard(String account, int currentSum) {
        this.account = account;
        this.currentSum = currentSum;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "account='" + account + '\'' +
                ", currentSum=" + currentSum +
                '}';
    }

    public void Accrual() {
        System.out.println("Введите сумму начисления на номер счёта  " + account);
        int sum = new Scanner(System.in).nextInt();
        currentSum += sum;

    }

    public void Remove() {
        System.out.println("Введите сумму списания по номеру" + account);
        int sum = new Scanner(System.in).nextInt();
        currentSum -= sum;
    }

    public void toString1() {
        System.out.println("Текущее состояние карточки по номеру счёта " + account + " Текущая сумма на счету= " + currentSum);
    }

}
