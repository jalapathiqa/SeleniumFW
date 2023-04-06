package practise_Java;

public class Print_Swap_Two_Numbers {

	public static void main(String[] args) {
		
		int x=1;
		int y=2;
		
		System.err.println("before swap value of X: "+x);
		System.err.println("before swap value of y: "+y);
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.err.println("after swap value of X: "+x);
		System.err.println("after swap value of y: "+y);

				
	}
	
}
