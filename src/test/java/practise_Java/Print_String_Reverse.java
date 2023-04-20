package practise_Java;

public class Print_String_Reverse {

	public static void main(String[] args) {

		String s = "IHTAPALAJ";
//
////		StringBuffer sb = new StringBuffer();
//		StringBuilder sb = new StringBuilder();
//		sb.append(s);
//		sb.reverse();
//		
//		System.out.println(sb);
		
		for (int i= s.length();i>0; i--) {
			System.out.print(s.charAt(i-1));
			
		}
		
	}

}
