package practise_Java;

public class OOPs_Inheritance4_User {

	public static void main(String[] args) {

		OOPs_Inheritance1_Guest guest = new OOPs_Inheritance1_Guest();
		guest.read();
		
		OOPs_Inheritance2_Dev developer = new OOPs_Inheritance2_Dev();
		developer.read();
		developer.write();
		
		OOPs_Inheritance3_Admin admin = new OOPs_Inheritance3_Admin();
		admin.read();
		admin.write();
		admin.manage();
		
				
	}

}
