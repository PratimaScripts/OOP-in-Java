package regex;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileEmaiRegularExpression {
    public static void main(String args[]) throws IOException {

        DataInputStream dis = null;
        String record = null;
        int recCount = 0;

        File f = new File("c:/Input.txt");

        FileInputStream fis = new FileInputStream(f);

        BufferedInputStream bis = new BufferedInputStream(fis);
        dis = new DataInputStream(bis);

        StringBuffer sb = new StringBuffer();
        Pattern p = Pattern.compile(".+@.+\\.[a-z]+");

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

        System.out
                .println("^^^^^^^Found Number Of Mathes For Email Id's Are--- "
                        + appendrecCount);
        System.out.println("***Number Of Lines Found In File ----" + recCount);

    }

}
