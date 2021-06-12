
public class Program7
{
	public static void main(String[] args)
	{
		final class Constants { public static String name ="PI" ;}

		Thread thread = new Thread(new Runnable(){
			
			@Override
			public void run()
			{
				System.out.println(Constants.name);
			}
		}
		);
		thread.start();
	
	}
}


/*
The output is 
PI


*/
