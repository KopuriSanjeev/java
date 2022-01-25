package strings;

import java.util.*;
public class PrintDuplicateOccurencesOfString {

	public static void main(String[] args) {
		String s = "I am am learning java java";
		printDuplicateWords(s);
	}
	
	public static void printDuplicateWords(String s)
	{
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		String[] words = s.split(" ");
		
		for(String word : words)
		{
			if(map.containsKey(word))
				map.put(word, map.get(word)+1);
			else
				map.put(word, 1);
		}
		
		for(String word : map.keySet())
		{
			if(map.get(word) > 1)
				System.out.println(word + " occurred " + map.get(word) + " times");
		}
		
	}

}
