package Vector;

import java.util.Objects;

import static Vector.Const.VECTOR3D;

public class Vector3d {
    double x, y, z;

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void print() {
        System.out.println((VECTOR3D + "Vec3d {x=" + x + ", y=" + y + " z=" + z + "}"));
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public static double multiplication(Vector3d vector3d1, Vector3d vector3d2) {
        return vector3d1.x * vector3d1.y * vector3d1.z + vector3d2.x * vector3d2.y * vector3d2.z;
    }

    public static void sum(Vector3d vector3d1, Vector3d vector3d2) {
        double sumx = vector3d1.x + vector3d2.x;
        double sumy = vector3d1.y + vector3d2.y;
        double sumz = vector3d1.z + vector3d2.z;
        System.out.println("Сумма двух векторов3d=  {x=" + sumx + ", y=" + sumy + " z=" + sumz + "}");
    }

    public static void minus(Vector3d vector3d1, Vector3d vector3d2) {
        double minusx = vector3d1.x - vector3d2.x;
        double minusy = vector3d1.y - vector3d2.y;
        double minusz = vector3d1.z - vector3d2.z;
        System.out.println("Вычитание двух векторов3d=  {x=" + minusx + ", y=" + minusy + " z=" + minusz + "}");
    }
    public static void generate(int n) {
        Vector3d[] vectors = new Vector3d[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector3d(Math.random()*10, Math.random()*10, Math.random()*10);
            vectors[i].print();
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3d vector3d = (Vector3d) o;
        return Double.compare(vector3d.x, x) == 0 && Double.compare(vector3d.y, y) == 0 && Double.compare(vector3d.z, z) == 0;
    }



}
