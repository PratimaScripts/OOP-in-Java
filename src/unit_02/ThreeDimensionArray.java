package unit_02;

class ThreeDimensionArray {
    public static void main(String args[]) {


        int[][][] threeD = new int[5][4][3];

        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 4; ++j) {
                for (int k = 0; k < 3; ++k) {
                    threeD[i][j][k] = i + j + k;
                    System.out.println("***Three dimension array***" + threeD[i][j][k]);
                }
                System.out.println();

            }

        }

        System.out.println("***Three dimension array***");
    }

}

