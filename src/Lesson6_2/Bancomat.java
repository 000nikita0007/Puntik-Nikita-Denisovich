package Lesson6_2;

import java.util.ArrayList;

//Создать класс, описывающий банкомат.
//Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
//количеством купюр номиналом 20, 50 и 100.
//Сделать метод для добавления денег в банкомат.
public class Bancomat {
    int billCounter20, billCounter50, billCounter100, allMoney;

    public Bancomat() {
        billCounter20 = 0;
        billCounter50 = 0;
        billCounter100 = 0;
        allMoney = 0;
    }

    @Override
    public String toString() {
        return "Bancomat:\n" +
                "\tКупюр по 20 = " + billCounter20 +
                "\n\tКупюр по 50 = " + billCounter50 +
                "\n\tКупюр по 100 = " + billCounter100 +
                "\n\tВсе деньги = " + allMoney;
    }

    public void add(int bill) {
        if (bill != 20 && bill != 50 && bill != 100) {
            System.out.println("Такие купюры не принимает");
            return;
        }
        if (bill == 20) {
            billCounter20++;
            allMoney += 20;
        }
        if (bill == 50) {
            billCounter50++;
            allMoney += 50;
        }
        if (bill == 100) {
            billCounter100++;
            allMoney += 100;
        }
    }
}
