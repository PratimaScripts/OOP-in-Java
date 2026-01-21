/**
 *
 */
package unit_16;

/**
 * @author agupta
 *
 */
public class ConvertFromlongToString {

    public static void main(String args[]) {
        // String to long ....

        String strLng = new String("1224");

        long lngPrimitive = Long.parseLong(strLng);
        Long lngStr = new Long(strLng);
        System.out.println("from string" + " to long ==" + lngStr);

        // String to double....
        String strDbl = new String("1224.23");

        double dblPrimitive = Double.parseDouble(strDbl);
        Double dblStr = new Double(strDbl);
        System.out.println("from string" + " to double ==" + dblStr);

        // String to integer....
        String strInt = new String("1224");
        int intPrimitive = Integer.parseInt(strInt);
        Integer intStr = new Integer(strInt);
        System.out.println("from string" + " to integer ==" + intStr);

        // String  to Byte....
        String strByte = new String("1");
        byte bytePrimitive = Byte.parseByte(strByte);
        Byte byteStr = new Byte(strByte);
        System.out.println("from string" + " to Byte ==" + byteStr);


    }

}
