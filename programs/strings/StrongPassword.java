
 class StrongPassword {
	 
	 /*
	  Louise joined a social networking site to stay in touch with her friends. The signup page required her to input a name and a password. However, the password must be strong. The website considers a password to be strong if it satisfies the following criteria:

Its length is at least .
It contains at least one digit.
It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are: !@#$%^&*()-+
She typed a random string of length  in the password field but wasn't sure if it was strong. Given the string she typed, can you find the minimum number of characters she must add to make her password strong?

Note: Here's the set of types of characters in a form you can paste in your solution:

 
 
 https://www.hackerrank.com/challenges/strong-password/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=7-day-campaign&h_r=next-challenge&h_v=zen

	  */	
	 
	 public static void main(String[] args)
		{
			
			String s = "#HackerRank" ;
			int n = reducedString(s.trim());
			System.out.println(n);
		}
	 
	 public static int reducedString(String password)
	 {
		 int numbers = 0 , upper_chars = 0, lower_chars = 0, spl_chars = 0;
		 int reqString = 0;
		
		 for(int i=0,n=password.length();i<n;i++)
		 {
			 char ch = password.charAt(i);
			 if(Character.isUpperCase(ch))
				 upper_chars++;
			 else if(Character.isLowerCase(ch))
				 lower_chars++;
			 else if(Character.isDigit(ch))
				 numbers++;
			 else
				 spl_chars++;
		 }
		 
		 if(numbers == 0)
			 reqString++;
		 if(upper_chars == 0)
			 reqString++;
		 if(lower_chars == 0)
			 reqString++;
		 if(spl_chars == 0)
			 reqString++;
		 
		 if(reqString + password.length() == 4)
			 reqString += 2;
		 else if (reqString + password.length() == 5)
			 reqString += 1;
		 
		 return reqString;
	 }
    
}
