package Lesson7_1;

public class Circle implements Figure {
    //P=2πR
    float r;

    public Circle(float r) {
        this.r = r;
    }

    @Override
    public float getSquare() {
        return(float) (Math.PI*r*r);
    }

    @Override
    public float getPerimeter() {
        return(float) (2*Math.PI*r);
    }
}
