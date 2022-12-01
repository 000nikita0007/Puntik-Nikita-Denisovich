import Vector.Vector3d;
import Vector.Vector2d;

import java.net.SocketImpl;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector2d vetcor2d = new Vector2d(5, 4.4);
        Vector2d vetcor2d1 = new Vector2d(8, 4.15);
        Vector3d vector3d1 = new Vector3d(4, 6.5, 7);
        Vector3d vector3d2 = new Vector3d(1, 2.5, 10);
        vetcor2d.print();
        vector3d1.print();
        System.out.println("length= " + vetcor2d.length());
        System.out.println("length= " + vector3d1.length());
        System.out.println("Скалярное произведение2d= " + Vector2d.multiplication(vetcor2d, vetcor2d1));
        System.out.println("Скалярное произведение3d= " + Vector3d.multiplication(vector3d1, vector3d2));
        Vector2d.sum(vetcor2d, vetcor2d1);
        Vector3d.sum(vector3d1, vector3d2);
        Vector2d.minus(vetcor2d,vetcor2d1);
        Vector3d.minus(vector3d1,vector3d2);
    }
}
