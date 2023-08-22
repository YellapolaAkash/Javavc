package loops;

public class FactorialOfPrime {

	public static void main(String[] args) 
	{
		int n=1734,temp=n,rem=0,count=0,res=0,fact=1;
		for(;n>0;n/=10)
		{
			fact=1;
			rem=n%10;
			count=0;
			for(int a=1;a<=rem;a++)
			{
				
				
				if(rem%a==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				res=rem;
				System.out.println("fact of " +res);
				while(res>=1)
				{
					fact=fact*res;
					res--;
				}
				System.out.println(fact );
				
			}
			
		}
	}

}
