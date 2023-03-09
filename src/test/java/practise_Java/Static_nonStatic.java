package practise_Java;

import java.util.Random;

public class Static_nonStatic {
	
	static int number;
	static int number1 = new Random().nextInt(100);
	
	public static void main(String[] args) {
//		Static_nonStatic static1 = new Static_nonStatic();
//		static1.number = new Random().nextInt(100);
//		
//		Static_nonStatic static2 = new Static_nonStatic();
//		static2.number = new Random().nextInt(1000);
//		
//		Static_nonStatic static3 = new Static_nonStatic();
//		static3.number = new Random().nextInt(10000);
		
//		System.out.println(static1.number);
//		System.out.println(static2.number);
//		System.out.println(static3.number);

		System.out.println(number1);
		
		
	}
	
	public static void print() {
		System.out.println("static method");
	}
	
	public  void print2() {
		System.out.println("non-static method");
	}

}
