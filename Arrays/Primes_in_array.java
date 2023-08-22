package Arrays;

import java.util.Scanner;

public class Primes_in_array {

	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter elements");
		int a[]=new int[6],count=0;
		for(int x=0;x<a.length;x++)
		{
			a[x]=s.nextInt();
		}
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
		System.out.println("primes are");
		for(int x=0;x<a.length;x++)
		{	count=0;
			for(int i=1;i<=a[x];i++)
			{
				if(a[x]%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(a[x]);
			}	
		}
	}

}
