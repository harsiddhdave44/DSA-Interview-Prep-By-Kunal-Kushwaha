/**
 * CalculateSurfaceArea
 */
public class CalculateSurfaceArea {
    public static void main(String[] args) {
        System.out.println("Area of circle is:  " + CurvedSurfaceArea(7, 8));
        System.out.println("Area of circle is:  " + TotalSurfaceArea(7, 8));
    }

    private static double CurvedSurfaceArea(float radius, float height) {
        return 2 * Math.PI * radius * height;
    }

    private static double TotalSurfaceArea(float radius, float height) {
        return 2 * Math.PI * radius * (radius + height);
    }

}