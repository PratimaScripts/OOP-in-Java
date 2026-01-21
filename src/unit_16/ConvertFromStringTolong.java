/**
 *
 */
package unit_16;

/**
 * @author agupta
 *
 */
public class ConvertFromStringTolong {

    public static void main(String args[]) {
        // long to String....
        Long lng = new Long(12);
        String strLong = "" + lng;
        String str1Long = lng.toString();
        System.out.println("from long" + " to string ==" + strLong + "\n" + str1Long);

        // double to String....
        Double doble = new Double(12.89);
        String strdouble = "" + doble;
        String str1double = doble.toString();
        System.out.println("from double" + " to string ==" + strdouble + "\n" + str1double);

        // integer to String....
        Integer intgr = new Integer(12);
        String strInteger = "" + intgr;
        String str1Integer = intgr.toString();
        System.out.println("from integer" + " to string ==" + strInteger + "\n" + str1Integer);

        // Byte to String....
        Byte byt = new Byte((byte) 1);
        String strByte = "" + byt;
        String str1Byte = byt.toString();
        System.out.println("from Byte" + " to string ==" + strByte + "\n" + str1Byte);


    }

}
