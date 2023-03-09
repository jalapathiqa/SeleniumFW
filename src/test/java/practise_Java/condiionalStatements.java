
package practise_Java;

public class condiionalStatements {

	public static void main(String[] args) {
		
		int i = 1;	
		if(i<0) {
			System.out.println("The given number is a negetive number");
			for (int j = -1; j >= -10; j--) {
				System.out.println(j);
			}			
		}else {
			System.out.println("The given number is positive number");
			for(int k= 1; k <=10; k++) {
				System.out.println(k);
			}
		}

	}
}
