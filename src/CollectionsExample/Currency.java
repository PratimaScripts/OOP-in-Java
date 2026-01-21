package CollectionsExample;

import java.util.Locale;

class Currency {
    public static void main(String args[]) {
        java.util.Currency c;
        c = java.util.Currency.getInstance(Locale.ENGLISH);
        System.out.println("Symbol: " + c.getSymbol());
        System.out.println("Default fractional digits: " + c.getDefaultFractionDigits());
    }
}