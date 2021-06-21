import java.util.*;

class RemoveDuplicateCharsFromString 
{
	
	public static void main(String[] as)
	{
		String s = "sanjeev";
		Set<Character> set = new HashSet<Character>();
		StringBuffer sf = new StringBuffer();
		
		for(int i = 0,n=s.length();i<n;i++)
		{
			char ch = s.charAt(i);
			if(!set.contains(ch))
			{
				set.add(ch);
				sf.append(ch);
			}
			
		}
		System.out.println(new String(sf));
		
	}
	
}
