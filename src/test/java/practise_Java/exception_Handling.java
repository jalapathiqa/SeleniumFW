package practise_Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class exception_Handling {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("Program execution started");
		System.out.println();

		int a = 9;
		int b = 0;

		int c;

		try {
			c = a / b;
			System.out.println("Result: " + c);

		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println(Arrays.toString(e.getStackTrace()));

//		throw e;
		} finally {
			System.out.println("Finally block will execute whether there is an exception or NOT");

		}

		System.out.println();

		System.out.println("Program execution ended");

	}

}
