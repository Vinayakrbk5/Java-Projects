package com.xworkz.createdirectoryandfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DeleteExistingFile {

public static void main(String[] args) {
	File file=new File("C:\\VinayakWorkspace\\xworkzfiles\\testcase1.txt");
	File file1=new File("C:\\VinayakWorkspace\\xworkzfiles\\testcase1.pdf");
	try {
		System.out.println(file.createNewFile());
		System.out.println(file1.createNewFile());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Directory is created \' successfully");
//	System.out.println(file.delete());
//	System.out.println(file.delete());
//	System.out.println(file.setWritable(false));
	
	try {
		FileOutputStream out=new FileOutputStream("C:\\\\VinayakWorkspace\\xworkzfiles\\testcase1.pdf");
		
			out.write('C');
			System.out.println("Written successfully");
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
