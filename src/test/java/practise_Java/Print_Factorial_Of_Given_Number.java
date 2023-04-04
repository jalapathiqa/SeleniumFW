package practise_Java;

import java.util.Iterator;

import io.reactivex.rxjava3.internal.operators.single.SingleFromUnsafeSource;

public class Print_Factorial_Of_Given_Number {

	public static void main(String[] args) {

//		int num=8;
		int factorial=1;

		for (int i = 1; i <=8; i++) {
			factorial=factorial*i;
			System.out.println(factorial);
		}
		
	}

}
