package Arrays;
import java.util.Arrays;
import java.util.Scanner;
 class NannakuPrematho {

	public static void main(String[] args) {
	System.out.println("ENter NO of PERsoNs: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i=0,j=0;
		for(int x=0;x<a.length;x++)
		{
			a[x]=x+1;
		}
		for(int y=0;y<n/2;y++)
		{
			j=0;
			int count=0;
		for(int x=0;x<a.length;x++)
		{
		//0dd
			if(i%2==0)
			{
				if(x%2==0)
				{
					a[j++]=a[x];
				}
				else
				{
					a[j++]=0;
				}
			}
			//even
			else
			{
					if(x%2!=0)
				
				{
					a[j++]=a[x];
				}
				else
				{
					a[j++]=0;
				}
			}
			
		}
		System.out.println("Before");
			for(int var:a)
		{
			System.out.print(var+" ");
		}System.out.println();

	  for(int x=0;x<a.length-1;x++)
		{
			if(a[x]==0)
				count++;
		}
		if(a[a.length-1]!=0)
		{
			i=count+1;
		}
		else
		{
				i=count+1;
		}
		System.out.println("After");
		Arrays.sort(a);
			for(int var:a)
		{
			System.out.print(var+" ");
		}System.out.println();

		if(a[a.length-2]==0)
			break;
	}
		
		System.out.println("Required "+a[a.length-1]);	
	}
 }
 
 
		