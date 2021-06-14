import java.util.*;

class LongestSubString
{
	public static void main(String[] args)
	{
		String str = "sanjeev";
		String longestSubStr = longestSubStr(str);
		System.out.println(longestSubStr);
	}
	
	public static String longestSubStr(String str)
	{
		HashSet<Character> set = new HashSet<Character>();
		String longestTillNow = "";
		String longestOverall = "";
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(set.contains(ch))
			{
				set.clear();
				longestTillNow="";
			}
			longestTillNow += ch;
			set.add(ch);
			
			if(longestTillNow.length()>longestOverall.length())
				longestOverall = longestTillNow;
				
			
		}
		return longestOverall;
	}
}
