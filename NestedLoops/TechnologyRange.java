package NestedLoops;

import java.util.Scanner;

public class TechnologyRange {

	public static void main(String[] args) 
	{
		int count=0,count1=0,s=0,n=0,n1=0,n2=0,num=0,num1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int x=sc.nextInt();
		System.out.println("enter second number");
		int y=sc.nextInt();
		for(;x<=y;x++)                    //2025>20+25>45>45*45=2025
		{	
		count=0;
		for(n=x;n>0;n/=10)
		{
			count++;
		}
		if(count%2==0)
		{
			count1=0;
	        count1=count/2;
	        s=(int)Math.pow(10, count1);
	        n1=x%s;
	        n2=x/s;
	        num=n1+n2;
	        num1=num*num;
	        if(x==num1)
	        	System.out.println("Technology number are : " +x);
			
			
		    } 
		}
     }

}

