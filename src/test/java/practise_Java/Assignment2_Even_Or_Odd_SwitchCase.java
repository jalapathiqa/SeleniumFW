package practise_Java;

import java.util.Scanner;

public class Assignment2_Even_Or_Odd_SwitchCase {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number to find out it's an Even number or Odd number");
		int num = scanner.nextInt();
		
		switch (num) {
		case 8:
			if(num%2==0) {
			System.out.println("Entered number is Even");
			}
			break;
		case 100:
			if(num%2==0) {
			System.out.println("Entered number is Even");
			}
			else {
				System.out.println("Entered number is Odd number");
			}
			break;

		default:
			System.out.println("it's Odd number");

			break;
		}
	}
}
