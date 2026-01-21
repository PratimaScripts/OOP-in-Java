package Chapter_12_Enumerations;

import java.util.*;

class AutoBoxingMethods {

    static int m(Integer v) {
        System.out.println("!!!Method is getting call!!!" + v);
        return v; // auto-unbox to int
    }

    public static void main(String[] args) {


        Integer wrapedInt = m(100);

        System.out.println("Autounboxing into int type == " + wrapedInt);
        System.out.println("Autounboxing into int type == " + m(200));

    }
}
