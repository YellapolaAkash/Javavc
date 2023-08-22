package NestedLoops;

public class Palprime {

	public static void main(String[] args) 
	{
	int x=120,y=151,z,count=0,res=0,a,b,rev=0;
	for(x=120;x<=300;x++)
	{   res=0;
		count=0;
		for(z=2;z<=x/2;z++)
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
		
		
			rev=0;
			for(a=x;a>0;a/=10)
			{
				b=a%10;
				rev=rev*10+b;
				
			}
			
		
		if(res==rev)
		{
			System.out.println("palprime" +x);
				
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		
	}
}
	


