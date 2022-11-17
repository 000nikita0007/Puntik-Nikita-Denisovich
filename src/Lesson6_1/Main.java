package Lesson6_1;


public class Main {
    public static void main(String[] args) {
        RAM ram = new RAM();
        ram.name = "Bluesto";
        ram.volume = 32;
        HDD hdd = new HDD();
        hdd.name = "Cop";
        hdd.type = "Внешний";
        hdd.volume = 12;
        Computer comp1 = new Computer(3900, "Asus Tuf");
        Computer comp2 = new Computer(4600, "Lenovo Legion", ram, hdd);
        System.out.println(comp1.outPutInf());
        System.out.println(comp2.toString());
    }
}
