package Lesson6;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("by2321",4321);
        System.out.println(creditCard1.toString());
        creditCard1.Accrual();
        System.out.println((creditCard1.toString()));
        creditCard1.Remove();
        creditCard1.Condition();
    }
}