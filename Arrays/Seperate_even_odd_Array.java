package Arrays;

public class Seperate_even_odd_Array {

	public static void main(String[] args)
	{
	   int a[]=new int[] {1,2,3,4,5,6,7,8};
	   int b[]=new int[a.length],i=0,j=(a.length-1)/2+1;
	   for(int x=0;x<a.length;x++)
	   {
		   if(x%2==0)
		   {
			   b[i]=a[x];
			   i++;
		   }
		   else
		   {
			   b[j]=a[x];
			   j++;
		   }
	   }
	   for(int x=0;x<a.length;x++)
	   {
		   System.out.print(b[x]);
	   }  
	}

}
