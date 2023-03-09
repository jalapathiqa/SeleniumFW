package practise_Java;

public class dataTypes {
	
	public String breed = "German Shepard";
	public int height = 30;
	public int weight = 50;
	
	public static void main(String[]args) {
		
		dataTypes Dtypes = new dataTypes();
		System.out.println("Dig breed is..."+Dtypes.breed);
		
		System.out.println("Dig height is..."+Dtypes.height);
		System.out.println("Dig weight is..."+Dtypes.weight);
		
		short s = 250;
		System.out.println(Short.SIZE/8);
		
		int i = 214763234;
		System.out.println(Integer.SIZE/8);
		
		long l = 897878798;
		System.out.println(Integer.SIZE/8);

		float f = 3.14f;
		System.out.println(Float.SIZE/8);

		char c = 'J';
		System.out.println(Character.SIZE/8);

		double d = 88.987998999;
		System.out.println(Double.SIZE/8);

		System.out.println(Long.SIZE/8);

		
	}

}
