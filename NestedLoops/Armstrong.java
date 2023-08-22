package NestedLoops;
import java.util.Scanner;
public class Armstrong
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter First  Num");
		int x1=sc.nextInt();
		System.out.println("enter second num");
		int x2=sc.nextInt();
		int y=0,count=0,z,a,sum=0,Acount=0;
		
		for(;x1<=x2;x1++)
		{   count=0;
			for(y=x1;y>0;y/=10)
			{
				count++;
			}
			count=count;
            y=x1;
            sum=0;
            for(;y>0;y/=10)
            {
            	z=y%10;
            	a=(int)Math.pow(z, count);
            	sum=sum+a;
            }
            if(x1==sum)
            {    
            	Acount++;
            	System.out.println("Armstrong Num");
            }
            else
            	System.out.println("Not Armstrong");
		}
		System.out.println(Acount);
		
		
		
		
		
	}

}
