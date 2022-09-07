/*
 * This Java class would contain all of the programs related to calculating area, programs 1 to 7
 */

public class CalculateAreas {
    public static void main(String[] args) {
        System.out.println("Area of circle is:  " + AreaOfCircle(7));
        System.out.println("Area of circle is:  " + AreaOfTriangle(7, 8));
        System.out.println("Area of circle is:  " + AreaOfRectangle(7, 8));
        System.out.println("Area of circle is:  " + AreaOfIsoscelesTriangle(7, 8));
        System.out.println("Area of circle is:  " + AreaOfParallelogram(7, 8));
        System.out.println("Area of circle is:  " + AreaOfRhombus(7, 8));
        System.out.println("Area of circle is:  " + AreaOfEquilateralTriangle(7));
    }

    private static double AreaOfCircle(float radius) {
        return Math.PI * radius * radius;
    }

    private static double AreaOfTriangle(float base, float height) {
        return (base * height) / 2;
    }

    private static double AreaOfRectangle(float length, float width) {
        return length * width;
    }

    private static double AreaOfIsoscelesTriangle(float base, float height) {
        return (base * height) / 2;
    }

    private static double AreaOfParallelogram(float base, float height) {
        return base * height;
    }

    private static double AreaOfRhombus(float diagonalOne, float diagonalTwo) {
        return (diagonalOne * diagonalTwo) / 2;
    }

    private static double AreaOfEquilateralTriangle(float side) {
        return (Math.sqrt(3) / 4) * (side * side);
    }
}
