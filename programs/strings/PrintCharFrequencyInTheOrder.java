package strings;

import java.util.*;
public class PrintCharFrequencyInTheOrder {

	// Print characters and their frequencies in order of occurrence
	// if input is "elephant"
	// ouput is e2 l1 p1 h1 a1 n1 t1
	public static void main(String[] args) {
		String s = "sanjeev";
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		char ch;
		
		for(int i=0,n=s.length();i<n;i++)
		{
			ch = s.charAt(i);
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch,1);
		}
		System.out.println(map);
		
		// printing in the same order as present in string

		for(int i=0,n=s.length();i<n;i++)
		{
			ch = s.charAt(i);
			if(map.get(ch) != 0)
			{
				System.out.println(ch+" "+map.get(ch));
				map.put(ch,0);
			}
			
		}
	}

}
