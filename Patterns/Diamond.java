package Patterns;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num of rows");
		int r=sc.nextInt();
		for(int x=1;x<=r;x++)
		{
			for(int y=r;y>x;y--)
			{
				System.out.print(" ");
			}
			for(int z=1;z<=x;z++)
			{
				System.out.print("*");
			}
			for(int a=1;a<x;a++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int b=1;b<=r-1;b++)
		{
			for(int c=1;c<=b;c++)
			{
				System.out.print(" ");
			}
			for(int d=r-1;d>=b;d--)
			{
				System.out.print("*");
			}
			for(int e=r-1;e>b;e--)
		    {
				System.out.print("*"); 
			}
			System.out.println("    ");
		}
		
		}

}
