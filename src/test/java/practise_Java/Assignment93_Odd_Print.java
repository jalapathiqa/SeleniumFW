package practise_Java;

public class Assignment93_Odd_Print {

	public static void main(String[] args) {

		int number=10;
		
		for (int i = 0; i < number; i++) {
			
			if(i%2==0) {
				System.out.println("even number:");
				System.out.println(i);
			} else if(i%2!=0){
				System.out.println("odd number:");
				System.out.println(i);
			}
						
		}

		
		for (int k=0; k<number; k++) {
			
			if(k%2!=0) {
				System.out.println("odd number:.."+k);
			}
						
		}
	}

}
