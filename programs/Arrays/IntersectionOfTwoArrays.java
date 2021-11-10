package arrays;

import java.util.*;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,4};
		int[] b = {3,4,5,6};
		
		Set s = new HashSet();
		for(int i=0,n=a.length;i<n;i++)
		{
			s.add(a[i]);
		}
		System.out.println(s);
		
		for(int i=0,n=b.length;i<n;i++)
		{
			if(s.contains(b[i]))
				System.out.println(b[i]);
		}

	}

}

/* output is 
3
4
*/
