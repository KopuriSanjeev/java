import java.util.*;

/*
Please see the details @
https://www.geeksforgeeks.org/program-for-k-most-recently-used-mru-apps/

*/


public class MostRecentApps
{
	public static void main(String[] args)
	{
		int [] a = {5, 7, 2, 3, 4, 1, 6};
		int k = 10;
		int length = a.length;
		int[] b = new int[length];
		int first = k%length;
		System.out.println("start");
		for(int i=0;i<a.length;i++)
		{
			if(i==0)
				b[i] = a[first];
			else if(i<=first)
				b[i] = a[i-1];
			else if (i>first)
			{
				System.out.println("i value is " + i);
				b[i] = a[i];
			}
		}
		
		System.out.println("....");
		for(int i = 0;i<b.length;i++)
			System.out.println(b[i]);
		
	}
}
