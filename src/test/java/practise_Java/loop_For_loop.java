package practise_Java;

public class loop_For_loop {

	public static void main(String[] args) {

//		// Increase print
//		String i = " ";
//		int a =0;
//
//		for (i ="a"; i.length()<=5; i=i+'a') {
//			System.out.println(i);
//		}
//		
//		// decrease print
//		
//		String j = "aaaaa";
//
//		for (j ="aaaaa"; j.length()>=0; j=j.substring(0,j.length()-1)) {
//			System.out.println(j);
//		}
		
		
	// print any word/statement 10 times:
		for (int k = 1; k<=5; k++) {
			System.out.println("Hello World");
			
			
		}
		
		int l;
		for(l=1;;) {
			if(l<=10) {
				System.out.println(l);
				l*=2;
			}
			else
				break;
		}
		

	}
}
