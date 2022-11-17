package Lesson6_1;

public class Computer {
    int cost;
    String model;
    RAM ram;
    HDD hdd;

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
        ram = new RAM();
        hdd = new HDD();
    }

    public Computer(int cost, String model, RAM ram, HDD hhd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hhd;
    }

    public String outPutInf() {
        return "Cost= " + cost + "\nmodel - " + model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cost=" + cost +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}

