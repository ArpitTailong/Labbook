package com.capg.Lab8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ThreadOperations {

	public static void main(String[] args) throws FileNotFoundException {
	
		String inFile = "D:\\CAPGEMINI SOFTWARES\\COREJAVA-WORKSPACE\\Labbook-Arpit\\src\\com\\capg\\Lab8\\source.txt";
		String outFile = "D:\\CAPGEMINI SOFTWARES\\COREJAVA-WORKSPACE\\Labbook-Arpit\\src\\com\\capg\\Lab8\\target.txt";
		
		File iFile = new File(inFile);
		File oFile = new File(outFile);
		
		InputStream is = null;
		OutputStream os = null;
		
		is = new FileInputStream(iFile);
		os = new FileOutputStream(oFile);
		
		CopyDataThread c1 = new CopyDataThread(is, os);
		Thread t = new Thread(c1);
		t.start();
	}
}
class CopyDataThread extends Thread {
	
	InputStream is = null;
	OutputStream os = null;
	public CopyDataThread(InputStream is, OutputStream os) {
		this.is = is;
		this.os = os;
	}

	public void run() {
			
			int read, count = 0;
			try {
				while((read=is.read())>0) {
					count++;
					if(count == 10) {
						os.write(read);
						System.out.println("10 characters are copied");
						Thread.sleep(5000);
					}
					else {
						os.write(read);
					}
					
				}
				os.flush();
			} catch (IOException | InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
	}
}

