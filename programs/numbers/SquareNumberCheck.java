package numbers;

public class SquareNumberCheck {

	/* This program is used to check whether given number is a perfect square or not.
	 * Eg: if input is 4, then display number is a square.
	 *  If input is 10, then display number is not a square.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		int n = (int) Math.sqrt(num);
		
		if(num == n*n)
			System.out.println(num +" is a square number");
		else
			System.out.println(num +" is not a square number");
		
	}

}
