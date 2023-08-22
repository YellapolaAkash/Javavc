package Arrays;

public class Flag {

	public static void main(String[] args)
	{
		int a[]=new int[] {1,2,3,4,5,6,-1,0};
		int flag=5;
		for(int x=0;x<a.length;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(flag==a[x]+a[y])
				{
					System.out.println(+a[x]+" "+a[y] );
				}
			}
		}
		
	}

}
