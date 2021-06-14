
public class LargestOfThreeNumber
{
	public static void main(String[] args)
	{
		int a =70,b =70,c = 70;
		
		int largest = (a>b && a>c) ? a : (b>c) ? b :c ;

		System.out.println(largest);
	}
}
