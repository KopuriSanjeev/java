package strings;

public class WordsInReverse {

	/**
	 * This program is used to reverse the words of the statement.
	 * Eg: Input string is "I love my country India"
	 * Output should be "India country my love I"
	 */
	public static void main(String[] args) {
		
		String str = "I love my    country India" ;
		System.out.println("Actual statement is :" + str);
		reverseWords(str);

	}
	
	public static void reverseWords(String str)
	{
		String[] pieces = str.split(" ");
		String reverse = "";
		for(int i=pieces.length-1;i>=0;i--)
		{
			reverse += pieces[i] +" ";
		}
		
		System.out.println("Statement after reverse is:" + reverse);
	}

}


/*

The output of the above program is :
Actual statement is :I love my    country India
Statement after reverse is:India country    my love I

*/ 
