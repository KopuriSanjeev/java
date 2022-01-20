package strings;

public class RotateStringsCheck {

	public static void main(String[] args) {
		String s1="abcd",s2="cdba";
		
		System.out.println(isRotated1(s1,s2));
		System.out.println(isRotated2(s1,s2));

	}

	public static boolean isRotated1(String s1, String s2)
	{
		String concat;
		if(s1==null || s2==null)
			return false;
		else if(s1.length()!=s2.length())
			return false;
		concat = s1+s1;
		return concat.contains(s2);
	}
	
	
	public static boolean isRotated2(String s1, String s2)
	{
		String concat;
		if(s1==null || s2==null)
			return false;
		else if(s1.length()!=s2.length())
			return false;
		concat = s1+s1;
		if(concat.indexOf(s2) != -1)
			return true;
		else
			return false;
	}
}
