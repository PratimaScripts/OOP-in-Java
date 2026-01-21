package Enumerations;

class AutoboxingError {
    public static void main(String[] args) {
        int wrappedInt = 1000;

        int byteInt = (byte) wrappedInt;

        System.out.println("Autounboxing into int type == " + byteInt);

    }
}
