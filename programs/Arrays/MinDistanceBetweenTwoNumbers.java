package arrays;

public class MinDistanceBetweenTwoNumbers {

	public static void main(String[] args) {
		int[] a = {2,5,3,5,4,4,1,2,3};
		int x=2,y=4;
		int minDistance = minDistance1(a,x,y);
		System.out.println("Min distance between "+x +" " + y +" is "+minDistance);
		
		int minDistance2 = minDistance2(a,x,y);
		System.out.println("Min distance between "+x +" " + y +" is "+minDistance2);
		
	}

	public static int minDistance1(int[] a,int x,int y)
	{
		int minDist = Integer.MAX_VALUE;
		int arr_len = a.length;  //8. index 0-7
		
		for(int i=0;i<arr_len-1;i++)     //0 to 6
		{
			for(int j=i+1;j<arr_len;j++)
			{
				if( (a[i]==x && a[j]==y || 
					 a[i]==y && a[j]==x) && minDist > Math.abs(i-j))
				{
					minDist = Math.abs(i-j);
				}
			}
		}
		
		return minDist;
	}
	
	public static int minDistance2(int[] a,int x, int y)
	{
		int minDist = Integer.MAX_VALUE;
		int arr_len = a.length;
		int prev =-1;
		
		for(int i=0;i<arr_len;i++)
		{
			if(a[i]==x || a[i]==y)
			{
				prev = i;
				break;
			}
		}
		
		
		for(int i=prev;i<arr_len;i++)
		{
			if(a[i]==x || a[i]==y)
			{
				if(a[i]!=a[prev] && (i-prev) < minDist)
				{
					minDist = i-prev;
					prev = i;
				}
				else
					prev =i;
			}
		}
		
		
		return minDist;
	}

}
