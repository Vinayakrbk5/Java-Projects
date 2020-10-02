package com.xworkz.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		File file=new File("C:\\VinayakWorkspace\\FileHandling\\visit.xlsx");
		System.out.println("Setting not to write:"+file.setWritable(true));
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println("File is created Successfully");
//	try {
//		FileOutputStream out=new FileOutputStream("C:\\VinayakWorkspace\\FileHandling\\test1.txt");
//		try {
//			out.write(67);
//			out.close();
//			System.out.println("Written Successfully");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
	}
}
