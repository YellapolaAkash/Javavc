package ArrayChapter1;
import java.util.Arrays;
public class copyprime {

	public static void main(String[] args)
	{
		int a[]=new int[] {5,6,1,2,3,7},count=0,j=0;
		int b[]=new int[a.length];
		
		for(int x=0;x<a.length;x++)
		{
			count=0;
			for(int i=1;i<=a[x];i++)
			{
				if(a[x]%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				
				b[j]=a[x];
				j++;
			}
		}
		int c[]=new int[j];
	//	for(int x=0;x<a.length;x++)
	//	{
	//		System.out.println(b[x]);
	//	}
		for(int x=0;x<c.length;x++)
		{
			if(b[x]!=0)
			{
				c[x]=b[x];
			}
		}
		for(int x=0;x<c.length;x++)
		{
			System.out.println(c[x]);
		}
		System.out.println();
		Arrays.sort(a);
	    for(int x=0;x<a.length;x++)
	    {
	    	System.out.println(a[x]);
	    }
	    System.out.println();
	    int i[]=new int[] {1,2,3,5,6,7};
	   System.out.println(Arrays.equals(a, i)); 
	    

	}

}
