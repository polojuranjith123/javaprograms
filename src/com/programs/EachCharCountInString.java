package com.programs;

import java.util.HashMap;
import java.util.Set;

public class EachCharCountInString {

	
	static void charCount(String inputString) {
		char[] chArray=inputString.toCharArray();
		HashMap<Character,Integer> chcount=new HashMap<Character,Integer>();
		for(char ch:chArray) {
			if(chcount.containsKey(ch))
				chcount.put(ch, chcount.get(ch)+1);
			else
				chcount.put(ch, 1);
		}
		Set<Character> ch=chcount.keySet();
		for(char c:ch) {
			if(chcount.get(c)>1)
				System.out.println(c+" : "+chcount.get(c));
		}
		}

	public static void main(String[] args) {
		charCount("ranjith mani haima");
	}

}
