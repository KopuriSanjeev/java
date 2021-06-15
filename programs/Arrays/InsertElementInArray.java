import java.util.*;
import java.io.*;

public class InsertElementInArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int arr[] = new int[sc.nextInt()+1];
		System.out.println("Enter the elements of Array");
		for(int i=0;i<arr.length-1;i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Enter the elements to be inserted");
		int element = sc.nextInt();
		System.out.println("Enter the position of element insertion");
		int position = sc.nextInt();
		
		for(int i=arr.length-1;i>position;i--)
			arr[i] = arr[i-1];
		arr[position] = element;
		
		for(int i=0, n=arr.length;i<n;i++)
			System.out.println(arr[i]);
		
	}
}
