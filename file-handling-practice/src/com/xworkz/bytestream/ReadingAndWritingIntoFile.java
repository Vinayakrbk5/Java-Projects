package com.xworkz.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadingAndWritingIntoFile {

	public static void main(String[] args) {
		try {
		File createFile1=new File("C:\\VinayakWorkspace\\practicefile\\textFile.txt");
//		File createFile2=new File("C:\\VinayakWorkspace\\practicefile\\textFile1.txt");
		
		FileOutputStream out=new FileOutputStream(createFile1);
		out.write(65);
		String str="\n Hello Vinayak";
		byte[] arr=str.getBytes();
		out.write(arr);
		System.out.println("Written successully");
		
		FileInputStream in=new FileInputStream(createFile1);
		in.read();
		char[] charecter=new char[100];
		int i=0;
		while((i=in.read())!=-1)
		{
			System.out.print((byte)i);
			System.out.print((char)i);
			System.out.println();
		}
		
		
	}catch (IOException e) {
		e.printStackTrace();
	}
	}

}
