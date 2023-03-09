package practise_Java;

public class Assignment9_Multi_Dimensional_Array {

	/**
	 * Print the sum of the elements of a multi dimensional array
	 * input	output
	 * 1 8 4	48
	 * 9 7 2
	 * 7 6 4
	 * 
	 * Add the elements in an array and print it in the console
	 * input 1	input 2		output
	 * 1 2 1	2 6 8		3 8 9
	 * 9 7 2	0 1 3		9 8 5
	 * 7 6 4	1 2 4		7 8 8
	 * 
	 * Create an array with square of the existing array elements
	 * input	output
	 * 2 3 5	4 9 25
	 * 0 1 3	0 1 9
	 * 1 2 4	1 4 16
	 * 
	 * Print the common elements between two arrays
	 * input1		input2		output
	 * 1 2 1		2 6 8 6		1,2,6,7,9
	 * 9 7 2		0 1 3 9 7
	 * 7 6 4		7 2 0
	 * 				8 3
	 * 
	 * Create an array based on the mentioned conditions and print it in the console
	 * input1	input2	output
	 * 1 2 1	1 6 1	1 0 1
	 * 9 7 2	0 7 3	0 1 0
	 * 7 6 4	1 6 4	0 1 0
	 * 
	 * Interchange the values of an array by transporting the index values
	 * input	output
	 * 1 8 4	1 9 7
	 * 9 7 2	8 7 6
	 * 7 6 4	4 2 4
	 * 
	 *
	 */
	

	public static void main(String[] args) {
		
////#1:
//		int sum=0;
//		int [][] arr = { {1,8,4}, {9,7,2}, {7,6,4}};
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
////				sum=arr.length;
//				sum+=arr[i][j];			
//		}System.out.println(sum);
//	}
		
		
//#2:
		
		int [][] arr = { 
				{1,8,4}, 
				{9,7,2}, 
				{7,6,4}
			};
		int sum=0;
		int noOfRows=0;
//		for (int i = 0; i < arr.length; i++) {
//
//			for (int j = 0; j < arr[i].length; j++) {
////				System.out.println("all the values from Array: ");
//				System.out.println(arr[i][j]);
//				sum+=arr[i][j];			
//		}
//			System.out.println(sum);
//	}
		
		for(int[] singleRow:arr) {
			for (int value: singleRow) {
				sum += value;
				noOfRows++;
			}
//			System.out.println();
			System.out.println("Sum of all the Array values");
			System.out.println(sum);
			
			System.out.println("Avg of all the Array values");
			System.out.println(sum/noOfRows);

		}
		
		
		
		
		
		
		
		
		
		

	}
}
