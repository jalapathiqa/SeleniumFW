package practise_Java;

public class Assignment7_While_DoWhile {

	/**
	 * Print 1 to 100 values 
	 * Print even numbers between 200 and 500 
	 * Print the numbers which are divisible by 7 for the range of 150 to 200 
	 * Print the prime numbers between 50 and 150 // don't understand this ?
	 * Print the sum of the even numbers between 40 to 80
	 * Print the odd numbers between 200 to 25 (reverse order)
	 */

	public static void main(String[] args) {

		System.err.println("Print 1 to 100 values");
		print_1To100_Values();

		System.err.println("Print 100 to 1 values - reverse order");
		print_100To1_Values();
		
		System.err.println("Print even numbers between 200 and 500"); 
		print_evenNbr_200To500();
		
		System.err.println("Print the numbers which are divisible by 7 for the range of 150 to 200"); 
		print_150To200_divisibleBy7();
		
		System.err.println("Print the sum of the even numbers between 40 to 80");
		print_evenNumbers_40to80_sumAll();
		
		System.err.println("Print the odd numbers between 200 to 25 (reverse order)");
		print_oddNumbers_200to25_reverseOrder();

	}

	//	Print 1 to 100 values
	public static void print_1To100_Values() {

		int i = 1;
		while (i <= 100) {
			System.out.println(i);
			i++;
		}
	}

	//Print 100 to 1 values - reverse order
	public static void print_100To1_Values() {

		int i = 100;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
	}

	// Print even numbers between 200 and 500
	public static void print_evenNbr_200To500() {
		int i = 200;
		boolean j;
		while (i >= 200 && i <= 500) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
	
	//	 Print the numbers which are divisible by 7 for the range of 150 to 200 

	public static void print_150To200_divisibleBy7() {
		int i =150;
		
		while (i>=150 && i<=200) {
			if(i%7==0) {
				System.out.println(i);
			}
			i++;
		}
	}

	//	Print the prime numbers between 50 and 150 

	//	Print the sum of the even numbers between 40 to 80
	public static void print_evenNumbers_40to80_sumAll() {
		int i = 40;
		int sum=0;
		
		while (i>=40 && i<=80) {
			if(i%2==0) {
				System.out.println(i);
				sum+=i;
				
			}
			i++;
		}
		System.out.println("sum of the even numbers between 40 to 80: "+sum);
	} 	
	
	//	Print the odd numbers between 200 to 25 (reverse order)
	public static void print_oddNumbers_200to25_reverseOrder() {
		int i = 200;
		while (i>=25 && i<=200) {
			if(i%2!=0) {
				System.out.println(i);
			}
			i--;
		}
		
	}

	
	
	
	
}





