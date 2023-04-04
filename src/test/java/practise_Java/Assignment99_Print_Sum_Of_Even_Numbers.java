package practise_Java;

public class Assignment99_Print_Sum_Of_Even_Numbers {

	public static void main(String[] args) {

//		int sSum = 8;
//		int eNum = 250;
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = i + sum;

			}
			System.out.println(sum);
		}

	}
}
