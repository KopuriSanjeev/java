package numbers;

public class ArmstrongNumberCheck {

	/*
	 * An Number is said to be Armstrong number if sum of cubes of digits of a number is equal to the number itself.
	 * Eg: 153 .( 1*1*1 + 5*5*5 + 3*3*3 = 153) 
	 */
	
	public static void main(String[] args) {
		
		int a = 153;
		int total = 0;
		int org = a,r,q;
		
		while(a>0)
		{
			r = a % 10; 
			total = total + (int)Math.pow(r, 3);  // total = total + r*r*r
			a = a / 10;
				
		}
		if(total == org)
			System.out.println(org +" is an Armstrong Number");
		else
			System.out.println(org +" is not an Armstrong Number");

	}

}
