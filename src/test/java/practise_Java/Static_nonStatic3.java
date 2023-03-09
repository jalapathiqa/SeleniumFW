package practise_Java;

import java.util.Random;

public class Static_nonStatic3 {
	
	static int number1 = new Random().nextInt(100);
	
	public static void main(String[] args) {

		System.out.println(number1);
		Static_nonStatic.print();
		new Static_nonStatic().print2();				
	}
	
}
