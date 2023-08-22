package ArrayChapter1;

public class Smallest_integerk {

	public static void main(String[] args) {
	  int a[]=new int[] {1,2,2,5,1};
	  int k=1;int temp=0,count=1,count1=0;
	  for(int x=0;x<a.length;x++)
	  {
		  for(int y=x+1;y<a.length;y++)
		  {
			  if(a[x]>a[y])
			  {
				  temp=a[y];
				  a[y]=a[x];
				  a[x]=temp;
				  
			  }
		  }
		
	  }
	  for(int var:a)
	  {
		  System.out.print(var+" ");
	  }
	  System.out.println();
	  boolean b[]=new boolean[a.length];
	  
	 for(int x=0;x<a.length;x++)
	 { 
		if(b[x]==true)
		{
			continue;
		}
		count=1;
		for(int y=x+1;y<a.length;y++)
		{
			if(a[x]==a[y])
			{
				b[y]=true;count++;
			}
		}
	if(count>=1) 
	{
		count1++;
		if(count1==k)
		{
			System.out.println();
		System.out.print(k+" smallest after del duplicating "+a[x]+" ");
		break;
		}

	}
		 
	 }
	
	
	  

	}

}
