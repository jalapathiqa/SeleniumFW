package practise_Java;

import java.util.Scanner;

public class Assignment5_Student_Grading_System_IfElse {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student marks here: ");
		int marks = scanner.nextInt();
		if(marks<35) {

			System.out.println("Sorry to say this but you are failed in your exam, better luck next time");

		} else if(marks>=85) {

			System.out.println("Congratulations you passed in First Class");

		}else if(marks>35 && marks<70) {
			System.out.println("Congratulations you passed in third class, needs more focus on studies");

		}else if(marks>=70 && marks<85)	{
			System.out.println("Congratulations you pass in second class, needs more focus on studies");
		}
		else {
			System.out.println("PASS");
		}
	}
}
