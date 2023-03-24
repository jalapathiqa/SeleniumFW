package practise_Java;

public class loop_While_Fibonacci {

	public static void main(String[] args) {

		int no1 = 1;
		int no2 = 2;
		int count =7;
		int i=1;
				while (i<=count) {
					System.out.println(no1);
					
					
					int sumOfPreTwoNums = no1 + no2;
					no1 = no2;
					no2 = sumOfPreTwoNums;
					i++;
				}
	}
}
