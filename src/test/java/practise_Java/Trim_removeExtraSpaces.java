package practise_Java;

import java.util.StringTokenizer;

public class Trim_removeExtraSpaces {

public static void main(String args[]){
    	
        String input = "Try    to    remove   extra   spaces.";
        StringTokenizer substr = new StringTokenizer(input, " ");
        StringBuffer sb = new StringBuffer();
        
        while(substr.hasMoreElements()){
            sb.append(substr.nextElement()).append(" ");
        }
        
        System.out.println("Actual string: " + input);
        System.out.println("Processed string: " + sb.toString().trim());
    }

}
