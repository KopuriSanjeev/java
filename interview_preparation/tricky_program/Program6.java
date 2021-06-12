class IFruit
{
	protected static String type = "Apple";
}
class Fruit extends IFruit
{
}

public class Program6
{
	public static void main(String[] args)
	{
		System.out.println(Fruit.type);
	}
}

/*
The output is
Apple


*/
