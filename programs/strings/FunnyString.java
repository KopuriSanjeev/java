
/*
https://www.hackerrank.com/challenges/funny-string/problem

In this challenge, you will determine whether a string is funny or not. To determine whether a string is funny, create a copy of the string in reverse e.g. . Iterating through each string, compare the absolute difference in the ascii values of the characters at positions 0 and 1, 1 and 2 and so on to the end. If the list of absolute differences is the same for both strings, they are funny.

Determine whether a give string is funny. If it is, return Funny, otherwise return Not Funny.

For example, given the string , the ordinal values of the charcters are .  and the ordinals are . The absolute differences of the adjacent elements for both strings are , so the answer is Funny.

*/

public class FunnyString  {

	
    public static void main(String args[])  
    { 
    	String s1 = "bcxz" ;
    	String s2 = reverse(s1);
    	String result = "Funny"; 
    	
    	char[] ch1 = s1.toCharArray();
    	char[] ch2 = s2.toCharArray();
    	
    	for(int i=0;i<=ch1.length-2;i++){
    		if(Math.abs(ch1[i+1] - ch1[i]) != Math.abs(ch2[i+1] - ch2[i]))
    		{
    			result = "Not Funny";
    			break;
    		}
    	}
    	System.out.println(result);
    	
    	
    }
    
    public static String reverse(String s)
    {
    	StringBuffer sb = new StringBuffer(s);
    	sb.reverse();
    	return sb.toString();
    	
    }
    
    
    
}
