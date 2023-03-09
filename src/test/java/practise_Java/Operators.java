package practise_Java;

public class Operators {

	public static void main(String[] args) {
//
		int i = 20;
		int j = 6;

		//		System.out.println("***  Arithmetic Operators ***");

		//		System.out.println(i+j);
		//		System.out.println(i-j);
		//		System.out.println(i*j);
				System.out.println(i/3); // quotient 6/20=3 (3 is quotient)
		//		System.out.println(i%j); // reminder 6/20=3 (2 is reminder
		//
		//		System.out.println("***  Unary Operators - incrementation ***");
		//
		//		
		//		System.out.println(i);
		//		System.out.println(++i);
		//		System.out.println(i++);
		//		System.out.println(i);
		//		
		//		System.out.println("***  Unary Operators - decrementation ***");
		//		
		//		System.out.println(i);
		//		System.out.println(--i);
		//		System.out.println(i--);
		//		System.out.println(i);

		//		System.out.println("***  Relational Operators  ***");
		//
		//		System.out.println(i==j);
		//		System.out.println(i!=j);
		//		System.out.println(i<j);
		//		System.out.println(i<=j);
		//		System.out.println(i>j);
		//		System.out.println(i>=j);

		int m=9;
		int n=5;
		//		System.out.println("***  Conditional && AND ***");
		//
		//		System.out.println(m>n && n<m); // true-true=true
		//		System.out.println(m>n && n==m); // true-false=false
		//		System.out.println(m<=n && n!=m); // false-true=false
		System.out.println(m<n && n>=m); // false-false=false

		System.out.println("***  Conditional || OR ***");

		System.out.println(m>n || n<m); // true-true=true
		System.out.println(m>n || n==m); // true-false=false
		System.out.println(m<=n || n!=m); // false-true=false
		System.out.println(m<n || n>=m); // false-false=false

	}
}
