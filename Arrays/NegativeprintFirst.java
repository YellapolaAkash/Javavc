package ArrayChapter1;

public class NegativeprintFirst {

	public static void main(String[] args)
	{
	   int a[]=new int[] {-1,5,-8,-2,7,-3,6};
	  
	   for(int x=0;x<a.length;x++)
	   {
		   if(a[x]<0)
		   {
			  System.out.println(a[x]);
		   }
		   
	   }
	   for(int x=0;x<a.length;x++)
	   {
		   if(a[x]>0)
		   {
			  System.out.println(a[x]);
		   }
		   
	   }
	}

}
