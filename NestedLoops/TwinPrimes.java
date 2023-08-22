package NestedLoops;

public class TwinPrimes
{
public static void main (String[]args)
{
	int res=0,res1=0,count=0;
	for(int x=3;x<=20;x++)
	{   
		count=0;
		for(int y=2;y<=x/2;y++)
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
		if(res-res1==2)
		{
			
			System.out.println(res1+","+res);
			
			
		}
		res1=res;
	}
}
}
