package Vector;

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

    public static double multiplication(Vector3d vector3d1, Vector3d vector3d2, Vector3d vector3d3) {
        return vector3d1.x * vector3d1.y * vector3d1.z + vector3d2.x * vector3d2.y * vector3d2.z
                + vector3d3.x * vector3d3.y * vector3d3.z;
    }
}
