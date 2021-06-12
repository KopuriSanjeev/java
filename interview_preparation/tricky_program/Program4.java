class Program4
{
	public static void main(String[] args)
	{
		String one = "Random";
		String two = "RAndom";
		
		if(one==two)
			System.out.println("one==two");
		else
			System.out.println("one!=two");
	
	}
}



/*
The output is:
one!=two

Explanation:
== operator always do reference comparision.
As the string content is different, two string objects are created.
So reference of them is different.


*/
