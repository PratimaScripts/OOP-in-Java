package regex;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileIPAddressRegularExpression {
    public static void main(String args[]) throws IOException {

        DataInputStream dis = null;
        String record = null;
        int recCount = 0;

        File f = new File("c:/Input.txt");


        FileInputStream fis = new FileInputStream(f);

        BufferedInputStream bis = new BufferedInputStream(fis);
        dis = new DataInputStream(bis);

        StringBuffer sb = new StringBuffer();

        // Pattern p = Pattern.compile ( "^\\s?\\d+\\.\\d+\\.\\d+\\.\\d+\\s+ (  [ A-Z ]  [ ^\\s ] + ) \\s.*$" ) ;

        String _255 = "(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        Pattern p = Pattern.compile("^(?:" + _255 + "\\.){3}" + _255 + "$");


        OutputStream op = new FileOutputStream("c:/Finalbatch.txt");

        int appendrecCount = 0;
        while ((record = dis.readLine()) != null) {
            recCount++;
            Matcher m = p.matcher(record);
            boolean b = m.find();


            if (b) {
                appendrecCount++;
                sb.append(record);
                sb.append("\n");

            } else {


            }
        }
        byte buf[] = sb.toString().getBytes();

        op.write(buf);
        op.flush();
        dis.close();
        op.close();
        System.out.println("***String buffer*****\n" + sb.toString());

        System.out.println("^^^^^^^Found Number Of Mathes For IP ADDRESSES Are--- " + appendrecCount);
        System.out.println("***Number Of Lines Found In File ----" + recCount);

    }
}
