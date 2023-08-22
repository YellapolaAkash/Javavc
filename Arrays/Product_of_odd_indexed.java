package Arrays;

public class Product_of_odd_indexed {

	public static void main(String[] args)
	{
		int a[]=new int[] {1,2,3,4,7,9,10,2,3},pro=1;
		for(int x=0;x<a.length;x++)
		{
			if(x%2!=0)
			{
				pro=pro*a[x];
				
			}
		}
		System.out.println(pro);
	}

}
