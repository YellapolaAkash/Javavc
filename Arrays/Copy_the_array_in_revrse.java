package Arrays;

import java.util.Scanner;

public class Copy_the_array_in_revrse {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Array elemnts are");
		int a[]=new int[5];
		int b[]=new int[a.length];
		int i=a.length-1;
		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		for(int x=0;x<a.length;x++)
		{
			b[i]=a[x];
			i--;	
		}
		for(int x=0;x<a.length;x++)
	    {
			System.out.println(a[x]+" "+b[x]);
		}
		

	

		
		

	}

}
