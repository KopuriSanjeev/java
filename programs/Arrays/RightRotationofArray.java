
public class RightRotationofArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] a = new int[]{1,2,3,4,5};
		int rotations = 2 ;
		rotations = rotations % a.length; // 12 rotations is equal to 2 rotations if array length is 5 
		int temp ;
		
		for(int i=1;i<=rotations;i++)	// no of rotations
		{
			
			temp = a[a.length-1];
			for(int j=a.length-2;j>=0;j--)
			{
				a[j+1] = a[j];
			}
			a[0] = temp;
		}
		
		for(int i: a)
			System.out.println(i);	
	}	
}
