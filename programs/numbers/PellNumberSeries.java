package numbers;

public class PellNumberSeries {

	/**In mathematics, the Pell numbers are an infinite sequence of integers. 
	 * The sequence of Pell numbers starts with 0 and 1, and then each Pell number is the sum of twice the previous Pell number and the Pell number before that.
	 * Thus, 70 is the companion to 29, and 70 = 2 × 29 + 12 = 58 + 12.
	 * The first few terms of the sequence are :
	 * 0, 1, 2, 5, 12, 29, 70, 169, 408, 985, 2378, 5741, 13860,…
	 */
	
	public static void main(String[] args) {
		// In this program we will print first 20 numbers of Pell Series.
		int n = 20, a = 0, b = 1, c ;  // where a and b are first 2 numbers of Pell series.
		
		System.out.println("First "+ n +" numbers in Pell Series are...");
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=3;i<=20;i++)  //Starting loop from i = 3, as already 2 numbers of Pell series got printed and need to print only 18 numbers.
		{
			c = 2*b + a;
			System.out.print(c+" ");
			a = b ;
			b = c ;
		}

	}

}


/**  Output of above program is:
 * 		
 * 	 First 20 numbers in Pell Series are...
 *	 0 1 2 5 12 29 70 169 408 985 2378 5741 13860 33461 80782 195025 470832 1136689 2744210 6625109 
 */

