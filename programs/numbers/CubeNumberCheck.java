package numbers;

public class CubeNumberCheck {

	/* This program is used to check whether given number is a perfect square or not.
	 * Eg: if input is 27, then display number is a Cube.
	 *  If input is 10, then display number is not a Cube.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 64;
		int n = (int) Math.pow(num,1.0/3.0);
		
		if(num == n*n*n)
			System.out.println(num +" is a Cube number");
		else
			System.out.println(num +" is not a Cube number");
		
	}

}

/** The output of the above program is 
*	64 is not a Cube number
*/
