package unit_02;

class PrimeOrNot {
    public static void main(String args[]) {
        int num = 13;
        boolean prime = true;

        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0)
                prime = false;
            break;
        }
        if (prime)
            System.out.println(num + "*****Its a Prime Number");
        else
            System.out.println(num + "*****Not a Prime Number");

    }


}