package regex;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

class ExplicitChannelRead
{
	public static void main(String args[])
	{
		FileInputStream fIn;
		FileChannel fChan;
		long fSize;
		ByteBuffer mBuf;
		try{
			// First , open a file for input.
			fIn = new FileInputStream("c:/Input.txt");
			
			// Next, Obtain a channel to that file.
			fChan = fIn.getChannel();
			
		
			
			// Now, get the file's size.
			fSize = fChan.size();
			
			// Allocate a buffer of the necessary size.
			mBuf = ByteBuffer.allocate((int)fSize);
			
			
			System.out.println(fSize+"==fchan size=="+"mBuf Size is=="+mBuf.capacity());
			// Read the file into the buffer.
			fChan.read(mBuf);
			
			// Rewind the Buffer so that it can be read.
			mBuf.rewind();
			
			// Read bytes from the buffer.
			for(int i=0;i<fSize;i++)
			
				System.out.print((char)mBuf.get());
				System.out.println();
			fChan.close(); // close channel
			fIn.close(); // cloase File
			}catch(IOException exc)
			{
				System.out.println(exc);
				System.exit(1);
			}
		}
	
	}
