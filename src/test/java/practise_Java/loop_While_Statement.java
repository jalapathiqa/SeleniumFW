package practise_Java;

public class loop_While_Statement {

	public static void main(String[] args) {
//		int i = 1;
//		while (i <= 10) {
//
//			System.out.println(i);
//			i++;
//		}
		
//		printNegativeNumbers();
		printEvenNumbers();
	}

	public static void printNegativeNumbers() {
		int i = -1;
		while (i >= -10) {
			System.out.println(i);
			i--;
		}
	}
	
	public static void printEvenNumbers() {
		
		int i = 2;
		while (i<=10) {
			System.out.println(i);
			i++;
			
		}
	}
}
