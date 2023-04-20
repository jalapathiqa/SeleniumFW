package practise_Java;

import org.junit.jupiter.api.condition.DisabledIfSystemProperties;

public class Sum_Of_Even_Numbers {

	public static void main(String[] args) {

			int sum=0;
		for (int i = 8; i <=250; i++) {
			
			if(i%2==0) {
				sum=sum+i;
			}
			System.out.println(sum);

		}
	}

}
