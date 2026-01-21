package unit_02;

class BitwiseLogicalOperator {
    public static void main(String args[]) {

        String binary[] = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111"};
        int a = 3;
        int b = 6;
        int c = a | b;
        int d = a & b;

        System.out.println(" a=" + binary[a]);
        System.out.println(" b=" + binary[b]);
        System.out.println(" a|b=" + binary[c]);
        System.out.println(" a&b=" + binary[d]);

    }

}