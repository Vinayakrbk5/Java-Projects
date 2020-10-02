package com.xworkz.generator;

import java.util.Random;

public class Tester {

	public static void main(String[] args) {
	      System.out.println(generatePassword(8));
	   }

	   private static String generatePassword(int length) {
	      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	     System.out.println(lowerCaseLetters);
	     System.out.println(lowerCaseLetters.charAt(25));
	      Random random = new Random();
	      char[] password = new char[length];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      System.out.println("LowerCase Letter :"+random.nextInt(lowerCaseLetters.length())+" : "+password[0]);
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      System.out.println("Uppercase Letter :"+random.nextInt(capitalCaseLetters.length())+" : "+password[1]);
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	      System.out.println(password);
	   
	      for(int i = 4; i< length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	         System.out.println("Combine : "+random.nextInt(combinedChars.length()));
	      }
	      String str=new String(password);
	      return str;
	   }

}