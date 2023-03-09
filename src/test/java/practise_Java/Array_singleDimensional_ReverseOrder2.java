package practise_Java;

public class Array_singleDimensional_ReverseOrder2 {
	public static void main(String[] args) {
		
		int i[] = {3, 6, 1, 10, 4,34,23,56};
		
		for (int j=0; j<i.length ; j++) {
			System.out.println(i[j]);
			
		}
		
		System.out.println(" Array in reverse order");
		
		int k[] = {3, 6, 1, 10, 4,34,23,56};

		for (int l=k.length-1; l>=0 ; l--) {
			System.out.println(k[l]);
			
		}
		
//		String i[] = {"coffee", "water", "chai","diet coke"};
//		for (int j=i.length-1; j>=0; j--) {
//			System.out.println(i[j]);
//		}
		
		
	}

}
