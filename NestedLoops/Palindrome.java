package NestedLoops;
import java.util.Scanner;
public class Palindrome 
{

	public static void main(String[] args)
	{   int y,x=0,res=0,rev=0,count=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the first number");
		int x1=sc.nextInt();
		System.out.println("enter the second number");
		int x2=sc.nextInt();
		for(;x1<=x2;x1++)
		{  
			rev=0;
			for(y=x1;y>0;y/=10)
			{
				x=y%10;
				rev=rev*10+x;
			}
			if (x1==rev)
			{
				res=x1;//to find highest palindrome num
				System.out.println("Palindrome"+" "+x1);
			}
			else
			{
				System.out.println("Not Palindrome"+" "+x1);
			}
		}
		System.out.println(res);	//highest palindrome number
	}

}
