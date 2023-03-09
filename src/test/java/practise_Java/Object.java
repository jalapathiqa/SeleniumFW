package practise_Java;

public class Object {
	int i;
	int j;
	public Object(){
		i = 10;
		j = 20;
	}

	public Object(int i, int j){
		this.i =i;
		this.j = j;
	}
	
	public static void main(String[] args) {

		 Object obj = new Object();
		 Object obj1 = new Object(2 , 3);
		 Object obj2 = new Object(12, 13);

		System.out.println(obj.add());
		System.out.println(obj1.add());
		System.out.println(obj2.add());
		
		System.out.println(obj2.i);
		System.out.println(obj2.j);

		
	}

	
	public int add() {
		return i+j;
	}
	
}
