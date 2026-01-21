package unit_04;

class Overload {
    void demo() {
        System.out.println("no parameter");
    }

    void demo(int i) {
        System.out.println("with 1 parameter");
    }
}

class OverloadExample {
    public static void main(String args[]) {
        Overload ovldNoParam = new Overload();
        ovldNoParam.demo();
        ovldNoParam.demo(22);
    }
}
