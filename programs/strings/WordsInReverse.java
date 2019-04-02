package strings;

import java.util.Scanner;
import java.util.StringTokenizer;

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
		method2(str);

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
	
	//method 2 uses StringTokenizer. This is well suite if you have multiple spaces between words.
	public static void method2(String str)
	{
		StringTokenizer st = new StringTokenizer(str," ");

		// strReverseLine is the function used to reverse a string.
		String strReversedLine = "";
		try
		{
			while(st.hasMoreTokens())
		    {
				strReversedLine = st.nextToken() + " " + strReversedLine;
			}
			System.out.println("Reversed string using StringTokenizer is : " + strReversedLine);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}


/*

The output of the above program is :
Actual statement is :I love my    country India
Statement after reverse is:India country    my love I 
Reversed string using StringTokenizer is : India country my love I 

*/ 
