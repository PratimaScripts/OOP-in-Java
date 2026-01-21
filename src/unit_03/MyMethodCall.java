package unit_03;

public class MyMethodCall {
    public void display() {
        sum();//calling sum method without passing any parameter.
        //sum(7,3);
        //int retVal = sum(1,2,4);
        //System.out.println("The returned sum = "+retVal);
        //System.out.println("The minimum value is :"+minMethod(5,8));
        //MyMethod myMethodObject = new MyMethod();
        //myMethodObject.display();

    }

    public void sum() {
        int a = 5;
        int b = 10;
        int c = a + b;
        System.out.println("Sum = " + c);
        //MyMethod myMethodObject = new MyMethod();
        //myMethodObject.display();
    }

    /**
     * returns sum of two integers
     */
    public void sum(int x, int y) {
        int a = x;
        int b = y;
        int c = a + b;
        System.out.println("Sum using parameters = " + c);
    }

    /**
     * returns sum of three integers
     */
    public int sum(int p, int q, int r) {
        int a = p;
        int b = q;
        int c = r;
        int d = a + b + c;
        return d;
    }

    /**
     * returns the minimum of two numbers
     */
    public static int minMethod(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }
}