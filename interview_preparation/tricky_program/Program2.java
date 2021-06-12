class Program2
{
	public static void main(String[] args)
	{
		String s = "ONE"+1+2+"TWO"+"THREE"+3+4+"FOUR"+"FIVE"+5;
		System.out.println(s);
	
	}
}


/*
The output is 
ONE12TWOTHREE34FOURFIVE5

Explanation: 
+ is an overloaded operator.
If two operands for + are numbers, then it acts an additional operator.
If atleast 1 operand is String, then it acts as an String concatination operator.

*/
