package practise_Java;

public class loop_For_loop_print_Even_Odd_Numbers2 {
	public static void main(String[] args) {
		
		int a[] = {1,4,5,7,3,2,8,11,13,33, 100};
		
		System.out.println("Even Numbers:");
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
			
		}
		
		System.out.println("Odd Numbers: ");
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
			
		}
	}

}
