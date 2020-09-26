
/*
https://www.hackerrank.com/challenges/mars-exploration/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign

Sami's spaceship crashed on Mars! She sends a series of SOS messages to Earth for help.
Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal received by Earth as a string, , determine how many letters of Sami's SOS have been changed by radiation.

For example, Earth receives SOSTOT. Sami's original message was SOSSOS. Two of the message characters were changed in transit.

*/

public class MarsExploration  {

	
    public static void main(String args[])  
    { 
    	String s = "SOSSRS";
    	int wrong = 0;
    	for(int i=0,n=s.length();i<n;i++)
    	{
    		char ch = s.charAt(i);	
    		if(i%3 == 0 ||  i%3 == 2)
    		{
    			if(ch != 'S')
    				wrong++;
    		}
    		else if(i%3 == 1){
    			if(ch != 'O')
    				wrong++;
    		}
    		
  	
    	}
    	System.out.println(wrong);
    	
    }
    
    
    
}
