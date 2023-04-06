package practise_Java;

public class Print_Nuber_Of_Digits {
	public static void main(String[] args) {
		
		int num=123456789;
		int noOfDigits=0;
		
		while (num!=0) {
			num=num/10;
			noOfDigits++;
		}
		System.out.println(noOfDigits);
	}

}
