package Lesson7_1;

public class Triangle implements Figure {
    //S=√(p·(p-a)·(p-b)·(p-c))
    float p,a,b,c;;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public float getSquare() {
        p=getPerimeter();
        return (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public float getPerimeter() {
        return a+b+c;
    }
}
