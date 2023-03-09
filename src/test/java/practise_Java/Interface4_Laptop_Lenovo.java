package practise_Java;

public class Interface4_Laptop_Lenovo implements Interface_Laptop{

	
	public void copy() {
		System.out.println("Lenovo laptop - Copy");		
	}

	
	public void paste() {
		System.out.println("Lenovo laptop - Paste");
		
	}

	
	public void cut() {
		System.out.println("Lenovo laptop - Cut");
		
	}

	
	public void keyboard() {
		System.out.println("Lenovo laptop - Keyboard");
		
	}
	
	public void camera() {
		System.out.println("Lenovo camera code");
	}
	
	@Override
	public void security() {
		System.out.println("Lenovo Security code");

	}
	
	static void audio() {
		System.out.println("Lenovo Audio Code");

	}
	
	public void overRiding() {
		System.out.println("This is overriding method");
	}

}
