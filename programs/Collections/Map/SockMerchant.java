package test;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map.Entry;

public class Test {

	/**
	 * @param args
	 */
   /*
    This program is taken from
    https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
   */
	public static void main(String[] args) {
	
		int[] ar = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		int pairs = 0;
		for(int i: ar)
		{
			if(m.containsKey(i))
				m.put(i,m.get(i)+1);
			else
				m.put(i, 1);
		}
		//System.out.println(m);
		Set<Integer> keys = m.keySet();
		for(Integer key : keys)
		{
			int value = m.get(key);
			pairs += value/2;
		}
		System.out.println(pairs);
	
	}

}
