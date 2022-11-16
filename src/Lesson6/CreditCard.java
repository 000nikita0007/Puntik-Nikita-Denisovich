package Lesson6;

import java.util.Scanner;

public class CreditCard {
    static String account;
    static int currentSum;

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

    public static void Accrual(){
        System.out.println("Введите сумму начисления");
        int sum=new Scanner(System.in).nextInt();
        currentSum+=sum;

    }
    public static void Remove(){
        System.out.println("Введите сумму списания");
         int sum=new Scanner(System.in).nextInt();
         currentSum-=sum;
    }
    public static void Condition(){
        System.out.println("Текущее состояние карточки по номеру счёта "+ account +" Текущая сумма на счету= "+ currentSum);
    }

}
