 class SuperReducedString {
	 
	 /*Steve has a string of lowercase characters in range ascii[‘a’..’z’]. 
	  * He wants to reduce the string to its shortest length by doing a series of operations. 
	  * In each operation he selects a pair of adjacent lowercase letters that match, and he deletes them. 
	  * For instance, the string aab could be shortened to b in one operation.

  	 Steve’s task is to delete as many characters as possible using this method and print the resulting string. If the final string is empty, print Empty String
	
	eg: aaabccddd → abccddd → abddd → abd
  https://www.hackerrank.com/challenges/reduced-string/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=7-day-campaign
*/	
	 
	 public static void main(String[] args)
		{
			
			String s = "aaabccddd" ;
			String redString = reducedString(s.trim());
			System.out.println(redString);
		}
	 
	 public static String reducedString(String s)
	 {
		 
		 for(int i=0;i<s.length()-1;i++)
		 {
			 String temp = s.substring(0,i);
			 if(s.charAt(i) == s.charAt(i+1)){
				 
				 s = temp + s.substring(i+2) ;
				 i=-1;
				 continue;
			 }
		 }
		 
		 if(s.length() == 0)
			 s = "Empty String";
		 return s;
		 
		 
		 
	 }
    
}
