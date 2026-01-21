package unit_02;

public class PrimeNumber {
    public static void main(String[] args) throws Exception {
        int fact = 1;
        for (int i = 1; i <= 10; i++) {
            fact = fact * i;
            System.out.println(i + "! = " + fact);
        }
    }
}