package practise_Java;

public class Interface2_Laptop_HP implements Interface_Laptop{

	@Override
	public void copy() {
		System.out.println("HP laptop - Copy");
		
	}

	@Override
	public void paste() {
		System.out.println("HP laptop - Paste");
		
	}

	@Override
	public void cut() {
		System.out.println("HP laptop - Cut");
		
	}

	@Override
	public void keyboard() {
		System.out.println("HP laptop - Keyboard");
		
	}
	
	

}
