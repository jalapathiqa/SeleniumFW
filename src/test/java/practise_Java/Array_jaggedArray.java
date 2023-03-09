package practise_Java;

import java.util.Iterator;

public class Array_jaggedArray {
	public static void main(String[] args) {
		
		int [][] arr = new int[3][];		
		arr[0] = new int[2];
		arr[1] = new int[5];
		arr[2] = new int[3];
//		
		arr[0][0]=11;
		arr[0][1]=12;
		
		arr[1][0]=21;
		arr[1][1]=22;
		arr[1][2]=23;
		arr[1][3]=24;
		arr[1][4]=25;
		
		arr[2][0]=31;
		arr[2][1]=32;
		arr[2][2]=33;
		
//		int [][] arr = {{11,12}, {21,22,23,24,25}, {31,32,33} };	
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();			
		}
		System.out.println();
		
		System.out.println("different method: ");
		for (int i = 0; i < arr.length; i++) {
			int[] firstRow=arr[i];
			for (int j = 0; j < firstRow.length; j++) {
				System.out.print(firstRow[j]+" ");
			}
			System.out.println();			
		}
		
	}

}
