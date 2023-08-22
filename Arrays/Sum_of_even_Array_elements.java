package Arrays;

public class Sum_of_even_Array_elements {

	public static void main(String[] args)
	{
		int a[]=new int[] {1,2,3,4,7,9,10,2,3},sum=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%2==0)
			{
				sum=sum+a[x];
			}
		}
		System.out.println(sum);
	}

}
