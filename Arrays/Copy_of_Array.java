package Arrays;

import java.util.Scanner;

public class Copy_of_Array {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Array elemnts are");
		int a[]=new int[5];
		int b[]=new int[a.length];
		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		for(int x=0;x<a.length;x++)
		{
			b[x]=a[x];
			
		}
		for(int x=0;x<a.length;x++)
		{
			System.out.println(+a[x]+" "+b[x]);
		}
		System.out.println("Second half reverse");
		for(int x=0;x<=(a.length-1)/2;x++)
		{
			System.out.println( +b[x]);
		}
		for(int x=a.length-1;x>=((a.length-1)/2)+1;x--)
        {
	        System.out.println(b[x]);
        }
		System.out.println("first half reverse");
		for(int x=(a.length-1)/2;x>=0;x--)
		{
			System.out.println(b[x]);
		}
		for(int x=((a.length-1)/2)+1;x<a.length;x++)
		{
			System.out.println(b[x]);
		}
	}

}

