package unit_01;

public class AreaCircle {
    public static void main(String[] args) {
        double radius = 7.89;

        double area = 3.1416 * radius * radius;

        System.out.println("Area of circle is: \b" + area );

        System.out.println("---------------");

        System.out.printf("Area of Circle = %.4f", area);
    }
}