import java.util.*;

/*
Code challange from https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
No. of deletions required to make both strings as Anagrams
*/


class MakeAnagram
{
	
	public static void main(String[] args)
	{
		String s1 = "abCd";
		String s2 = "abc";
		Map<Character,Integer> m1 = new HashMap<Character,Integer>();
		Map<Character,Integer> m2 = new HashMap<Character,Integer>();
		int deletions = 0;
		
		for(char ch='a';ch<='z';ch++)
		{
			m1.put(ch,0);
			m2.put(ch,0);
		}
		
		for(char ch: s1.toLowerCase().toCharArray())
		{
			m1.put(ch,m1.get(ch)+1);
		}
		for(char ch: s2.toCharArray())
		{
			m2.put(ch,m2.get(ch)+1);
		}
		
		for(char ch: m1.keySet())
		{
			int f1=m1.get(ch);
			int f2=m2.get(ch);
			deletions += Math.abs(f1-f2);
			
		}
		System.out.println("No of deletions required " + deletions);
	}
}
