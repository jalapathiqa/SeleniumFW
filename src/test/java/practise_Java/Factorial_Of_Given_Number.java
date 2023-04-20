package practise_Java;

import java.util.Iterator;

import io.reactivex.rxjava3.internal.operators.single.SingleFromUnsafeSource;

public class Factorial_Of_Given_Number {

	public static void main(String[] args) {

		int factorial=1;
		int num=5;
		
		for (int i = 1; i <=num; i++) {
			factorial=factorial*i;
			System.out.println(factorial);
		}

		
	}

}
