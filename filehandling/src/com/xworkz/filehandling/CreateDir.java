package com.xworkz.filehandling;

import java.io.File;

public class CreateDir {
	public static void main(String[] args) {
		
	

	File file=new File("C:\\VinayakWorkspace\\FileHandling");
	System.out.println("Does folder exists :"+file.exists());
	System.out.println(file.mkdir());;
	
	System.out.println("Successfully created first directory");
	System.out.println("Can we right into the folder:"+file.canWrite());
	System.out.println("Can we reda the folder:"+file.canRead());
	System.out.println("absolute path:"+file.getAbsolutePath());
	System.out.println("Setting not to write:"+file.setWritable(false));
	
	String[] files=file.list();
	System.out.println("The files are:");
//	for(String f:files)
//	{
//		System.out.println(f);
//	}
//	
//	file.delete();
//	file.setWritable(writable, owneronly);//
	}
}
