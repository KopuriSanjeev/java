package numbers;

public class SumOfDigitsOfANumber {

	public static void main(String[] args) {
		
		int a = 123;
		int org = a ;
		int total = 0;
		
		int r;
		while(a>0)
		{
			r = a % 10;
			total = total + r;
			a = a / 10;
			
		}
		
		System.out.println("Sum of digits of "+ org + " is: " + total);

	}

}
