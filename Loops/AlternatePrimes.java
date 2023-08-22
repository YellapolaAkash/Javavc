package loops;

public class AlternatePrimes 
{

	public static void main(String[] args)
	{
		int count=0,count1=0;
		for(int x=1;x<=25;x++)
		{
			count=0;
			for(int a=1;a<=x;a++)
			{
			
				if(x%a==0)
				{
					count++;
				}
	     	}
			if(count==2)
			{
				count1++;
				if(count1%2!=0)
				{
					System.out.println("prime"+x);
				}
				
			}
		}
	}	
}
