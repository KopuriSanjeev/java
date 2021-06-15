import java.util.*;


/*
read full problem @ https://practice.geeksforgeeks.org/problems/count-squares3649/1

*/

public class CountSquares
{
	public static void main(String[] args)
	{
		int n = 20;
		int count = 1; // 1 already added as it is a perfect square 
		int temp ;
		
		for(int i=2;i<n;i++)
		{
			temp = (int)Math.sqrt(i);
			if(temp*temp == i)
				count++;
			
		}
		
		
			System.out.println(count);
		
	}
}
