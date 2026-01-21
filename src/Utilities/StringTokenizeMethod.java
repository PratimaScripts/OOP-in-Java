package Utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class StringTokenizeMethod {
    public static void main(String args[]) throws IOException {
        BufferedReader inValue = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("***Please Enter String*****");
        String stringValue = inValue.readLine();

        BufferedReader intokenizer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("***Please Enter Tokenizer*****");
        String tokenizer = intokenizer.readLine();

        StringTokenizer st = new StringTokenizer(stringValue, tokenizer);

        if (st.countTokens() == 2) {
            System.out.println(st.nextToken());
            System.out.println(st.nextToken());
        }
    }

}