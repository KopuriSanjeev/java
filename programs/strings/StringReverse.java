package strings;

public class StringReverse {

	/**
	 * This program is used to reverse a given String
	 */
	public static void main(String[] args) {
		
		String str = "hyderabad";
		
		// method1. Iterate String using loop and concate in new String to get reverse of a String.
		method1(str);

		// method2. String class doesn't have reverse() method. whereas StringBuffer has. 
		// So convert String to StringBuffer to reverse.
		method2(str);
	}
	
	public static void method1(String str)
	{
		String revStr = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			revStr = revStr + str.charAt(i);
		}
		
		System.out.println("Reverse of String " + str + " using method1 is " + revStr);
	}
	
	
	public static void method2(String str)
	{
		// Create StringBuffer object and pass our String. See StringBuffer constructors for more details.
		StringBuffer sb = new StringBuffer(str);
		
		// reverse StringBuffer and convert to String and assign to revStr variable. 
		String revStr = sb.reverse().toString();
		
		System.out.println("Reverse of String " + str + " using method2 is " + revStr);
	}

}

/*	The output of the above program is 
    Reverse of String hyderabad using method1 is dabaredyh
	Reverse of String hyderabad using method2 is dabaredyh

 */

