package Vector;

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
        System.out.println( "Сумма двух векторов=  {x=" + sumx + ", y=" + sumy + "}");
    }
}
