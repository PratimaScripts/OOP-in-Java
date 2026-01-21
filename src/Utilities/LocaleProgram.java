package Utilities;

import java.util.Currency;
import java.util.Locale;

class LocaleProgram {

    public static void main(String args[]) {
        java.util.Currency c;
        c = Currency.getInstance(Locale.US);

        for (Object avlblLocale : Locale.getAvailableLocales())
            System.out.println("Locales Are: " + avlblLocale);
        System.out.println("Symbol: " + c.getSymbol());
        System.out.println("Default fractional digits: " + c.getDefaultFractionDigits());

    }

}