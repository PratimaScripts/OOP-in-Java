package unit9;

import java.lang.Math;

public class MyMathClass
{
    public static void main (String [] args)
    {
      // get some doubles to find their absolute values
      double x = 4876.1874d;
      double y = -0.0d;
   
      // get and print their absolute values
      System.out.println("Math.abs(" + x + ")=" + Math.abs(x));
      System.out.println("Math.abs(" + y + ")=" + Math.abs(y));
      System.out.println("Math.abs(-9999.555d)=" + Math.abs(-9999.555d));
      
      System.out.println("********");
      // get two double numbers
      double a = 5;
      double b = 0.5;
   
      // print e raised at x and y
      System.out.println("Math.exp(" + a + ")=" + Math.exp(a));
      System.out.println("Math.exp(" + b + ")=" + Math.exp(b));
      
      System.out.println("********");
      // get two double numbers
      double c = 60984.1;
      double d = 1000;
   
      // print the larger number between x and y
      System.out.println("Math.max(" + c + "," + d + ")=" + Math.max(c, d));
      
    }
}