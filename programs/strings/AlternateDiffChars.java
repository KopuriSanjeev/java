
/*
  Code challenge from https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings&h_r=next-challenge&h_v=zen
  You are given a string containing characters A and B only. Your task is to change it into a string such that there are no matching adjacent characters. To do this, you are allowed to delete zero or more characters in the string.

Your task is to find the minimum number of required deletions.
*/

class AlternateDiffChars
{
	
	public static void main(String[] args)
	{
		String s = "AAABBB";
		int deletions = 0;
		
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
				deletions++;
		}
		
		System.out.println("No of deletions required " + deletions);
	}
}
