package strings;

import java.util.*;
import java.util.Map.Entry;
public class PrintCharsinDescOrderOfFrequency {

	public static void main(String[] args) {
		String s = "banana";
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		char ch;
		for(int i=0,n=s.length();i<n;i++)
		{
			ch = s.charAt(i);
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
		}
		//System.out.println(map);
		
		//map to set
		Set<Entry<Character,Integer>> set =map.entrySet();
		
		//set to list
		List<Entry<Character,Integer>> list = new ArrayList<Entry<Character,Integer>>(set);
		
		Collections.sort(list,new Comparator<Map.Entry<Character, Integer>>()
				{
					public int compare(Entry<Character,Integer> o1,Entry<Character,Integer> o2)
					{
						return o2.getValue().compareTo(o1.getValue());
					}
				}
		
				
				);
		
		for(Entry<Character,Integer> entry : list)
			System.out.println(entry.getKey() + " " + entry.getValue());
		
	}

}
