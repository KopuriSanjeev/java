package strings;

public class PrintAllSubstrings {

	public static void main(String[] args) {
		String s = "abcd";
		
		for(int i=0,n=s.length();i<n;i++)
		{
			for(int j=i+1,p=s.length();j<=p;j++)
			{
				System.out.println(s.substring(i,j));
			}
		}

	}

}
