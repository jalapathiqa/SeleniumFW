
package practise_Java;

import java.util.Scanner;

public class condiionalStatements2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your online assessment status: ");
//		String examStatus = "Pass";
		
		String examStatus = scanner.nextLine();
		
		if(examStatus.equals("Pass")) {
			System.out.println("1st round cleared, Please wait for further instructions to attend round 2nd");
//			String round2Status = "Pass";
			System.out.println("What is your 2nd round status");

			String round2Status = scanner.nextLine();

			if(round2Status.equals("Pass")) {
				System.out.println("2nd round cleared, wait for the HR call to discuss the package");
//				String round3Status = "Pass";
				
				System.out.println("What is your 3rd round status");
				String round3Status = scanner.nextLine();

				if(round3Status.equals("Pass")) {
					System.out.println("Congratulation, you are hired");
				}else {
					System.out.println("sorry to inform you that , your hiring process ends here");
				}
			}else
			{
				System.out.println("sorry to inform you that , your hiring process ends here");

			}
		}else {
			System.out.println("sorry to inform you that , your hiring process ends here");
		}
	}
}
