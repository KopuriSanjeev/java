package strings;

public class MoveAllUpperCaseToTheEndOfTheString {

	/**
	 * This program is used to move all upper case letters to end of the String.
	 * Eg: if input is "Hi I am Sanjeev".
	 * Then the output is "i  am anjeevHIS"
	 */
	public static void main(String[] args) {
		
		String str = "Hi I am Sanjeev";
		
		// method1. Without Using Regular Expression
		method1(str);
		
		// method2. Without Using Regular Expression
		method2(str);

	}
	
	
	/*Method #1: Without Using Regular Expression
		The idea is to traverse input string and maintain two strings, one string that contains lowercase characters (a, c, z, etc) and 
		other string that maintains Uppercase characters (A, C, Z etc). Finally concatenate the two strings and return.	Below is the implementation.
	*/
	public static void method1(String str)
	{
		String lower = "" , upper = "";
		
		char ch;
		
		//traverse the entire String
		for(int i=0;i<str.length();i++)
		{
			ch = str.charAt(i) ;
			if(ch >= 'A' && ch <= 'Z')
				upper += ch;
			else
				lower += ch;
		}
		
		System.out.println("The output using method1 is:" + lower+upper);
	}
	
	
	// method2.
	public static void method2(String str)
	{
		 // first take all lower case letters and take all uppercase letter and Finally concatenate both and print 
		 // str.replaceAll("[A-Z]+", "") gives all upper case letters and replacing them with empty space. i.e., giving all lower case letters.
		 // str.replaceAll("[^A-Z]+", "") gives all lower case letters and replacing them with empty space. i.e., giving all upper case letters.
        System.out.println("The output using method2 is:" + str.replaceAll("[A-Z]+", "") + str.replaceAll("[^A-Z]+", "")); 
	}

}


/* The output of above program is
   The output using method1 is:i  am anjeevHIS
   The output using method2 is:i  am anjeevHIS
*/
