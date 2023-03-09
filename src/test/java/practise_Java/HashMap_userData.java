package practise_Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap_userData {

	public static void main(String[] args) {

		Map<String, String> userMap = new HashMap<String, String>();
		userMap.put("id", "1");
		userMap.put("name", "Jp");
		userMap.put("city", "Surrey");
		
//		System.out.println(userMap.get("id"));
//		System.out.println(userMap.get("name"));
//		System.out.println(userMap.get("city"));
		for (Map.Entry m : userMap.entrySet()) {
			System.out.println(m.getKey()+": "+m.getValue());
		}
		
		


	}

}
