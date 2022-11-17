package Lesson7_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        float totalSqure = 0, totalPerimitre = 0;
        Figure[] figures = {new Triangle(5, 3, 2), new Rectangle(4, 8), new Circle(5)};
        for (Figure f:
             figures) {
            totalSqure+= f.getSquare();
            totalPerimitre+= f.getPerimeter();
        }
        System.out.println(totalSqure);
        System.out.println(totalPerimitre);
    }
}
