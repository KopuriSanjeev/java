
public class PanagramCheck {

	public static void main(String[] args) {
		// A String is said to be Panagram if it contains all english alphabets.
		String s= "The quick brown fox jumps over the lazy dog";
		boolean b = isPanagram(s.toLowerCase());
		System.out.println(b);

	}

	public static boolean isPanagram(String s)
	{
		if(s.length()<26)
			return false;
		for(char ch='a';ch<='z';ch++)
		{
			if(s.indexOf(ch) == -1)
				return false;
		}
		return true;
	}
}

/* output is true */
