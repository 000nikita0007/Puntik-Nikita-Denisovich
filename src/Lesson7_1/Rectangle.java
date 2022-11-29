package Lesson7_1;

public class Rectangle implements Figure {
 float a,b;

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public float getSquare() {
        return a*b;
    }

    @Override
    public float getPerimeter() {
        return (a+b)*2;
    }
}
