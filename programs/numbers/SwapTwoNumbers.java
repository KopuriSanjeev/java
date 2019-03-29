package numbers;

public class SwapNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Values before swap: " + "a="+a + " b="+b);
		
		//method1. Using temp variable to swap two numbers.
		method1(a,b);
	
		//method2. Without using temp variable.
		method2(a,b);
		
		//method3.  Without using temp variable and in single line.
		method3(a,b);

	}
	
	//method1. Using temp variable to swap two numbers.
	public static void method1(int a,int b)
	{
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Values after swap using method1: " + "a="+a + " b="+b);
	}

	//method2. Without using temp variable.
	public static void method2(int a,int b)
	{
		//input a=10,b=20. Output a=20,b=10.
		a = a+b;	// a=30 b=20
		b = a-b;	// a=30 b=10
		a = a-b;	// a=20 b=10
		
		System.out.println("Values after swap using method2: " + "a="+a + " b="+b);
	}
	
	//method3.  Without using temp variable and in single line.
	public static void method3(int a,int b)
	{
		b = (a+b) - (a=b);
		System.out.println("Values after swap using method3: " + "a="+a + " b="+b);
	}
}
