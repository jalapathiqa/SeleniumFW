package practise_Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class File_textFiles_Scanner {
	public static void main(String[] args) throws IOException {
		
//		File file = new File("./Jp_Data.txt");
		
//		if(!file.exists()) {
//			file.createNewFile();
//		}
		
		Scanner scan = new Scanner(new File("./Jp_Data.txt"));

		String txt="";
		while (scan.hasNextLine()) {
			 txt += scan.nextLine()+"\n";
		}
		System.out.println(txt);

		scan.close();
	}

}
