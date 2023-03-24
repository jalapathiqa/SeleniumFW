package practise_Java;

public class Array_singleDimensional {
	public static void main(String[] args) {
		
		int i[] = new int [5];
		i[0]=100;
		i[1]=112;
		i[2]=101;
		i[3]=5;
		i[4]=98;
		
//		System.out.println(i[3]);
		
//		for loop:
		int sum=0;
		int sum1=0;
		int sum2=0;

		for(int j=0; j<i.length; j++) {
			System.out.println(i[j]); 
			sum=+j;
			sum1+=j;
			sum2+=i[j];
		}
		System.out.println("Array size: "+sum);
		System.out.println("sum of Array size: "+sum1);
		System.out.println("sum of Array values: "+sum2);

//		while loop:
		
//		int j=0;
//		while (j<i.length) {
//			System.out.println(i[j]);
//			j++;
//			
//		}		
		
	}

}
