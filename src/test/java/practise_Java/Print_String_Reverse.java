package practise_Java;

import org.apache.logging.log4j.message.StringFormatterMessageFactory;

public class Print_String_Reverse {

	public static void main(String[] args) {

		String s = "ihtapalaj";

		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.reverse();
		System.out.println(sb);
	}

}
