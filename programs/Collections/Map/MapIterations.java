package collections;

import java.util.*;
import java.util.Map.Entry;
public class MapIterations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "sanjeev");
		map.put(2, "ganesh");
		map.put(3, "suresh");
		
		
		  // method 1 
		for(Integer i : map.keySet()) 
			System.out.println(i + " " +map.get(i));
		 
		
		
		// method 2
		Set<Integer> keyset =map.keySet();
		Iterator<Integer> itr = keyset.iterator();
		while(itr.hasNext())
		{
			Integer key = itr.next();
			System.out.println(key+" "+map.get(key));
		}
		
		
		// method 3
		Set<Map.Entry<Integer, String>> entrySet=map.entrySet();
		for(Entry e: entrySet)
			System.out.println(e.getKey() +" " +e.getValue());
		
		
		// method 4
		Set<Map.Entry<Integer, String>> entrySet1 = map.entrySet();
		Iterator<Entry<Integer,String>> itr1 = entrySet1.iterator();
		while(itr1.hasNext())
		{
			Entry e = itr1.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
