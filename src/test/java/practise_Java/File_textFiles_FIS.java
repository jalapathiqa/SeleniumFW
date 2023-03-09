package practise_Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class File_textFiles_FIS {
	public static void main(String[] args) throws IOException {
		
		File file = new File("./Jp_Data.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		FileInputStream fis = new FileInputStream(file);
//		System.out.println((char)fis.read());
		
		String text="";
		int code ;
		while ((code=fis.read()) !=-1) {
//			System.out.print((char)code);
			text +=String.valueOf((char)code);
			
		}
		System.out.println(text);		
		
		fis.close();
	}
	
	
}
