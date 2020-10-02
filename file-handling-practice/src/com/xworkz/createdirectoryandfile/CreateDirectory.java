package com.xworkz.createdirectoryandfile;

import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {
		File file=new File("C:\\VinayakWorkspace\\assignments");
		System.out.println("Directory is created :"+file.mkdir());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.canExecute());
		System.out.println(file.setWritable(false));
	}

}
