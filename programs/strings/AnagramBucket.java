package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramBucket {

	/**
	 * This program is used to bucket (group) all anagrams.
	 * To know about Anagrams, refer my AnagramsCheck.java program.
	 * The logic here is to take all inputs from use and sort each String and calculate hashcode of each String.
	 * Store all inputed Strings in Map based on the hashcode as a Key.
	 * If hashcode doesn't exists in Map, that means no element found till now. So add entry with key and String.
	 * If hashcode found, that means some String already existing with same hashcode. So append this String to the existing value of same key.
	 */
	public static void main(String[] args) {
		
		String[] input = {"rats","pans","star","naps","abcd"};
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		int hashcode = 0;
		
		for(int i=0;i<input.length;i++)
		{
			hashcode = sort(input[i]).hashCode();
			
			if(map.containsKey(hashcode))
				map.put(hashcode,map.get(hashcode)+" "+input[i]) ;
			else
				map.put(hashcode, input[i]) ;
			
		}
		
		for(Integer key : map.keySet())
		{
			System.out.println(key + " " + map.get(key));
		}
		
	}
	
	public static String sort(String s1)
	{
		char[] ch = s1.toCharArray() ;
		Arrays.sort(ch) ;
		
		return new String(ch) ;
	}

}

	/* The output of the above program is: (Displayed hashcode only for understanding purpose. No need to display hashcode)
	   2999024 pans naps
	   3002962 rats star
	   2987074 abcd
   */
