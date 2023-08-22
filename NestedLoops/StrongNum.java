package NestedLoops;

public class StrongNum 
{

public static void main(String[]args)
{
	int n,y=0,x,z=0,fact=1,sum=0;
	for(x=1;x<=1000;x++)
	{
	n=x;
	sum=0;               //145>5!=120,4!=24,1=1,120+24+1=145
	for(;n>0;n/=10)
	{
		z=n%10;
	    fact=1;
		for(y=1;y<=z;y++)
		{
			fact=fact*y;
			
		}
		sum=sum+fact;
	}
        if(sum==x)
        {
	       System.out.println("strong num:" +x);
        }
	}
}
}
