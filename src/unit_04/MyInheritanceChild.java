package unit_04;

public class MyInheritanceChild extends MyInheritance {
    // instance variables - replace the example below with your own
    private int result;

    public MyInheritanceChild(String n) {
        super(n);
    }

    public void multiplication(int x, int y) {
        result = x * y;
        System.out.println("The multiplication is: " + result);
    }

}