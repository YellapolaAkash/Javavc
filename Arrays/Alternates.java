package ArrayChapter1;

public class Alternates {

	public static void main(String[] args)
	{
		int a[]=new int[] {1,2,3,4};
		int b[]=new int[] {5,6,7,8};
		int d[]=new int[a.length+b.length],i=0;
		for(int x=0;x<a.length;x++)
		{
			d[i]=a[x];
			i+=2;
			
		}
		
		for(int x=0,j=1 ;x<b.length;x++)
		{
			
			d[j]=b[x];
			j+=2;
			
		}
		for(int x=0;x<d.length;x++)
		{
			System.out.println(d[x]);
		}
		
		
	}

}
