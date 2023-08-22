package NestedLoops;

public class ArmPrime {

	public static void main(String[] args) {
	int x,count=0,y,b,sum=0,res=0,rev=0;
	for(x=1;x<=153;x++)
	{
		count=0;
		for(int a=x;a>0;a/=10)
		{
			count++;
		}
		sum=0;
		for(y=x;y>0;y/=10)
		{
			b=y%10;
			sum=sum+(int)Math.pow(b, count);	
		}
		if(x==sum)
		{
			rev=x;
		}
		count=0;
		for(int z=2;z<=x/2;z++)
		{
			if(x%z==0)
			{
				count++;
			}
		}
			if(count==0)
			{
				res=x;
			}
		
		if(res==rev) 
		{
		System.out.println(res);
			
		}
		
	}

	}

}
