package NestedLoops;
import java.util.Scanner;
public class EvilNumberrange
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int first=sc.nextInt();
		System.out.println("enter the second number");
		int second=sc.nextInt();
		int n1,sum=0,x=0,y=0,z=0;
		for(x=first;x<=second;x++)            // 9>9*9=81>8+1=9;
		{
	    n1=0;
		n1=x*x;
		sum=0;
		for(z=n1;n1>0;n1/=10)
		{
			y=n1%10;
			sum=sum+y;
		}
		if(sum==x) {
			System.out.println("evil numbers are:" +x);
		}
		
     	}
	}
	

}
