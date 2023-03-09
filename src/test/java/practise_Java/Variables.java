package practise_Java;

public class Variables {
	/*
	 * Instance Variables (non-static): should be declared at Class level, if you
	 * want to use Instance variables, you should create instances (Object) of the Class.
	 */
		int id = 101;
		String name = "Reddy";

		
	// Static Variables;
		static int rollNum;
	
	public static void main (String[]args) {
		
	// variable syntax: Datatype variableName = Value;
		int pinCode = 50085;
		
		System.out.println(pinCode);

		
	// Define & initialization; 
		int phone;
		phone = 1234567890;
		phone = 987654321;
		
		System.out.println(phone);
		
	// Instance Variables: should be declared at Class level
		Variables var = new Variables();
		System.out.println("Instance Variable id:..." +var.id);
		
		System.out.println("accessing instance variable:..."+new Variables().name);
		
	// Static Variables:
		System.out.println("Static Variable rollNum:..."+rollNum);
		System.out.println("Static Variable rollNum:..."+rollNum);

	// Create Instance/Object to access methods of the Class (non static):
		new Variables().test1();
		test1();
		new Variables().test2(222);
		
	// local Variables: can be used directly without creating any instance/object of the class:
		int pageNum = 102;
		System.out.println("Local variable:..."+pageNum);

	// Parameters: it is declared in methods definition:
		
		
	}
	
	public static void test1() {
		System.out.println("Static Variable accessing from difference method:..."+rollNum);
	}
	
// Parameter:	 
	public void test2(int pin) {
	// pin = 100;
		System.out.println("Parameter accessing:..."+pin);
	}

}
