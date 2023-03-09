package practise_Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class File_fileReader {
	public static void main(String[] args) throws IOException {
		
		File file = new File("./Jp_Data.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		FileReader fr = new FileReader(file); 
	
	}
	

}
