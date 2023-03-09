package practise_Java;

public class Array_twoDimensional {
	public static void main(String[] args) {
		
		
//		int [][] arr = new int [3][2] ;
//		arr[0][0]=1;
//		arr[0][1]=2;
//
//		arr[1][0]=3;
//		arr[1][1]=4;
//		
//		arr[2][0]=5;
//		arr[2][1]=6;
		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
		
//		for (int i = 0; i < arr.length; i++) {
//			int[] singleRow = arr[i];
//			
//			for (int j = 0; j < singleRow.length; j++) {
//				System.out.print(singleRow[j]+ "  ");
//			}
//			System.out.println();
//
//
//		}
//		
//		System.out.println("different method");
//		System.out.println();
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]+ "  ");				
//			}
//			System.out.println();
//			
//		}
		
		
//		Print size/no of values
//		int size=0;
//		for (int i = 0; i < arr.length; i++) {
//			size+=arr[i].length;
//		}
//		System.out.println("No of values in Array: " +size);
	
		
//		int [][] arr = {
//				{1,2}, 
//				{3,4}, 
//				{5,6}
//			};
		
		int [] [] arr = new int [3] [2];
		arr[0] = new int[] {1,2};
		arr[1] = new int[] {3,4};
		arr[2] = new int[] {5,6};
		
		for (int i = 0; i < arr.length; i++) {			
				int[] singleRow =arr[i];
				for (int k = 0; k < singleRow.length; k++) {
					System.out.print(singleRow[k]+" ");
				}
				System.out.println();
			}
			System.out.println();
			
		
//		different method
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
