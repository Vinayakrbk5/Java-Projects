package com.xworkz2;

public class StringJava {

	public static void main(String[] args) {
		String MyString="Hello World";//   "Hello "+"World"      is also ok
		char a[]= {'a','e','i','o','u'};
		int StringLength=MyString.length();
		String StringUpper=MyString.toUpperCase();
		String StringLowerr=MyString.toLowerCase();
		
		System.out.println(MyString);
		System.out.println(StringLength);
		System.out.println(StringUpper);
		System.out.println( StringLowerr);
		System.out.println( MyString.indexOf('l'));
		System.out.println( MyString.replace('l', 'V'));
		System.out.println( MyString.isEmpty());
		System.out.println( MyString.toCharArray());
		//System.out.println(a.toString());           it is wrong
	}

}
