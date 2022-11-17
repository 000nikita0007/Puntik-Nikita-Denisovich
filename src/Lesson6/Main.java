package Lesson6;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("by23241", 4321);
        CreditCard creditCard2 = new CreditCard("by6321321241", 3213);
        CreditCard creditCard3 = new CreditCard("by654311", 6543);
        creditCard1.toString1();
        creditCard2.toString1();
        creditCard3.toString1();
        creditCard1.Accrual();
        creditCard2.Accrual();
        creditCard3.Remove();
        System.out.println(creditCard1.toString() + "\n" + creditCard2.toString() + "\n" + creditCard3.toString());
    }
}