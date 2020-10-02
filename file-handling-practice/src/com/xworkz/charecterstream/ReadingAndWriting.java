package com.xworkz.charecterstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingAndWriting {

	public static void main(String[] args) {
		File file=new File("C:\\VinayakWorkspace\\charecterstream\\textfile1.txt");
			try (FileWriter writing=new FileWriter(file);){
				
				writing.write("Hello Vinayak !!! how are you");
				writing.append("Bangalore");
				writing.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try (FileReader reader=new FileReader(file);){
				char[] charArray=new char[100];
					reader.read(charArray);
					for(char ch:charArray)
					{
						System.out.print(ch);
					}
					
					String str=new String(charArray);
					System.out.println("The String is "+str);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 catch (IOException e) {
				e.printStackTrace();
			}
	}

}
