package practise_Java;

public class OOPs_Polymorphism_methodOverlaoding {

	public int add() {
		int a=5;
		int b=5;
		int z = a+b;
		
		return z;		
	}

	public void add(int a, int b) {
		int x = a+b;
		System.out.println(x);
	}
	
	public void add(int a, int b, int c) {
		int y = a+b+c;
		System.out.println(y);
	}

}
