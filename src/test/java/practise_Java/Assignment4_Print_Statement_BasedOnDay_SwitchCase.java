package practise_Java;

import java.util.Scanner;

public class Assignment4_Print_Statement_BasedOnDay_SwitchCase {
	
	/*
	 * print statemnt based on day name: 
	 * 1. Monday to Friday -> Uff, It's a weekday
	 * 2. Satuday & Sunday -> Yayy, It's a weekend
	 */	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter present Day: ");
		String day = scanner.nextLine();
		
//		String day = "Yayy, It's a weekend";

		switch (day) {
		case "Saturday":
			System.out.println("Yayy, It's a weekend");
			break;
		case "Sunday":
			System.out.println("Yayy, It's a weekend");
			break;
		default:
			System.out.println("Uff, It's a weekday");
			break;
		}
	}

}