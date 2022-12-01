import Vector.Vector3d;
import Vector.Vector2d;

import java.net.SocketImpl;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vector2d vetcor2d = new Vector2d(5, 4.1);
        Vector2d vetcor2d1 = new Vector2d(8, 1.1);
        vetcor2d.print();
        System.out.println("length= " + vetcor2d.length());
        Vector3d vector3d = new Vector3d(2.32, 4, 6.32);
        vector3d.print();
        System.out.println("length= " + vector3d.length());
        System.out.println(Vector2d.multiplication1(vetcor2d ,vetcor2d1));
    }
}
