package practise_Java;

import java.util.Scanner;

public class Numbers_Even_Or_Odd {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number to find out it's an Even number or Odd number");
		int num = scanner.nextInt();
		if(num%2 == 0) {
			System.out.println("Entered number is Even");

		}else {
			System.out.println("it's Odd number");
		}

	}
}
