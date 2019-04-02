package strings;

public class SwapTwoStrings {

	/**
	 * This method is used to Swap Strings.
	 */
	public static void main(String[] args) {
		
		String s1 = "Sanjeev" ;
		String s2 = "Kusuma" ;

		System.out.println("Strings before swap are: "+ s1 + " " + s2);
		
		usingThirdVariable(s1, s2);
		withOutUsingThirdVariable(s1, s2);
	}
	
	public static void usingThirdVariable(String s1,String s2)
	{
		String temp ="";
		temp = s1;
		s1 = s2;
		s2 = temp;
		
		System.out.println("Strings after swapping using temp variable are: "+ s1 + " " + s2);
	}
	
	public static void withOutUsingThirdVariable(String s1, String s2)
	{
		s1 = s1.concat(s2);  // s1 = SanjeevKusuma   s2 = Kusuma
		s2 = s1.substring(0, s1.length()-s2.length()) ; // s1 = SanjeevKusuma   s2 = Sanjeev
		s1 = s1.substring(s2.length());
		
		System.out.println("Strings after swapping with out using temp variable are: "+ s1 + " " + s2);
	}

}


/*
The output of above program is:

Strings before swap are: Sanjeev Kusuma
Strings after swapping using temp variable are: Kusuma Sanjeev
Strings after swapping with out using temp variable are: Kusuma Sanjeev
*/
