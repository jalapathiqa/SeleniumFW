package practise_Java;

import java.io.File;
import java.io.IOException;

public class Files {
	
	public static void main(String[]args) throws IOException {
		
		
		File file = new File("./testData.xlsx");
//		System.out.println(file.createNewFile());
//		if(file.exists())
//		System.out.println(file.createNewFile());
//		System.out.println(file.delete());

		File f2 = new File("./Resources/testData2.xlsx");
//		f2.mkdirs();
//		f2.delete();
		f2.mkdir();
		f2.delete();
		
	}

}
