public class LeftRotationofArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] a = new int[]{1,2,3,4,5};
		int d = 12 ;
		d = d % a.length;
		int temp ;
		
		for(int i=1;i<=d;i++)
		{
			System.out.print(i);
			
			temp = a[0];
			for(int j=1;j<a.length;j++)
			{
				a[j-1] = a[j];
			}
			a[a.length-1] = temp;
		}
		System.out.println("----");
		
		for(int i: a)
			System.out.println(i);
	
	}	
}
