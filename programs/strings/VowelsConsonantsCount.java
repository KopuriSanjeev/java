package strings;

public class VowelsConsonantsCount {
	
	public static void main(String[] args) {
		String s = "sanjeev";
		method1(s);
		method2(s);
	}
	
	public static void method1(String s)
	{
		int vowelsCount =0, consonantsCount=0;
		char ch;
		for(int i=0,n=s.length();i<n;i++)
		{
			ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
					ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				vowelsCount++;
			else
				consonantsCount++;
		}
		System.out.println("No of vowels " + vowelsCount);
		System.out.println("No of Consonants " +consonantsCount);
	}
	
	public static void method2(String s)
	{
		String vowels = "aeiouAEIOU";
		int vowelsCount =0, consonantsCount=0;
		char ch;
		for(int i=0,n=s.length();i<n;i++)
		{
			ch=s.charAt(i);
			if(vowels.indexOf(ch) != -1)
				vowelsCount++;
			else
				consonantsCount++;	
		}
		System.out.println("No of vowels " + vowelsCount);
		System.out.println("No of Consonants " +consonantsCount);
	}

}
