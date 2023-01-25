package org.zoho;
import java.util.HashMap;

public class RefString {
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String inputString = "Hello World lease";//value
		        String refString = "Help";//key
		        HashMap<Character, Integer> charCount = new HashMap<>();
		        for (int i = 0; i < refString.length(); i++) {   
		            charCount.put(refString.charAt(i), 0); //to set key
		        }
		        for (int i = 0; i < inputString.length(); i++) {   
		        	char c = inputString.charAt(i);
		            if (charCount.containsKey(c)) {  //value contains key
		                charCount.put(c, charCount.get(c) + 1); //char,char counter addition
		                
		                
		            }
		        }
		        
		        for (char c : charCount.keySet()) {  //addition keyset record
		            System.out.print(c + ":" + charCount.get(c) + ", ");
		        }
		    }
		}
		