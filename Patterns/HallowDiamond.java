package Patterns;

import java.util.Scanner;

public class HallowDiamond {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter rows");
    int r=sc.nextInt();
    for(int x=1;x<=r;x++)
    {
    	for(int a=1;a<=r;a++)
    	{
    		if(x+a==r+1)
    		{
    			System.out.print("*");
    		}
    		else
    		{
    			System.out.print(" ");
    		}
    		
    	}
    	for(int b=2;b<=r;b++)
    	{
    		if(x-b==0)
    		{
    			System.out.print("*");
    		}
    		else
    		{
    			System.out.print(" ");
    		}
    		
    	}
    	System.out.println(" ");
    	
    }
    for(int i=1;i<=r-1;i++)
    {
    	for(int j=1;j<=r-1;j++)
    	{
    		if(i-j==0)
    		{
    			System.out.print(" *");
    		}
    		else
    		{
    			System.out.print(" ");
    		}
    		
    	}
    	for(int k=2;k<=(r-1);k++)
    	{
    		if(i+k==r)
    		{
    			System.out.print("*");
    		}
    		else
    		{
    			System.out.print(" ");
    		}
    		
    	}
    	System.out.println(" ");
    }

	}

}
