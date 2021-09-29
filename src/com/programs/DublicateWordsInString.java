package com.programs;

import java.util.HashMap;
import java.util.Set;

public class DublicateWordsInString {
	
	
	static void dublicateString(String inputString) {
		boolean b=false;
		String[] strarray=inputString.split(" ");
		HashMap<String,Integer> words=new HashMap<String,Integer>();
		for(String word:strarray) {
			if(words.containsKey(word.toLowerCase())) 
				words.put(word.toLowerCase(), words.get(word.toLowerCase())+1);
				else
					words.put(word.toLowerCase(), 1);
				
		}
	
		Set<String> wordsInString=words.keySet();
		for(String word:wordsInString ) {
			if(words.get(word)>1)
				if(b==true)
				System.out.println(word+" : "+words.get(word));
				
		}
		if(b==false)
	System.out.println("There is no dublicate words");
		
	}
	public static void main(String[] args) {
		dublicateString("All the best");
		
	}

}
