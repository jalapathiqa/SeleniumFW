package practise_Java;

public class Static_nonStatic2 {
	
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("non-static block");

	}
	
	public Static_nonStatic2() {
		System.out.println("constructor");

	}
	
	public static void main(String[] args) {
		
	System.out.println("main method");
			new Static_nonStatic2();
	}

}
