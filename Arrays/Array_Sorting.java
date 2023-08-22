package ArrayChapter1;

public class Array_Sorting {

	public static void main(String[] args) 
	{
		int a[]=new int[] {1,3,4,2,5};
		for(int x=0;x<a.length;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]>a[y])
				{
					a[x]=a[x]+a[y];
					a[y]=a[x]-a[y];
					a[x]=a[x]-a[y];
				}
			}
			
		}
		for(int var:a)
		{
			System.out.println(var);
		}
	}

}
