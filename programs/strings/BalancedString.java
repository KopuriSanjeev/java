import java.util.*;

/*
More details at https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
*/

class BalancedString
{
	public static void main(String[] a)
	{
		String s = "{()}";
		boolean isBalanced = balanceCheck(s);
		System.out.println(isBalanced);
	}
	
	public static boolean balanceCheck(String s)
	{
		Deque<Character> q = new ArrayDeque<Character>();
		
		for(int i = 0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			// if char is the opening braces, then push into queue and go to next char
			if(ch=='(' || ch=='{' || ch=='[')
			{
				q.push(ch);
				continue;
			}
			
			// if char is not opening means, it should be closing bracket.
			// At the time of closing bracket, queue shouldn't be empty. If it is empty then it is not a balanced string.
			if(q.isEmpty())
				return false;
			
			char top = q.pop();
			
			switch(ch)
			{
				case ')' :
					if(top=='{' || top=='[')
						return false;
					break;
				case '}' :
					if(top=='(' || top == '[')
						return false;
					break;
				case ']' :
					if(top=='(' || top=='{')
						return false;
					break;
			} //end of swtich
		} // end of for
		
		// after parsing through the entire string, queue must be empty for balanced strings.
		
		return q.isEmpty();
	}
}
