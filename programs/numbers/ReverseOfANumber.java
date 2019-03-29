package numbers;

public class ReverseOfANumber {

	public static void main(String[] args) {
					
			int a = 123;
			int org = a ;
			int reverse = 0;
			
			int r;
			while(a>0)
			{
				r = a % 10;
				reverse = reverse*10 + r;
				a = a / 10;
				
			}
			
			System.out.println("Reverse of "+ org + " is: " + reverse);

	}

}
