package Arrays;

public class Add {

	public static void main(String[] args)
	{
		int a[]=new int [] {1,2,3,4,5 };
		int b[]=new int[a.length];
		for(int x=0;x<a.length;x++)
		{
			if(x==0)
			{
				b[x]=a[x]+a[x+1];
				
			}
		
			
			else if(x>=0 && x<a.length-1)
			{
			b[x]=a[x-1]+a[x+1];
			
			}
			else 
			{
				b[x]=a[x-1]+a[x];
				
			}
			
		}
		for(int x=0;x<a.length;x++)
		{
			System.out.println(b[x]);
		}
		
	}

}
