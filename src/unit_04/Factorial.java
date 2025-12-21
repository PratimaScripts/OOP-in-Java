package unit_04;

class Factorials {
      int fact(int n) {
            int result;

            if (n == 1) return 1;

            result = fact(n - 1) * n;
            return result;
      }
}

class Factorial {
      public static void main(String[] args) throws Exception {
            Factorials factCompute = new Factorials();
            System.out.println("Factorial of 3 is " + factCompute.fact(3));
            System.out.println("Factorial of 4 is " + factCompute.fact(4));
            System.out.println("Factorial of 5 is " + factCompute.fact(5));
      }
}
