package NestedLoops;

import java.util.Scanner;

public class Palprimefst10 {

	public static void main(String[] args) {
		int x,y,count=0,res=0,a,b,rev=0,count1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first num");
		int n1=sc.nextInt();
		System.out.println("enter second num");
		int n2=sc.nextInt();
		System.out.println("enter the value ");
		int k=sc.nextInt();
		
		for (x=n1;x<=n2;x++)
		{   
			count=0;
			for(y=2;y<=x/2;y++)
			{
				if(x%y==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				res=x;
			}
			rev=0;
			for(a=x;a>0;a/=10)
			{
				b=a%10;
				rev=rev*10+b;
			}
			if(res==rev)
			{
				count1++;
				if(count1<=k)
				{
					System.out.println(x);
				}
			}
		}

	}

}

