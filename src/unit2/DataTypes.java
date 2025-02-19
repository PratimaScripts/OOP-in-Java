/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit2;

/**
*
* @author prati
*/

public class DataTypes {
    public static void main(String[] args) {
        // Declaration and initialization of variables for each primitive data type
        byte myByte = 100;
        short myShort = 10000;
        int myInt = 1000000;
        long myLong = 1000000000L; // Note the 'L' suffix to indicate a long literal
        float myFloat = 3.14f; // Note the 'f' suffix to indicate a float literal
        double myDouble = 3.141592653589793;
        char myChar = 'A';
        boolean myBoolean = true;

        // Printing out the values of the variables
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);

        //Implicit  Type Casting  
        //converts smaller to bigger datatype (automatic)
        int sum = myByte + myShort; // Adding byte and short, result stored in an int
        double product = myFloat * myDouble; // Multiplying float and double, result stored in a double

        byte a = (byte) sum; // Explicit casting from int to byte

        //int b=(int) product;

        // Type Casting Result 
        System.out.println("Sum of byte and short: " + sum);
        System.out.println("Product of float and double: " + product);

        // System.out.println(sum=2+2);

        final int maxValue = 100; // Declaration of a constant integer
        final double pi = 3.14159; // Declaration of a constant double

        // System.out.println(maxValue=100+2);

        // Declaration and initialization of an array of integers
        int[] numbers = {
            10,
            20,
            30,
            40,
            50
        };

        // Accessing and printing elements of the array
        System.out.println("First element: " + numbers[0]); // Output: 10
        System.out.println("Second element: " + numbers[1]); // Output: 20


        // Finding the length of the array
        System.out.println("Array length: " + numbers.length); // Output: 5

        // Modifying an element of the array
        numbers[2] = 35;
        System.out.println("Modified third element: " + numbers[2]); // Output: 35

        // Declare and initialize an array with a fixed size
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        int x = 10;
        int z = x++;
        int y = ++x;
        System.out.println(y);
        System.out.println(x);
        System.out.println(z);
    }
}