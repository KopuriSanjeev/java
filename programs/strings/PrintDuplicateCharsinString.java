import java.util.*;

class PrintDuplicateCharsinString 
{
	static String s ="sanjeev";
	
	public static void main(String[] as)
	{
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0,n=s.length();i<n;i++)
		{
			char ch = s.charAt(i);
			if(map.containsKey(ch))
				map.put(ch,map.get(ch)+1);
			else
				map.put(ch,1);		
			
		}
		for(Character c : map.keySet())
		{
			if(map.get(c) > 1)
				System.out.println(c + ":" + map.get(c));
			
		}
		
	}
	

}
