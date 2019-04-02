package strings;

import java.util.Arrays;

public class AnagramsCheck {

	/**
	 * This prgoram is used to check whether given 2 strings are Anagrams are not.
	 * Two Strings are said to be Anagrams if they are formed with same set of characters.
	 * Eg: rats and star are said to be Anagrams.
	 */
	public static void main(String[] args) {

		String s1 = "rats", s2 = "star" ;
		
		// If length of both Strings are not equal, then straight away we can say they are not Anagrams.
		if(s1.length() != s2.length())
		{
			System.out.println(s1 +" and "+ s2 + " are not Anagrams");
			System.exit(0);
		}
		if(sort(s1).equals(sort(s2)))
			System.out.println(s1 +" and "+ s2 + " are Anagrams");
		else
			System.out.println(s1 +" and "+ s2 + " are not Anagrams");
	}
	
	// This method is used to sort characters.
	public static String sort(String s)
	{
		char ch[] = s.toCharArray();
		Arrays.sort(ch);
	
		
		return new String(ch);
	}

}

/*

The output of the above program is:
rats and star are Anagrams

*/
