package practise_Java;

public class loop_For_Fibonicci {

	public static void main(String[] args) {

		int no1 = 1;
		int no2 = 1;
				
		for(int i=1; i<=10; i++) {
			
			System.out.println(no1);
			
			int sumOfPrevTwoNums = no1 + no2;
			
			no1 = no2;
			no2 = sumOfPrevTwoNums;
			
		}
	}
}
