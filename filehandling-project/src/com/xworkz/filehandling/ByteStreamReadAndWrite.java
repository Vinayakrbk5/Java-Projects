package com.xworkz.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ByteStreamReadAndWrite {

	public static void main(String[] args) {
//		File file = new File("C:\\VinayakWorkspace\\xworkz\\textfile.txt");

		try {
//			FileOutputStream out = new FileOutputStream(file);
			FileReader
//				out.write(65);// 01100101
//
//				String str = new String("Xworkz hello world !!......");
//				byte[] bytes = str.getBytes();
//				out.write(bytes);
//				out.flush();
//				System.out.println("written Successfully");
//				
//				System.out.println("--------------------------------------");
				
				FileInputStream file=new FileInputStream("C:\\VinayakWorkspace\\xworkz\\textfile.txt");
				int i=0;
				if((i=file.read())!=-1)
				{
					System.out.print((char)i);
				}
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}