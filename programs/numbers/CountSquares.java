import java.util.*;


/*
read full problem @ https://practice.geeksforgeeks.org/problems/count-squares3649/1

*/

public class CountSquares
{
	public static void main(String[] args)
	{
		method1();
		method2();		
	}
	
	public static void method1()
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
	
	public static void method2()
	{
		int n = 20;
		System.out.println((int)Math.sqrt(n-1));
		
	}
	
	public static void method3()
	{
		int n = 20;
		int count = 0;
		for(int i = 1;i<Math.sqrt(n);i++
		{
			if(i*i<n)
				count++;
			    
		}
		System.out.println(count);
		   
		
	}
	
}
