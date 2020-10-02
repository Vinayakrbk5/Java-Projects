package com.xworkz.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

	public static void main(String[] args) {
		File file=new File("C:\\VinayakWorkspace\\FileHandling\\test.txt");
		try(FileOutputStream out = new FileOutputStream(file);) 
		{
			
				out.write(65);
				
				String str="Hello World!!!";
				byte[] bytes=str.getBytes();
				out.write(bytes);
				System.out.println("Successfully written");
				out.close();
			}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		try(FileInputStream in=new FileInputStream(file);) {
			
			
			int i=0;
			while((i=in.read())!=-1)
					{
				System.out.print((char)i);
					}
			
			
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

