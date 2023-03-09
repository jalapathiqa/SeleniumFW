package practise_Java;

public class loop_For_each_loop {

	public static void main(String[] args) {


//		int [][] arr = {{1,4,3 }, {9,5}, {2} };
		
		int[][] arr = new int [3][];
		arr[0]=new int[3];
		arr[1]=new int[2];
		arr[2]=new int[1];
		
		arr[0][0]=1;
		arr[0][1]=4; 
		arr[0][2]=3; 

		arr[1][0]=9; 
		arr[1][1]=5; 

		arr[2][0]=2; 

		
		int sum=0;
//		int noOfEle=0;
		
//		for(int[] singleRow:arr) {
//			for(int value:singleRow) {
////				System.out.println(value);
//				sum += value;
////				noOfEle++;
//			}
//			System.out.println(sum);
////			System.out.println(sum/noOfEle);
//		}
		
		System.out.println("different method: ");
		for (int i = 0; i < arr.length; i++) {
			int[] firstRow=arr[i];
			for (int j = 0; j < firstRow.length; j++) {
				System.out.print(firstRow[j]+" ");
				sum+=firstRow[j];
			}
			System.out.println();
			System.out.println(sum);
		}

	}
}
