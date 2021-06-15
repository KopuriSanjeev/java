/*
https://www.geeksforgeeks.org/move-zeroes-end-array/
*/


public class MoveAllZerosToEndOfArray
{
	public static void main(String[] args)
	{
		int[] a = {0,1,0,2,0,5};
		
		int count = 0;
		for(int i=0;i<a.length;i++)
		{
			// for non zero elements.
			if(a[i] !=0)
			{
				a[count++] = a[i];
			}
		}
		while(count<a.length)
		{
			a[count++]=0;
		}
		
		
		for(int i = 0;i<a.length;i++)
			System.out.println(a[i]);
	}
}
