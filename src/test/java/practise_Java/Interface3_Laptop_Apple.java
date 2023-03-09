package practise_Java;

public class Interface3_Laptop_Apple implements Interface_Laptop{

	@Override
	public void copy() {
		System.out.println("Apple laptop - Copy");
		
	}

	@Override
	public void paste() {
		System.out.println("Apple laptop - Paste");
		
	}

	@Override
	public void cut() {
		System.out.println("Apple laptop - Cut");
		
	}

	@Override
	public void keyboard() {
		System.out.println("Apple laptop - Keyboard");
		
	}
	
	

}
