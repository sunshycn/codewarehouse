package org.huamuzhen.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String args[]){
		
		
		String script = "(product_name CONTAINS  'gui tars' OR item_status IN ('Retired','UnRetired','Published')) AND modified_by EQUALS ‘sanveka'";
		
		System.out.println(script);
		script = script.trim();
	
		int index = 0;
		int start = 0;
		boolean singleQuoteNeed = false;
		List<CharSequence> words = new ArrayList<CharSequence>();
		
		for (char c : script.toCharArray()) {
			if (c == ' ') {
				if (!singleQuoteNeed) {
					String subStr = script.substring(start, index);
					if (!subStr.equals(" ")) {
						words.add(subStr);
					}
					words.add(String.valueOf(c));
					start = index;
				}
			} else if (c == '(' || c == ')') {
				words.add(String.valueOf(c));
				start = index;
			} else if (c == '\'') {
				singleQuoteNeed = !singleQuoteNeed;
			}

			index++;
			if (index == script.length()) {
				words.add(script.substring(start, index - 1));
			}
		}

		for (CharSequence word : words) {
			System.out.println(word);
		}
		
	}

}
