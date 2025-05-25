/* Using java.util.Stack
Write a Java program that creates a Stack of strings, pushes elements onto the stack, pops an element, and prints the top element.
*/
package unit9;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Popping an element
        String poppedElement = stack.pop();

        // Printing the top element
        String topElement = stack.peek();

        System.out.println("Popped element: " + poppedElement);
        System.out.println("Top element: " + topElement);
    }
}
