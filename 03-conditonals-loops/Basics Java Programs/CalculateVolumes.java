/*
 * This Java class would contain all of the programs related to calculating perimeter, programs 14 to 18
 */

public class CalculateVolumes {
    public static void main(String[] args) {
        System.out.println("Area of circle is:  " + VolumeOfCone(7, 8));
        System.out.println("Area of circle is:  " + VolumeOfPrism(7, 8, 6));
        System.out.println("Area of circle is:  " + VolumeOfCylinder(7, 8));
        System.out.println("Area of circle is:  " + VolumeOfSphere(7));
        System.out.println("Area of circle is:  " + VolumeOfPyramid(7, 8, 6));
    }

    private static double VolumeOfCone(float radius, float height) {
        return (Math.PI * radius * radius * height) / 3;
    }

    private static double VolumeOfPrism(float length, float base, float height) {
        // A triangular prism
        return (length * base * height) / 2;
    }

    private static double VolumeOfCylinder(float radius, float height) {
        return Math.PI * radius * radius * height;
    }

    private static double VolumeOfSphere(float radius) {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }

    private static double VolumeOfPyramid(float length, float width, float height) {
        return (length * width * height) / 3;
    }

}
