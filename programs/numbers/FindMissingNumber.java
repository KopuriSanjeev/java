package numbers;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] a = {1,2,4,7,5,6};
		method1(a);
		method1(a);

	}
	public static void method1(int[] a)
	{
		int a_len = a.length;
		int sum = (a_len+1)*(a_len+2)/2;
		int actual_sum = 0;
		for(int i=0;i<a_len;i++)
			actual_sum += a[i];
		int missing_number = sum - actual_sum;
		System.out.println(missing_number);
		
	}
	
	public static void method2(int[] a)
	{
		int a_length = a.length;
		int x1=a[0],x2=1;
		for(int i=1;i<a_length;i++)
			x1 = x1 ^ a[i];
		for(int i=2;i<=a_length+1;i++)
			x2 = x2^i;
		
		int missing = x2 ^ x1;
		System.out.println(missing);
		
		
	}
}
