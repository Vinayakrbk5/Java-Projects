package com.xworkz.bytestream;

import java.io.File;
import java.io.IOException;

public class BasicMethodsOfFileHandling {

	public static void main(String[] args) {
		try {
		File createDir =new File("C:\\VinayakWorkspace\\practicefile");
		System.out.println("is Directory created successfully :"+createDir.mkdir());
		System.out.println("delete directory "+createDir.delete());
		File createFile1=new File("C:\\VinayakWorkspace\\practicefile\\textFile.txt");
		File createFile2=new File("C:\\VinayakWorkspace\\practicefile\\textFile1.txt");
//		File createFile3=new File("C:\\VinayakWorkspace\\assignments\\Htmltext.html");
		File createFile4=new File("C:\\VinayakWorkspace\\practicefile\\Htmltext.txt");
//		createFile4.createNewFile();
//		createFile4.delete();
		
			System.out.println("is file created successfully :"+createFile1.createNewFile());
			System.out.println("is file created successfully :"+createFile2.createNewFile());
//			System.out.println("is file created successfully :"+createFile3.createNewFile());
			
//			createFile1.delete();
//			createFile2.delete();
			
//			System.out.println("delete directory "+createDir.delete());
		
			
			int valid=createFile1.compareTo(createFile1);
			System.out.println("Comaparing using campare method "+valid);
			
			boolean check=createFile1.equals(createFile2);
			System.out.println("comparing two files using equlas method "+check);
			
			boolean exists=createFile1.exists();
			System.out.println("File exists :"+exists);
			
			System.out.println("getAbsoluteFile()"+createFile1.getAbsoluteFile());
			System.out.println("getAbsolutePath()"+createFile1.getAbsolutePath());
			
			System.out.println(".getCanonicalPath()"+createFile1.getCanonicalPath());
			
			System.out.println("File name "+createFile1.getName());
			System.out.println("Directory Name "+createDir.getName());
			
			System.out.println("getParent()"+createDir.getParent());
			System.out.println("getParent()"+createFile1.getParent());
			
			System.out.println("getPath()"+createFile1.getPath());
			
			System.out.println("getTotalSpace() for file "+createFile1.getTotalSpace());
			System.out.println("getTotalSpace() for file "+createDir.getTotalSpace());
			
			System.out.println("getUsableSpace() "+createFile1.getUsableSpace());
			
			System.out.println("isAbsolute() "+createFile1.isAbsolute());
			System.out.println("isFile() "+createFile1.isFile());
			System.out.println("isFile() "+createDir.isFile());
			
			System.out.println("length() "+createFile1.length());
			System.out.println("isDirectory() "+createFile1.isDirectory());
			
			System.out.println(createFile1.renameTo(createDir));
			System.out.println(createFile1.setWritable(true));
			
			System.out.println(createFile1.renameTo(createFile4));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
