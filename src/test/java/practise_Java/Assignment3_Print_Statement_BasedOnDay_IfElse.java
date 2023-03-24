package practise_Java;

import java.util.Scanner;

public class Assignment3_Print_Statement_BasedOnDay_IfElse {
	
	/*
	 * print statemnt based on day name: 
	 * 1. Monday to Friday -> Uff, It's a weekday
	 * 2. Satuday & Sunday -> Yayy, It's a weekend
	 */	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter present Day: ");
		String presentDay = scanner.nextLine();
		
		if(presentDay.equals("Saturday") || presentDay.equalsIgnoreCase("Sunday")) {
			System.out.println("Yayy, It's a Weekend");
			
		}else{
			System.out.println("Uff, It's a Weekday");

		}
	}

}