package practise_Java;

import java.util.Scanner;

public class userInput {
	public static void main(String[] args) {


	Scanner scan = new Scanner(System.in);
	System.out.println("What is your name: ");
	
	// text line of data should be used as , scanner.nextline (like String)
	String name = scan.nextLine();
//	System.out.println("Hey "+name+" how are you?");
	System.out.printf("Hey %s, How are you? \n", name);
	String status = scan.nextLine();
	
	System.out.println("Where are you from ?");
	String city = scan.nextLine();
	System.out.println("What is your Mobile #?");
	int mobile = scan.nextInt();
	
	scan.close();

		
	}

}
