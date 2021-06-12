class Program3
{
	public static void main(String[] args)
	{
		int i = 10 + +11 - -12 + +13 - -14 + +15;
		System.out.println(i);
	
	}
}

/*
The output is 
75

Explanation:
		int i = 10 + +11 - -12 + +13 - -14 + +15;
    This will become
    int i = 10 + (+11) - (-12) + (+13) - (-14) + (+15);
    In next step, it will become
    int i = 10+11+12+13+14+15;
    
*/
