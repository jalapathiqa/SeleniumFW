package practise_Java;

import java.lang.reflect.Array;
import java.util.Arrays;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Assignment91_String {

	public static void main(String[] args) {
		
// Write a java program to count the number of characters in a string
// input: java is super 
// output: 13
		
		String s1 = "java is super";
		System.out.println("number of characters: "+s1.length());
				
// Write a java program to count the number of words in a string
				// input: java is super 
				// output: 3
		int countOfWords = s1.split("\\s").length;
		System.out.println("countOfWords: "+countOfWords); 
		
		
// write a java to count the total number of occurrences of a given character in a string
//		input: Hello world & targe character: l
//		output: 3
		
		String s2 = "Hello world";

// Write a java program to reverse a string
		// input: java is super
		// output: repus si avaj
		
		String s3 = "java is super";
		
		System.out.println("****   separate each char from a string a print ****");
		char ch;
		
		for (int i = 0; i <s3.length(); i++) {

			ch = s3.charAt(i);
			System.out.println(ch);
			
		}
		
		System.out.println("****   Reverse a String and print ****");
		
		StringBuilder s4 = new StringBuilder();
		s4.append(s3);
		s4.reverse();
		System.out.println(s4);
		
// Write a java program to remove all starting and ending spaces from a string
		
		String s5 = "   hello world   ";
		System.out.println(s5.trim());
		
		
			
		

	

		

	}
}
