package practise_Java;

public class Assignment8_signle_Dimensional_Array {

	/**
	 * Print the sum of the integers in an integer array. input:[2,5,1,9,6] &
	 * output: 23
	 * 
	 * Print the average of the integers in an integer array input:[2,5,3,9,6] &
	 * output: 5
	 * 
	 * Merge two arrays and print the output in the console input:["chai", "coffee"]
	 * & ["milk", "water", "coke"] output: ["chai", "coffee", "milk", "water",
	 * "coke"]
	 * 
	 * Find the max number from an array and print it along with it index:
	 * input:[2,5,1,9,6] & output: value -9 & index -3
	 * 
	 * Find the min length word from an array and print it along with it's index:
	 * input["coffee", "water", "chai", "diet coke"] & output: value -chai & index
	 * -2
	 * 
	 * Reverse the array and print it in console: input:["coffee", "water", "chai",
	 * "diet coke"] output: ["diet code", "chai", "water", "coffee"]
	 *
	 */
	public static void main(String[] args) {

		// Print the sum of the integers in an integer array.
		// input:[2,5,1,9,6] & output: 23

		// int i[] = new int[5];
		// i[0] = 2;
		// i[1] = 5;
		// i[2] = 1;
		// i[3] = 9;
		// i[4] = 6;
		// int sum=0;
		// for (int j = 0; j < i.length; j++) {
		// System.out.println(i[j]);
		// sum += i[j];
		//
		// }
		// System.out.println("sum of 'i' values: "+sum);

		// Print the average of the integers in an integer array
		// input:[2,5,3,9,6] & output: 5

		// int i[] = new int[5];
		// i[0] = 2;
		// i[1] = 5;
		// i[2] = 3;
		// i[3] = 9;
		// i[4] = 6;

		// int i[] = {2, 5,3, 9, 6};
		// int avg=0;
		// int sum=0;
		// for (int j = 0; j < i.length; j++) {
		// System.out.println(i[j]);
		// sum=sum+i[j];
		// avg=sum/i.length;
		//
		// }
		// System.out.println("sum of 'i' values: "+sum);
		// System.out.println("Average of 'i' values: "+avg);
		// }

		//	Merge two arrays and print the output in the console
		// * input:["chai", "coffee"] & ["milk", "water", "coke"]
		// * output: ["chai", "coffee", "milk", "water", "coke"]

		//		String i[] = new String[2];
		//		i[0] = "chai";
		//		i[1] = "coffee";
		//
		//		String j[] = new String[3];
		//		j[0] = "milk";
		//		j[1] = "water";
		//		j[2] = "coke";
		//
		//		String T;
		//		String T1;
		//
		//		for (int k = 0; k < i.length; k++) {
		//			T = i[k];
		//			System.out.println(T);
		//
		//		}
		//
		//		for (int l = 0; l < j.length; l++) {
		//			T1 = j[l];
		//			System.out.println(T1);

		//Find the max number from an array and print it along with it's index:
		//input:[2,5,1,9,6] & output: value -9 & index -3

		//				int i[] = { 2, 5, 1, 9, 6 };
		//				int sum=0;
		//		
		//				for (int j = 0; j < i.length; j++) {
		////					System.out.println(i[j]);
		//					sum=+i[j];
		//				}
		//				System.out.println("Index: "+sum);
		//
		//				int maxValue = getMax(i);		
		//				System.out.println("Max. value in an Array: "+maxValue);	

		//				int minValue = getMin(i);
		//				System.out.println(minValue);


//Reverse the array and print it in console: 
//input:["coffee", "water", "chai","diet coke"] output: ["diet code", "chai", "water", "coffee"]

		String i[] = {"coffee", "water", "chai","diet coke"};
		for (int j=i.length-1; j>=0; j--) {
			System.out.println(i[j]);
		}
		
		
		
		
		
		
		
		
		

	}		

	// Method for getting the maximum value

	//			public static int getMax(int[] inputArray){ 
	//				int maxValue = inputArray[0]; 
	//				for(int i=1;i < inputArray.length;i++){ 
	//					if(inputArray[i] > maxValue){ 
	//						maxValue = inputArray[i]; 
	//					} 
	//				} 
	//				return maxValue; 
	//			}

	// Method for getting the minimum value
	//			public static int getMin(int[] inputArray){ 
	//				int minValue = inputArray[0]; 
	//				for(int i=1;i<inputArray.length;i++){ 
	//					if(inputArray[i] < minValue){ 
	//						minValue = inputArray[i]; 
	//					} 
	//				} 
	//				return minValue; 
	//			} 



}
