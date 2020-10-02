package com.xworkz.createdirectoryandfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DeleteExistingDirectory {

	public static void main(String[] args) {
		File file=new File("C:\\VinayakWorkspace\\xworkzfiles");
		System.out.println(file.mkdir());;
		System.out.println(file);
		System.out.println();
//		file.delete();
		
		try {
			FileOutputStream out=new FileOutputStream("C:\\\\VinayakWorkspace\\xworkzfiles\\testcase.txt");
			
				out.write('C');
				System.out.println("Written");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("not written");
			e.printStackTrace();
		}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
