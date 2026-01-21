package unit_02;

class DoubleDimensionArray {
    public static void main(String args[]) {
        String[][] arr = {

                {"1", "sunday"},
                {"2", "modday"},
                {"3", "tuesday"},
                {"4", "wednesday"},
                {"5", "thursday"},
                {"6", "firday"},
                {"7", "saturday"},

        };

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.println("****Elements are***" + arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("***double dimension array***");
    }


}