package regex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

class ChannelBufferCopyFile {
    public static void main(String args[]) {
        FileInputStream fIn;
        FileOutputStream fOut;
        FileChannel fChan;
        FileChannel fChanOut;

        long fSize;
        ByteBuffer mBuf;
        try {
            // First , open a file for input.
            fIn = new FileInputStream("c:/Input.txt");
            fOut = new FileOutputStream("c:/files/Input.txt");

            // Next, Obtain a channel to that file.
            fChan = fIn.getChannel();
            // To Write the File
            fChanOut = fOut.getChannel();

            fChan.transferTo(0, fChan.size(), fChanOut); // Copying from
            // "c:/Input.txt" to
            // "c:/AKGUPTA.txt"
            // fChan.transferFrom(fChanOut, fChan.size(), 0);

            fChan.close();
            fChanOut.close();

        } catch (IOException exc) {
            System.out.println(exc);
            System.exit(1);
        }
    }

}
