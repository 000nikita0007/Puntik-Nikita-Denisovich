package Vector;

import java.util.Objects;

import static Vector.Const.VECTOR2D;

public class Vector2d {
    double x, y;

    public Vector2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println(VECTOR2D + "Vec2d {x=" + x + ", y=" + y + "}");
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    public static double multiplication(Vector2d vector2d1, Vector2d vector2d2) {
        return vector2d1.x * vector2d1.y + vector2d2.x * vector2d2.y;
    }

    public static void sum(Vector2d vector2d1, Vector2d vector2d2) {
        double sumx = vector2d1.x + vector2d2.x;
        double sumy = vector2d1.y + vector2d2.y;
        System.out.println("Сумма двух векторов2d=  {x=" + sumx + ", y=" + sumy + "}");
    }

    public static void minus(Vector2d vector2d1, Vector2d vector2d2) {
        double minusx = vector2d1.x - vector2d2.x;
        double minusy = vector2d1.y - vector2d2.y;
        System.out.println("Вычитание двух векторов2d=  {x=" + minusx + ", y=" + minusy + "}");
    }

    public static void generate(int n) {
        Vector2d[] vectors = new Vector2d[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector2d(Math.random()*20, Math.random()*20);
            vectors[i].print();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector2d vector2d = (Vector2d) o;
        return Double.compare(vector2d.x, x) == 0 && Double.compare(vector2d.y, y) == 0;
    }
}
