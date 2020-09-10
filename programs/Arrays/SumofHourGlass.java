package test;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map.Entry;

public class SumofHourGlass {

	/**
	 * @param args
	 */
   /* References
    https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
    https://www.geeksforgeeks.org/maximum-sum-hour-glass-matrix/
   */
   
	public static void main(String[] args) {
		int [][]mat = {{-1, -1, 0, -9, -2, -2},
			{-2, -1, -6, -8, -2, -5},
			{-1,-1, -1, -2, -3, -4},
			{-1, -9, -2, -4, -4, -5},
			{-7, -3, -3, -2, -9, -9},
			{-1, -3, -1, -2, -4, -5}} ;

		
				
		int result = findMaxHourGlass(mat);
		if(result == -1)
			System.out.println("Not possible");
		else
			System.out.println(result);
		
	}
	public static int findMaxHourGlass(int[][] arr)
	{
		int max = Integer.MIN_VALUE;		// Dont take 0, it will not work for max hour glass value which is < 0
		int rows = arr.length;
		int cols = arr[0].length;
		if(rows != cols || rows < 3 || cols < 3)
			return -1;
		
		for(int i=0;i<rows-2;i++)
		{
			for(int j=0;j<cols-2;j++)
			{
				int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
						  arr[i+1][j+1] +
						  arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2] ;
				max = Math.max(sum, max);
			}
		}
		return max;
		
		
		
	}

	
}
