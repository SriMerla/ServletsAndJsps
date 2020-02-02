package com.practiselab.java;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class CharacterArray {
	public Map<Character, Integer> countCharacter(char[] inputChar){
	    Map<Character, Integer> res = new HashMap<Character, Integer>();
		int len = inputChar.length;
		int count =1;
		for(int i =0; i<=len-1; i++){
			
			for(int j= i+1;j<=i;j++){
				char c = inputChar[i];
				char ch = inputChar[j];
				if(c == ch){
					count = count +1;
				}
				res.put('c', count);
			}
			
		
		}
		return res;
		
	}

	public static void main(String[] args) {
		CharacterArray character = new CharacterArray();
		char[] inputChar = {'A', 'P', 'P', 'L', 'E'};
		character.countCharacter(inputChar);

	}

}
