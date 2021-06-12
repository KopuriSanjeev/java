interface IFruit
{
	public String type = "Apple";
}
class Fruit implements IFruit
{
}

public class Program5
{
	public static void main(String[] args)
	{
		System.out.println(Fruit.type);
	}
}




/*
The output is 
Apple

Explanation:
IFruit is an interface and Fruits class implements it.
So type string is available in Fruit class as well which is an static string.
By default variables in Interface are public,static and final.
By default methods in Interface are public and abstract. (From java8 onwards default and static methods are also allowed)
So from Program5 class we can access static type of variable type.

*/
