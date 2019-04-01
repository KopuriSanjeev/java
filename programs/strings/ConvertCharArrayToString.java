package strings;

public class ConvertCharArrayToString {

	/**
	 * This program is used to convert Char array to String.
	 * This can be done by using String class constructor.
	 * 
	 * The constructor is:
	 * String(char[] value)
	 * Allocates a new String so that it represents the sequence of characters currently contained in the character array argument.
	 */
	public static void main(String[] args) {
		
		// creating an Char Array.
		char[] chArr = new char[]{'s','a','n','j','e','e','v'};
		
		// declare String
		String str = "";
		
		// convert Char array to String
		str = new String(chArr);
		
		// printing String to see the result
		System.out.println(str);

	}

}

/*
	The out of the above program is:
	sanjeev
*/
