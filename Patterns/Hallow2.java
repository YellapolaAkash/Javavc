package Patterns;

import java.util.Scanner;

public class Hallow2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows");
		int r=sc.nextInt();
		for(int x=1;x<=r-1;x++)
		{
			for(int y=r;y>=x;y--)
			{
				System.out.print("*");
			}
			for(int z=1;z<x;z++)
			{
				System.out.print("  ");
			}
		
		//	for(int a=1;a<x;a++)
		//	{
		//	System.out.print(" ");
		//	}
			for(int b=r;b>=x;b--)
			{
				System.out.print("*");
			}
			System.out.println(" ");	
		}
	        for(int i=1;i<=r;i++)
		{
			for(int m=1;m<=i;m++)
			{
				System.out.print("*");
			}
			for(int n=r;n>i;n--)
			{
				System.out.print("  ");
			}
		   // for(int k=4;k>i;k-- )
		 //   {
		//		System.out.print(" ");
		 //   }
			for(int l=1;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

}
