/*
 * This Java class would contain all of the programs related to calculating perimeter, programs 8 to 13
 */

public class CalculatePerimeters {
    public static void main(String[] args) {
        System.out.println("Area of circle is:  " + PerimeterofCircle(7));
        System.out.println("Area of circle is:  " + PerimeterofEquilateralTriangle(7));
        System.out.println("Area of circle is:  " + PerimeterofParallelogram(7, 8));
        System.out.println("Area of circle is:  " + PerimeterofRectangle(7, 8));
        System.out.println("Area of circle is:  " + PerimeterofSquare(7));
        System.out.println("Area of circle is:  " + PerimeterofRhombus(7));
    }

    private static double PerimeterofCircle(float radius) {
        return 2 * Math.PI * radius;
    }

    private static double PerimeterofEquilateralTriangle(float side) {
        return 3 * side;
    }

    private static double PerimeterofParallelogram(float a, float b) {
        return 2 * (a + b);
    }

    private static double PerimeterofRectangle(float length, float width) {
        return 2 * (length * width);
    }

    private static double PerimeterofSquare(float side) {
        return 4 * side;
    }

    private static double PerimeterofRhombus(float side) {
        return 4 * side;
    }
}
