package practise_Java;

public interface Interface_Laptop {

	public void copy();

	public void paste();

	public void cut();

	public void keyboard();

	// new Rule/method in interface with default, with 'default' it will go to the implementation 'Classes'
	default void security() {
		System.out.println("please implement - security as well in your laptops");
	}
	// new Rule/method in interface with static, with 'static' it is not necessary to go to the 
	// implementation 'Classes', it can be used out siders as well
	static void audio() {
		System.out.println("please implement - Audio as well in your laptops");
	}
}
