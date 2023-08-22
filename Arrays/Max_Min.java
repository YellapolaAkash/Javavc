package ArrayChapter1;

public class Max_Min {

	public static void main(String[] args) 
	{
    /*
	int a[]=new int[] {1,9,7,6,11},i=0,j=0;
     for(int x=0;x<a.length;x++)
     {
    	if(a[x]>i)
    	{
    		i=a[x];
    	}
     }
     System.out.println(i);
     j=i;
     for(int x=0;x<a.length;x++)
     {
    	 if(j>a[x])
    	 {
    		 j=a[x];
    	 }
     }
     System.out.println(j);
     */
		int a[]=new int[] {1,9,7,6,11},b=a[0],c=a[0];
		for(int x=1;x<a.length;x++)
		{
			if(b<a[x])
			{
				b=a[x];
			}
			if(c>a[x])
			{
				c=a[x];
			}
		}
		System.out.println(b);
		System.out.println(c);
	}
}


