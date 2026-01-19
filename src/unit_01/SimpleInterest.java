package unit_01;

public class SimpleInterest {
    public static void main(String args[]){

        double principal = 750.23;
        double time = 2.23;
        double rate = 3.5;

        double interest = (principal*time*rate)/100;

        // Print the result
        System.out.println("The Simple Interest is " + interest);

        System.out.println("-------------------------------");

        // Formatted output to 2 decimal places
        System.out.printf("The formatted output to 2 decimal places for the Simple Interest = %.2f", interest);
    }
}