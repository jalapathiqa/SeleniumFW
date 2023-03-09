package practise_Java;

import java.util.Scanner;

public class Assignment6_Student_Grading_System_SwitchCase {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student marks here: ");
		int marks = scanner.nextInt();
		switch (marks) {
		case (35):
			System.out.println("Sorry to say this but you are failed in your exam, better luck next time");
			break;
		case(85):
			System.out.println("Congratulations you passed in First Class");
			break;
		case(70):
			System.out.println("Congratulations you passed in third class, needs more focus on studies");
			break;
		default:
			System.out.println("PASS");

			break;
		}
	}
}
