package numbers;

public class ReverseOfANumber {

	public static void main(String[] args) {
					
			int a = 123;
			int org = a ;
			int total = 0;
			
			int r;
			while(a>0)
			{
				r = a % 10;
				total = total*10 + r;
				a = a / 10;
				
			}
			
			System.out.println("Reverse of "+ org + " is: " + total);

	}

}
