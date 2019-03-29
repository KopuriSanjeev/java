package numbers;

public class NumberPalindromeCheck {

	public static void main(String[] args) {
		
		int a = 12321;
		int org = a ;
		int reverse = 0;
		
		int r;
		while(a>0)
		{
			r = a % 10;
			reverse = reverse*10 + r;
			a = a / 10;
			
		}
		if(reverse == org)
			System.out.println(org +" is a Palindrome number");
		else
			System.out.println(org +" is not a Palindrome number");

	}

}
