package unit_04;

public class MyInheritance {
    private int result;
    private String name;

    public MyInheritance(String n) {
        name = n;
        System.out.println("parent constructor called!!" + name);
    }

    public void addition(int x, int y) {
        result = x + y;
        System.out.println("The sum is: " + result);
    }

    public void subtraction(int x, int y) {
        result = x - y;
        System.out.println("The difference is: " + result);
    }
}
