package practise_Java;

public class loop_For_loop_Max_Min_Value {

	/**
	 * Find the max number from an array and print it along with it index:
	 * input:[2,5,1,9,6] & output: value -9 & index -3
	 * 
	 */
	public static void main(String[] args) {

		

//Find the max number from an array and print it along with it's index:
//input:[2,5,1,9,6] & output: value -9 & index -3

					int i[] = { 2, 5, 1, 9, 6 };
						int sum=0;
				
						for (int j = 0; j < i.length; j++) {
							System.out.println(i[j]);
							sum=+i[j];
					}
						System.out.println("Index: "+sum);
		
						int maxValue = getMax(i);		
						System.out.println("Max. value in an Array: "+maxValue);	

						int minValue = getMin(i);
						System.out.println("Min. value in an Array: "+minValue);


	}		

	// Method for getting the maximum value

				public static int getMax(int[] inputArray){ 
					int maxValue = inputArray[0]; 
					for(int i=1;i < inputArray.length;i++){ 
						if(inputArray[i] > maxValue){ 
							maxValue = inputArray[i]; 
						} 
					} 
					return maxValue; 
				}

//	 Method for getting the minimum value
				public static int getMin(int[] inputArray){ 
					int minValue = inputArray[0]; 
					for(int i=1;i<inputArray.length;i++){ 
						if(inputArray[i] < minValue){ 
							minValue = inputArray[i]; 
						} 
					} 
					return minValue; 
				} 



}
