package practise_Java;

public class Interface5_User {
	
	public static void main(String[] args) {
		
		Interface3_Laptop_Apple apple = new Interface3_Laptop_Apple();
		apple.copy();
		apple.cut();
		apple.paste();
		apple.keyboard();
		
		Interface4_Laptop_Lenovo lenovo = new Interface4_Laptop_Lenovo();
		lenovo.security();
	}

}
