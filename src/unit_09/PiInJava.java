package unit_09;

public class PiInJava {

    public static double circumferenceOfCircle(int radius) {

        return Math.PI * (2 * radius);
    }

    public static double areaOfCircle(int radius) {

        return Math.PI * Math.pow(radius, 2);
    }

    public static double volumeOfSphere(int radius) {

        return (4/3) * Math.PI * Math.pow(radius, 3);
    }

    public static double surfaceAreaOfSphere(int radius) {

        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {

        int radius = 5;

        System.out.println("Circumference of the Circle = " + circumferenceOfCircle(radius));
        System.out.println("Area of the Circle = " + areaOfCircle(radius));
        System.out.println("Volume of the Sphere = " + volumeOfSphere(radius));
        System.out.println("Surface Area of the Sphere = " + surfaceAreaOfSphere(radius));

    }

}