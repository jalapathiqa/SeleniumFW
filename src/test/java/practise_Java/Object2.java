
package practise_Java;

public class Object2 {
	// create an object of a different class and use it ere;
	
	public static void main(String[] args) {
		
		Object obj = new Object();
		Object obj1 = new Object(10, 45);
		Object obj2 = new Object(35, 50);


		System.out.println(obj.add());
		System.out.println(obj1.add());
		System.out.println(obj2.add());
		System.out.println(obj1.i);
		System.out.println(obj2.j);
		System.out.println(obj2.i);

	}
	
	

}
