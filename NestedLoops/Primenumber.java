package NestedLoops;
import java.util.Scanner;
public class Primenumber 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first num");
		int x1=sc.nextInt(),count1=0,sum=0,count=0,y,z=0,res=0;
		System.out.println("Enter second num");
		int x2=sc.nextInt(),temp=x2,temp1=x2,m=0;
		for(;x1<=x2;x1++)
		{   
			count=0;
			for(y=2;y<=x1/2;y++)
			{
				if(x1%y==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				count1++;
				sum=sum+x1;
				res=x1;
				System.out.println(x1);	
				if(res<temp)
				{
					z=res;
				}
				if(res<temp1)
				{
					temp1=res;
				}
			}	
		}
		
		System.out.println("sum of primes from n1 to n2:"+sum);
		System.out.println("Count of primes from n1 to n2:"+count1);
		System.out.println("Highest prime:"+res);
	    System.out.println("smallest prime:"+temp1);
	    System.out.println("second largest prime:" +z);   	
	}
}
