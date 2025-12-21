package unit_03;

public class DoubleDimensionArray {
	public static void main(String[] args) {
        String[][] arr = {
            {"1", "sunday"},
            {"2", "monday"},
            {"3", "tuesday"},
            {"4", "wednesday"},
            {"5", "thursday"},
            {"6", "friday"},
            {"7", "saturday"},
        };

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("****Elements are***" + arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("***double dimension array***");
    }
}
