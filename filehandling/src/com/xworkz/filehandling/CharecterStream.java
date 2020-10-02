package com.xworkz.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharecterStream {

public static void main(String[] args) {
	File file=new File("textfile1.txt");
	
	try (FileWriter writer = new FileWriter(file);){
		
		writer.write(" Hello World");
		writer.write("\n India is Second Largest populated Country in the world");
		writer.flush();
		System.out.println("File is created successfully");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try (FileReader read1=new FileReader(file);){
		
//			int str=read1.read();
			char[] charecter=new char[55];
			read1.read(charecter);
//			for(char c:charecter)
//				System.out.print(c);
			
			String str1=new String(charecter);
			System.out.println(str1);
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	
	
}
