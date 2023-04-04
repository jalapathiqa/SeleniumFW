package practise_Java;

import org.junit.jupiter.api.condition.DisabledIfSystemProperties;

public class Print_Fabonicci {

	public static void main(String[] args) {

		
		int num=10;
		
		int n1=0, n2=1, n3;
		
		for(int i=0; i<=num; i++){
		
			System.out.println(n1);
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		

	}

}
