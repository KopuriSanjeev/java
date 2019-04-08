package strings;

public class CountCharacterOccurence {

	/**
	 * Java program to count the total number of occurrences of a given character in a string with and without using any loop.
	 */
	public static void main(String[] args) {
		
		String s = "Hi I am Sanjeev and i am writing java programs" ;
		char ch = 'a'; // This is the char to check count
		
		usingLoop(s, ch);
		
		withOutUsingLoop(s, ch);
	}
	
	// Logic is to traverse through the string and increment if that character(to count) matches with current character in the String.
	public static void usingLoop(String s,char ch)
	{
		int count = 0 ;
		for(int i=0;i<s.length();i++){
			if(ch == s.charAt(i))
				count++;
		}
		
		System.out.println("No. of occurences of "+ ch + " in \"" +s + "\" is " + count);
	}
	
	
	// Logic here is,
	// string length - string length without that character.
	public static void withOutUsingLoop(String s,char ch)
	{
		int count = s.length() - s.replaceAll(ch+"", "").length() ;
		
		System.out.println("No. of occurences of "+ ch + " in \"" +s + "\" is " + count);
	}

}


/* The output of the above program is:
	
	No. of occurences of a in "Hi I am Sanjeev and i am writing java programs" is 7
	No. of occurences of a in "Hi I am Sanjeev and i am writing java programs" is 7

*/
