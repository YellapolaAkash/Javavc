package ArrayChapter1;

public class combine_two_Arrays {

	public static void main(String[] args)
	{
		int a[]=new int[] {1,2,3,4};
		int b[]=new int[] {5,6,7,8};
		int c[]=new int[a.length+b.length],i=0,j=0;
		for(int x=0;x<a.length;x++ )
		{
			c[i]=a[x];
	        i++;
		}
	
		for(int x=0;x<b.length;x++)
		{
			c[i]=b[x];
			i++;
		}
		for(int x=0;x<c.length;x++)
		{
			System.out.println(c[x]);
		}
	}

}
