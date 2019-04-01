package strings;

public class StringLength {

	/**
	 * This program is used to calculate lenght of String in java.
	 */
	public static void main(String[] args) {
		
		String str = "kusuma" ;
		
		// method1. Using String class length() method.
		method1(str);
		
		// method2. With out using String class length() method.
		method2(str);
	}
	
	public static void method1(String str)
	{
		System.out.println("Length of string " + str + " using method1 is " + str.length());		
	}

	/* The logic used in this method is iterating the String using loop.
	   If the String is completed and if I am accessing char, then we will get StringIndexOutOfBoundsException.
	   So logic is String is present till you get StringIndexOutOfBoundsException.	
	*/
	
	public static void method2(String str)
	{
		int length = 0;
		for(int i=0;;i++)
		{
			try{
				str.charAt(i);
			}
			catch(StringIndexOutOfBoundsException e)
			{
				break;
			}
			
			
			length++;
			
		}
		
		System.out.println("Length of string " + str + " using method2 is " + length);		
	}
}


/*	The output of the above program is
  	Length of string kusuma using method1 is 6
 	Length of string kusuma using method2 is 6
 */
