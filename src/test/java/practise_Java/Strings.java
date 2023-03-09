package practise_Java;

import java.util.Arrays;

public class Strings {
	public static void main(String[] args) {

		String s = "Jalapathi reddy";
		String s4 = "Jalapathi REDDY";

		String s1 = "  Learning SELENIUM with java   ";

		String s2 = new String("  Hello");
		String s3 = new String("  HELLO WOrld");

		System.out.println(s == s1);
		System.out.println(s == s4);

		System.out.println(s2 == s3);// it will compare the address

		System.out.println("**** Equals/equalsignorecase *****");

		System.out.println(s2.equals(s3));// equal will compare the value

		System.out.println(s2.equalsIgnoreCase(s3));

		System.out.println("**** contains *****");

		System.out.println(s2.contains("He"));
		System.out.println(s2.contains("H"));

System.out.println("**** starts with *****");

		System.out.println(s2.startsWith("H"));
		System.out.println(s2.contains("o"));

System.out.println("**** ends with *****");

		System.out.println(s2.endsWith("H"));
		System.out.println(s2.endsWith("o"));

System.out.println("**** length *****");

		System.out.println(s2.length());

System.out.println("**** trimming a word *****");

		System.out.println(s1.length());
		System.out.println(s1);
		System.out.println(s1.trim().length());

System.out.println("**** Lower case / Upper Case *****");
		System.out.println(s3);
		System.out.println(s3.trim().toLowerCase());

		System.out.println(s2);
		System.out.println(s2.trim().toUpperCase());

System.out.println("**** toCharArray *****");
		System.out.println(s3);
		System.out.println(s3.toCharArray());

System.out.println("**** indexOff *****");
		System.out.println(s3);
		
		System.out.println(s3.indexOf("O"));
		System.out.println(s3.lastIndexOf("O"));

System.out.println("**** subString *****");
		System.out.println(s3);
		
		System.out.println(s3.substring(2));
		System.out.println(s3.substring(2, 7));	// print hello only

		System.out.println(s3.substring(8));	// print world only
	
System.out.println("**** split *****");
		String s5 = "Hello Canada vancouver surrey";
		System.out.println(s5);
		
		System.out.println(Arrays.toString(s5.split(" ")));
		
		String s6 = "Hell^o Canada^ vanc^ouver sur^rey";
		System.out.println(s6);
		
		System.out.println(Arrays.toString(s6.split("\\^")));
		
System.out.println("****  count number of words in a string ****");

String s13 = "java is super";
System.out.println("number of characters: "+s13.length());
		
// Write a java program to count the number of words in a string
		// input: java is super 
		// output: 3
int countOfWords = s13.split("\\s").length;

System.out.println("countOfWords: "+countOfWords);

System.out.println("**** charAt *****");	
		System.out.println(s6.charAt(4));
		
System.out.println("**** charAt *****");	
String s7 = "Hello Canada vancouver surrey";
		System.out.println(s7.replace("vancouver", "Surrey"));
		
System.out.println("**** charAt *****");	
		String s8 = "756759";
				System.out.println(s8);
				int i = Integer.valueOf(s8);
//				System.out.println(Integer.valueOf(s8));
				System.out.println(i);
				
				int j = 78919;
				String s9 = String.valueOf(j);
				System.out.println(s9);
				
System.out.println("**** charAt *****");	
				String s10;
				String s11=" ";
				String s12="";
				System.out.println(s11.length());
				System.out.println(s11.isEmpty());
				System.out.println(s11.trim().isEmpty());
				System.out.println(s11.isBlank());

				
	}

}
