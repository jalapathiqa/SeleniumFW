package practise_Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class File_textFiles_FOS {
	public static void main(String[] args) throws IOException {
		
		File file = new File("./Jp_Data1.txt");
		
		if(file.exists()) 
			file.delete();
			file.createNewFile();
		String j = "Jalapathi Kalagiri2";
//		FileOutputStream fos=new FileOutputStream(file);
//		
//		for (char jp : j.toCharArray()) {
//			fos.write((int)jp);
//		}
//		fos.write(74);
//		fos.write(65);
//		fos.write(76);
//		fos.write(65);
//		fos.write(80);
//		fos.write(65);
//		fos.write(84);
//		fos.write(72);
//		fos.write(73);
		

		FileWriter fr = new FileWriter(file);
		fr.write(j.toCharArray());
		
		fr.close();
	}
	
	
}
