package Arrays;

public class Sum_Of_array_Elements
{

	public static void main(String[] args)
	{
		
		int a[]=new int[] {10,20,30,40},sum=0;
		for(int x=0;x<a.length;x++)
		{
			sum=sum+a[x];
			
		}
		System.out.println(sum);
		/*Mul of Array Elements
		int a[]=new int[] {10,20,30,40},pro=1;
		for(int x=0;x<a.length;x++)
		{
			pro=pro*a[x];
			
		}
		System.out.println(pro);
        */

	}

}
