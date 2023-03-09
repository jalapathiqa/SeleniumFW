package practise_Java;

public class OOPs_Abstraction {
	
	public static void main(String[] args) {

		Interface_Laptop lenovo = new Interface4_Laptop_Lenovo();
		lenovo.copy();
		lenovo.paste();
		
		Interface_Laptop apple = new Interface3_Laptop_Apple();
		
		apple.keyboard();
		apple.cut();
		
				
	}

}
