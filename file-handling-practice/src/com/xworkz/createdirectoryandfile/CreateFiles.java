package com.xworkz.createdirectoryandfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFiles {

	public static void main(String[] args) {
		System.out.println("Start Creating files :");
		File file = new File("C:\\VinayakWorkspace\\assignments\\text.txt");
		File file1 = new File("C:\\VinayakWorkspace\\assignments\\jpgImage.jpg");
		File file2 = new File("C:\\VinayakWorkspace\\assignments\\textDoc.doc");
		File file3 = new File("C:\\VinayakWorkspace\\assignments\\Htmltext.html");
		File file4 = new File("C:\\VinayakWorkspace\\assignments\\Pngtext.png");
//	file.mkdir();
		try {
			file.createNewFile();
			file1.createNewFile();
			file2.createNewFile();
			file3.createNewFile();
			file4.createNewFile();
		} catch (IOException e) {
			System.err.println("File not found in the directory");
		}

		System.out.println("\n End of Files Creation \n");
//	System.out.println("deleted successfully:"+file1.delete());

		File readFiles = new File("C:\\VinayakWorkspace\\assignments");
		String[] list = readFiles.list();
		System.out.println("Files created in \"assignment\"  directory are");
		int count = 0;
		for (String files : list) {
			System.out.println("\t" + (++count) + "). " + files);
		}

		System.out.println("\n End of reading files :");
		System.out.println();
		System.out.println("\n Start: writing into files");
		try (FileOutputStream out1 = new FileOutputStream("C:\\VinayakWorkspace\\assignments\\text.txt");
				FileOutputStream out2 = new FileOutputStream("C:\\VinayakWorkspace\\assignments\\textDoc.doc");
				FileOutputStream out3 = new FileOutputStream("C:\\VinayakWorkspace\\assignments\\Htmltext.html");
				FileInputStream in1 = new FileInputStream("C:\\VinayakWorkspace\\assignments\\text.txt");
				FileInputStream in2 = new FileInputStream("C:\\VinayakWorkspace\\assignments\\textDoc.doc");
				FileInputStream in3 = new FileInputStream("C:\\VinayakWorkspace\\assignments\\Htmltext.html"))
		{
			out1.write('1');
			out1.write(')');
			String strArg="This is from text file.\n This is India and Capital of India is Delhi.";
			byte[] textBytes=strArg.getBytes();
			out1.write(textBytes);
			System.out.println("Successfully written into text.txt file");
			System.out.println();
			
			out2.write('2');
			out2.write(')');
			String strArg1="This is from textDocument file.\n This is Karnataka and capital of Katnataka is Delhi.";
			byte[] DdocBytes=strArg1.getBytes();
			out2.write(DdocBytes);
			System.out.println("Successfully written into textDoc.txt file");
			System.out.println();
			
			out3.write('3');
			out3.write(')');
			String strArg3="This is from Htmltext file.\n This is Bagalkot and is one of District of Karnataka.";
			byte[] htmlBytes=strArg3.getBytes();
			out3.write(htmlBytes);
			System.out.println("Successfully written into Htmltext.html");
			System.out.println("\n End : writing int to files");
			
			System.out.println("\n Start : reading contents from files \n");
			
			System.out.println("reading from \"text.txt\" file");
			int i=0;
			while((i=in1.read())!=-1)
			{
				System.out.print((char)i);
			}
			System.out.println();
			
			System.out.println("\n reading from \"textDoc.doc\" file");
			while((i=in2.read())!=-1)
			{
				System.out.print((char)i);
			}
			System.out.println();
			
			System.out.println("\n reading from \"Htmltext.html\" file");
			while((i=in3.read())!=-1)
					{
				System.out.print((char)i);
					}
			System.out.println("\n \n End : reading contents from files");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
