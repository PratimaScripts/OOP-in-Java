package regex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

class ChannelBufferDeleteFile {
	public static void main(String args[]) {
		File inputFile;
		File outPutFile;
		FileInputStream fIn;
		FileOutputStream fOut;
		FileChannel fChan;
		FileChannel fChanOut;
		long fSize;
		ByteBuffer mBuf;
		try {

			inputFile = new File("c:/AKGUPTA.txt");
			// First , open a file for input.
			fIn = new FileInputStream(inputFile);
			// inputFile.m

			outPutFile = new File("c:/files/AKGUPTA.txt");

			fOut = new FileOutputStream(outPutFile);

			// Next, Obtain a channel to that file.
			fChan = fIn.getChannel();
			// To Write the File
			fChanOut = fOut.getChannel();

			fChan.transferTo(0, fChan.size(), fChanOut); // Copying from
															// "c:/Input.txt" to
															// "c:/AKGUPTA.txt"

			// fChan.transferFrom(fChanOut, fChan.size(), 0);

			fChan.close();
			inputFile.delete(); // after Copying delete the file in InputFile.

		} catch (IOException exc) {
			System.out.println(exc);
			System.exit(1);
		}
	}

}
